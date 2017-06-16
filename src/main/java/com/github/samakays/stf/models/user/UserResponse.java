package com.github.samakays.stf.models.user;

/**
 * Part of openstf-java-client
 * Created by samakays on 16/06/2017.
 */
public class UserResponse {
    private boolean success;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
