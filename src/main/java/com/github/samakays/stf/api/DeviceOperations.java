package com.github.samakays.stf.api;

import com.github.samakays.stf.Stf;
import com.github.samakays.stf.models.device.Device;
import com.github.samakays.stf.models.device.DeviceListResponse;
import com.github.samakays.stf.models.device.DeviceResponse;
import com.github.samakays.stf.utils.HttpRequest;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class DeviceOperations {
    private final Stf stf;
    private HttpRequest httpRequest;

    public DeviceOperations(Stf stf) {
        this.stf = stf;
        httpRequest = new HttpRequest();
    }

    public DeviceListResponse getAllDevices() {
        String response = httpRequest.get(stf.getBaseUrl() + "/api/v1/devices", stf.getAuthToken());
        return stf.getGson().fromJson(response, DeviceListResponse.class);
    }

    public DeviceResponse getDevice(String deviceSerial) {
        String response = httpRequest.get(stf.getBaseUrl() + "/api/v1/devices/" + deviceSerial, stf.getAuthToken());
        return stf.getGson().fromJson(response, DeviceResponse.class);
    }

    public Device getDeviceFromList(String model) {
        DeviceListResponse deviceListResponse = getAllDevices();
        if (deviceListResponse != null && deviceListResponse.getDevices().size() > 0) {
            for (Device device : deviceListResponse.getDevices()) {
                if (model.equals(device.getModel())) {
                    return device;
                }
            }
        }
        return null;
    }

    public String getDeviceSerial(String model) {
        Device device = getDeviceFromList(model);
        return device.getSerial();
    }

}
