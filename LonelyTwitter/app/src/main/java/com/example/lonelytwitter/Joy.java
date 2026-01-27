package com.example.lonelytwitter;

import java.util.Date;

public class Joy extends Mood {

    public Joy() {
    }

    public Joy(Date date) {
        super(date);
    }

    @Override
    public String returnMood() {
        return "Joy";
    }
}
