package com.github.samakays.stf.models.user;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class AdbKey {
    private String fingerprint;
    private String title;

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
