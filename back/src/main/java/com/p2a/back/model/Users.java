package com.p2a.back.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Users {
    private String id;
    private String name;
    private String password;
    private String email;
    private String nickname;
}


