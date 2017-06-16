package com.github.samakays.stf.models.device;

import java.util.List;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class Device {
    private String abi;
    private boolean airplaneMode;
    private Battery battery;
    private Browser browser;
    private String channel;
    private String createdAt;
    private Display display;
    private String manufacturer;
    private String model;
    private Network network;
    private String operator;
    private Owner owner;
    private Phone phone;
    private String platform;
    private String presenceChangedAt;
    private boolean present;
    private String product;
    private Provider provider;
    private boolean ready;
    private boolean remoteConnect;
    private String remoteConnectUrl;
    private List<ReverseForward> reverseForwards;
    private String sdk;
    private String serial;
    private int status;
    private String statusChangedAt;
    private String version;
    private String name;
    private String releaseAt;
    private String image;
    private CPU cpu;
    private Memory memory;
    private boolean using;

    public String getAbi() {
        return abi;
    }

    public void setAbi(String abi) {
        this.abi = abi;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPresenceChangedAt() {
        return presenceChangedAt;
    }

    public void setPresenceChangedAt(String presenceChangedAt) {
        this.presenceChangedAt = presenceChangedAt;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getReleaseAt() {
        return releaseAt;
    }

    public void setReleaseAt(String releaseAt) {
        this.releaseAt = releaseAt;
    }

    public String getRemoteConnectUrl() {
        return remoteConnectUrl;
    }

    public void setRemoteConnectUrl(String remoteConnectUrl) {
        this.remoteConnectUrl = remoteConnectUrl;
    }

    public List<ReverseForward> getReverseForwards() {
        return reverseForwards;
    }

    public void setReverseForwards(List<ReverseForward> reverseForwards) {
        this.reverseForwards = reverseForwards;
    }

    public String getSdk() {
        return sdk;
    }

    public void setSdk(String sdk) {
        this.sdk = sdk;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusChangedAt() {
        return statusChangedAt;
    }

    public void setStatusChangedAt(String statusChangedAt) {
        this.statusChangedAt = statusChangedAt;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isAirplaneMode() {
        return airplaneMode;
    }

    public void setAirplaneMode(boolean airplaneMode) {
        this.airplaneMode = airplaneMode;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public boolean isRemoteConnect() {
        return remoteConnect;
    }

    public void setRemoteConnect(boolean remoteConnect) {
        this.remoteConnect = remoteConnect;
    }

    public boolean isUsing() {
        return using;
    }

    public void setUsing(boolean using) {
        this.using = using;
    }
}
