package com.r4ppz.model;

public class UserModel {
    private String username;
    private String passwod;

    public UserModel() {}

    public UserModel(String username, String password) {
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
