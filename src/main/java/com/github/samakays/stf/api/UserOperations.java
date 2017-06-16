package com.github.samakays.stf.api;

import com.github.samakays.stf.Stf;
import com.github.samakays.stf.models.device.DeviceListResponse;
import com.github.samakays.stf.models.device.DeviceResponse;
import com.github.samakays.stf.models.user.GenericResponse;
import com.github.samakays.stf.models.user.RemoteConnectResponse;
import com.github.samakays.stf.models.user.UserResponse;
import com.github.samakays.stf.utils.HttpRequest;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class UserOperations {
    private final Stf stf;
    private HttpRequest httpRequest;

    public UserOperations(Stf stf) {
        this.stf = stf;
        httpRequest = new HttpRequest();
    }

    public String adbConnect(String connectUrl) {
        return stf.getUtils().runCmd("adb connect " + connectUrl);
    }

    public GenericResponse addDevice(String deviceSerial) {
        String json = "{\"serial\": \"" + deviceSerial + "\"}";
        String response = httpRequest.post(stf.getBaseUrl() + "/api/v1/user/devices", stf.getAuthToken(), json);
        return stf.getGson().fromJson(response, GenericResponse.class);
    }

    public GenericResponse deleteDevice(String deviceSerial) {
        String response = httpRequest.delete(stf.getBaseUrl() + "/api/v1/user/devices/" + deviceSerial, stf.getAuthToken());
        return stf.getGson().fromJson(response, GenericResponse.class);
    }

    public String getAccessTokens() {
        return httpRequest.get(stf.getBaseUrl() + "/api/v1/user/accessTokens", stf.getAuthToken());
    }

    public UserResponse getUser() {
        String response = httpRequest.get(stf.getBaseUrl() + "/api/v1/user", stf.getAuthToken());
        return stf.getGson().fromJson(response, UserResponse.class);
    }

    public DeviceListResponse getUserAllDevices() {
        String response = httpRequest.get(stf.getBaseUrl() + "/api/v1/user/devices", stf.getAuthToken());
        return stf.getGson().fromJson(response, DeviceListResponse.class);
    }

    public DeviceResponse getUserDevice(String deviceSerial) {
        String response = httpRequest.get(stf.getBaseUrl() + "/api/v1/user/devices/" + deviceSerial, stf.getAuthToken());
        return stf.getGson().fromJson(response, DeviceResponse.class);
    }

    public RemoteConnectResponse remoteConnect(String deviceSerial) {
        String response = httpRequest.post(stf.getBaseUrl() + "/api/v1/user/devices/" + deviceSerial + "/remoteConnect", stf.getAuthToken(), "");
        return stf.getGson().fromJson(response, RemoteConnectResponse.class);
    }

    public GenericResponse remoteDisconnect(String deviceSerial) {
        String response = httpRequest.delete(stf.getBaseUrl() + "/api/v1/user/devices/" + deviceSerial + "/remoteConnect", stf.getAuthToken());
        return stf.getGson().fromJson(response, GenericResponse.class);
    }

}
