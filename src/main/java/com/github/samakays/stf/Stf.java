package com.github.samakays.stf;


import com.github.samakays.stf.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class Stf {
    private String baseUrl;
    private String authToken;
    private OkHttpClient client;
    private Gson gson;
    private Utils utils;

    public Stf(String baseUrl, String authToken) {
        this.baseUrl = baseUrl;
        this.authToken = authToken;
        client = new OkHttpClient();
        gson = new GsonBuilder().create();
        utils = new Utils();
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public OkHttpClient getClient() {
        return client;
    }

    public void setClient(OkHttpClient client) {
        this.client = client;
    }

    public Gson getGson() {
        return gson;
    }

    public void setGson(Gson gson) {
        this.gson = gson;
    }

    public Utils getUtils() {
        return utils;
    }

    public void setUtils(Utils utils) {
        this.utils = utils;
    }
}
