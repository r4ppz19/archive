package com.r4ppz.model;

public class DefaultUser {
    private String username = "r4ppz";
    private String password = "12312005";

    private static DefaultUser defaultUser;

    private DefaultUser() {

    }

    public static DefaultUser getInstancDefaultUser() {
        if (defaultUser == null) {
            defaultUser = new DefaultUser();
        }

        return defaultUser;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
