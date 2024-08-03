package com.example.RssParser.model;

public class Job {
    private String title;
    private String location;

    public Job(String title, String location) {
        this.title = title;
        this.location = location;
    }

    public Job() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
