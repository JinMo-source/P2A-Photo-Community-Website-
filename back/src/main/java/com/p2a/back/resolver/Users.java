package com.p2a.back.resolver;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@Builder
public class Users {
    private String id;
    private String name;
    private String password;
    private String email;
    private String nickname;
}
