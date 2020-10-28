package com.ilcarro.qa.model;

public class User {
    private  String fName;
    private  String lName;
    private  String email;
    private  String password;

    public User setfName(String fName) {
        this.fName = fName;
        return  this;
    }

    public User setlName(String lName) {
        this.lName = lName;
        return  this;
    }

    public User setEmail(String email) {
        this.email = email;
        return  this;
    }

    public User setPassword(String password) {
        this.password = password;
        return  this;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
