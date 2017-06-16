package com.github.samakays.stf.models.device;

import java.util.List;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class Browser {
    private List<App> apps;
    private boolean selected;

    public List<App> getApps() {
        return apps;
    }

    public void setApps(List<App> apps) {
        this.apps = apps;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
