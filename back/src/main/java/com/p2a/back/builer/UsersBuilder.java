package com.p2a.back.builer;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UsersBuilder {
    private String id;
    private String name;
    private String password;
    private String email;
    private String nickname;
}
