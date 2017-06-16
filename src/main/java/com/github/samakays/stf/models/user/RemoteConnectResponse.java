package com.github.samakays.stf.models.user;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class RemoteConnectResponse {
    private boolean success;
    private String remoteConnectUrl;

    public String getRemoteConnectUrl() {
        return remoteConnectUrl;
    }

    public void setRemoteConnectUrl(String remoteConnectUrl) {
        this.remoteConnectUrl = remoteConnectUrl;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
