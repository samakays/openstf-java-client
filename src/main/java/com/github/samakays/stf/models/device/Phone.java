package com.github.samakays.stf.models.device;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class Phone {
    private String iccid;
    private String imei;
    private String network;
    private String phoneNumber;

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
