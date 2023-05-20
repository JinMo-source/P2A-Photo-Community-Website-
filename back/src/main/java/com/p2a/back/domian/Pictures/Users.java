package com.p2a.back.domian.Pictures;

import org.springframework.beans.factory.annotation.Value;

public class Users {
    private String id;
    private String name;
    private String password;
    private String email;
    private String nickname;

    public Users(String id, String name, String password, String email, String nickname) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
