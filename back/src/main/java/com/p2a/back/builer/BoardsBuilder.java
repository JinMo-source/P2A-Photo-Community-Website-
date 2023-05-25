package com.p2a.back.builer;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class BoardsBuilder {
    private String id;
    private String title;
    private String description;
    private List<String> hashtag;
    private int likes;
    private int views;
}
