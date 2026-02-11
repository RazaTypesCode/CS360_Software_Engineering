package com.example.lonelytwitter;

import java.util.Date;

public abstract class Mood {
    private Date date;
    private String message;

    public Mood() {
        this.date = new Date(2026,1,27);
    }

    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public abstract String returnMood();
}
