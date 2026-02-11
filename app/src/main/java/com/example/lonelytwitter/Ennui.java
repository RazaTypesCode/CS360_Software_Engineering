package com.example.lonelytwitter;

import java.util.Date;

public class Ennui extends Mood {

    public Ennui() {
    }

    public Ennui(Date date) {
        super(date);
    }

    @Override
    public String returnMood() {
        return "Ennui";
    }
}
