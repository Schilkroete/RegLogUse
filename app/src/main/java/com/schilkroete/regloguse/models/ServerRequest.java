package com.schilkroete.regloguse.models;

/**
 * Created by Schilkroete on 08.01.2017.
 */

public class ServerRequest {

    private String operation;
    private User user;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
