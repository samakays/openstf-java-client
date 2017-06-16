package com.github.samakays.stf.models.user;

import java.util.List;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class User {
    private List<AdbKey> adbKeys;
    private String createdAt;
    private String email;
    private List<Forward> forwards;
    private String group;
    private String ip;
    private String lastLoggedInAt;
    private String name;
    private Settings settings;

    public List<AdbKey> getAdbKeys() {
        return adbKeys;
    }

    public void setAdbKeys(List<AdbKey> adbKeys) {
        this.adbKeys = adbKeys;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Forward> getForwards() {
        return forwards;
    }

    public void setForwards(List<Forward> forwards) {
        this.forwards = forwards;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLastLoggedInAt() {
        return lastLoggedInAt;
    }

    public void setLastLoggedInAt(String lastLoggedInAt) {
        this.lastLoggedInAt = lastLoggedInAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }
}
