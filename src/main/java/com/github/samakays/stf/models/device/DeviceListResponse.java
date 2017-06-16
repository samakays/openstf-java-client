package com.github.samakays.stf.models.device;

import java.util.List;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class DeviceListResponse {
    private boolean success;
    private List<Device> devices;

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
