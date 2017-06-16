package com.github.samakays.stf.models.user;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class DeviceListActiveTabs {
    private boolean details;
    private boolean icons;

    public boolean isDetails() {
        return details;
    }

    public void setDetails(boolean details) {
        this.details = details;
    }

    public boolean isIcons() {
        return icons;
    }

    public void setIcons(boolean icons) {
        this.icons = icons;
    }
}
