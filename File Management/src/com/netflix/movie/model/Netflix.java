package com.netflix.movie.model;

public class Netflix {
    private long  id;
    private String title;
    private String category;
    private String actor;
    private String language;
    private String publishingYear;
    private String publishCompany;
    private int time;

    public Netflix(long id) {
        this.id = id;
    }

    public Netflix(long id, String title, String category, String actor, String language, String publishingYear, String publishCompany, int time) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.actor = actor;
        this.language = language;
        this.publishingYear = publishingYear;
        this.publishCompany = publishCompany;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getPublishCompany() {
        return publishCompany;
    }

    public void setPublishCompany(String publishCompany) {
        this.publishCompany = publishCompany;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return id + "-" + title + "-" + category + "-" + time + "-" + language;

    }


}
