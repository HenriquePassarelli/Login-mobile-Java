package com.example.myapplication01;

public class Login {
    private String user;
    private String password;

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addNumber(){
        this.user+="_Login";
        this.password+="_12345";
    }

    @Override
    public String toString() {
        return "user=" + user + ", password=" + password;
    }
}
