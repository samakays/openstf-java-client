package com.github.samakays.stf.models.device;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class CPU {
    private int cores;
    private double freq;
    private String name;

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getFreq() {
        return freq;
    }

    public void setFreq(double freq) {
        this.freq = freq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
