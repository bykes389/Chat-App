package com.chat.model;

public class Model_Register {

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public Model_Register(String userName, String email, String password) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public Model_Register() {
    }

    private String userName;
    private String password;
    private String email;
}
