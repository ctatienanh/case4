package com.example.producttestcase4.model;

public class UserLogin {
    private String role;
    private String token;

    public UserLogin(String role, String token) {
        this.role = role;
        this.token = token;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}