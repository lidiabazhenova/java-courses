package com.lidiabazhenova;


public class Song {
    private String name;
    private double duration;

    public Song(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Song " +'"'+
                 this.name + '"' + " : " +
                 + this.duration +
                " min";
    }
}



