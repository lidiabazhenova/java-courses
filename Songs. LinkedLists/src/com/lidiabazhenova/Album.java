package com.lidiabazhenova;

import java.util.ArrayList;

public class Album {

    private String title;
    ArrayList<Song> songs;

    public Album(String title, ArrayList<Song> songs) {
        this.title = title;
        this.songs = songs;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    //    public void printList(ArrayList<Song> list) {
//
//        System.out.println("You have " + list.size() + " items in " + getTitle() + " album:");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println((i + 1) + ". " + getTitle() + ". " + list.get(i).getName()
//                    + ". duration " + list.get(i).getDuration() + " minute");
//        }
//    }

}
