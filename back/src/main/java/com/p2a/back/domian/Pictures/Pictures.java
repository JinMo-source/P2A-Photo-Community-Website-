package com.p2a.back.domian.Pictures;

import java.util.List;

public class Pictures {
    private String id;
    private String title;
    private String description;
    private List<String> hashtag;
    private int likes;
    private int views;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getHashtag() {
        return hashtag;
    }

    public void setHashtag(List<String> hashtag) {
        this.hashtag = hashtag;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Pictures(String id, String title, String description, List<String> hashtag, int likes, int views) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.hashtag = hashtag;
        this.likes = likes;
        this.views = views;
    }
}