package com.github.samakays.stf.models.device;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class DeviceResponse {
    private boolean success;
    private Device device;

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
