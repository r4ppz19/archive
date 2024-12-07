package com.r4ppz.model;

public class UserPassModel {
    private String username;
    private String passwod;

    public UserPassModel() {}

    public UserPassModel(String username, String password) {
        this.username = username;
        this.passwod = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.passwod = password;
    }

    public String getUsername() {
        return username;
    } 

    public String getPassword() {
        return passwod;
    }
}
