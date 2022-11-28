package com.test.fullstack.dtos;

import com.test.fullstack.models.News;

import java.time.LocalDateTime;

public class NewsDTO {

    private long id;
    private String content, tags, categories, region;
    private LocalDateTime date;

    public NewsDTO() {
    }

    public NewsDTO(News news){
        this.content = news.getContent();
        this.tags = news.getTags();
        this.categories =news.getCategories();
        this.region = news.getRegion();
        this.date = news.getDate();
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getTags() {
        return tags;
    }

    public String getCategories() {
        return categories;
    }

    public String getRegion() {
        return region;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
