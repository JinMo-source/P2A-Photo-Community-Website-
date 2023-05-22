package com.p2a.back.resolver;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class Pictures {
    private String id;
    private String title;
    private String description;
    private List<String> hashtag;
    private int likes;
    private int views;
}
