package com.example.producttestcase4.model;

public class UserLogin {
    private String role;
    private String token;
    private String userName;

    public UserLogin(String role, String token, String userLogin) {
        this.role = role;
        this.token = token;
        this.userName = userLogin;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
