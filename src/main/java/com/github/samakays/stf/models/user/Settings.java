package com.github.samakays.stf.models.user;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class Settings {
    private DeviceListActiveTabs deviceListActiveTabs;
    private String lastUsedDevice;

    public DeviceListActiveTabs getDeviceListActiveTabs() {
        return deviceListActiveTabs;
    }

    public void setDeviceListActiveTabs(DeviceListActiveTabs deviceListActiveTabs) {
        this.deviceListActiveTabs = deviceListActiveTabs;
    }

    public String getLastUsedDevice() {
        return lastUsedDevice;
    }

    public void setLastUsedDevice(String lastUsedDevice) {
        this.lastUsedDevice = lastUsedDevice;
    }
}
