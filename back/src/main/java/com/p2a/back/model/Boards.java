package com.p2a.back.model;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Builder
@Value
public class Boards {
    private String title;
    private String description;
    private List<String> hashtag;
    private int likes;
    private int view;
}