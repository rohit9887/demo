package com.rohit.atal.Library.Model;

public class User {
    private int Userid;
    private String Username;

    public User() {
        super();
    }

    public User(int userid, String username) {
        Userid = userid;
        Username = username;
    }

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }
}
