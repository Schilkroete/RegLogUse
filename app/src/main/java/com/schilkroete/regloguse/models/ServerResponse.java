package com.schilkroete.regloguse.models;

/**
 * Created by Schilkroete on 08.01.2017.
 */

public class ServerResponse {

    private String result;
    private String message;
    private User user;

    public String getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}