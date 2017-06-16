package com.github.samakays.stf.models.device;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class Display {
    private double density;
    private double fps;
    private int height;
    private int id;
    private int rotation;
    private boolean secure;
    private double size;
    private String url;
    private int width;
    private double xdpi;
    private double ydpi;

    public double getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }

    public double getFps() {
        return fps;
    }

    public void setFps(double fps) {
        this.fps = fps;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getXdpi() {
        return xdpi;
    }

    public void setXdpi(double xdpi) {
        this.xdpi = xdpi;
    }

    public double getYdpi() {
        return ydpi;
    }

    public void setYdpi(double ydpi) {
        this.ydpi = ydpi;
    }

    public boolean isSecure() {
        return secure;
    }

    public void setSecure(boolean secure) {
        this.secure = secure;
    }
}
