package com.github.samakays.stf.utils;

import okhttp3.*;
import java.io.IOException;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class HttpRequest {
    private OkHttpClient client;

    public HttpRequest() {
        client = new OkHttpClient();
    }

    public String delete(String url, String authToken) {
        Request request = new Request.Builder()
                .addHeader("Authorization", "Bearer " + authToken)
                .addHeader("Content-Type", "application/json")
                .url(url)
                .delete()
                .build();

        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String get(String url, String authToken) {
        Request request = new Request.Builder()
                .addHeader("Authorization", "Bearer " + authToken)
                .addHeader("Content-Type", "application/json")
                .url(url)
                .build();

        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String post(String url, String authToken, String json) {
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), json);
        Request request = new Request.Builder()
                .addHeader("Authorization", "Bearer " + authToken)
                .addHeader("Content-Type", "application/json")
                .url(url)
                .post(requestBody)
                .build();

        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
