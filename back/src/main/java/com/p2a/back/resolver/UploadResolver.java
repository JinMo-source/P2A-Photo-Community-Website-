package com.p2a.back.resolver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UploadResolver{
    public Users users() {
        // Return a list of Users
        //new Users("1", "Han", "1234", "hsd@example.com", "good");
        return Users.builder()
                .id("1")
                .name("Han")
                .password("1234")
                .email("hsd@example.com")
                .nickname("good")
                .build();
    }
    public Pictures pictures() {
        // Return a list of Pictures
        //new Pictures("1", "Beautiful Sunset", "A stunning sunset over the ocean.", Arrays.asList("sunset", "nature"), 100, 500);
        return Pictures.builder()
                .id("1")
                .title("Beautiful Sunset")
                .description("A stunning sunset over the ocean.")
                .hashtag(Arrays.asList("sunset", "nature"))
                .likes(100)
                .views(150)
                .build();
    }
}

