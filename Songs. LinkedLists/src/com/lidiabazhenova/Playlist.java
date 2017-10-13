package com.lidiabazhenova;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    private static final int QUIT_ACTION = 0;
    private static final int NEXT_SONG = 1;
    private static final int PREVIOUS_SONG = 2;
    private static final int REPLAY_SONG = 3;

    public void getMenu(LinkedList playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.isEmpty()) {
            System.out.println("No songs in the itenarary");
            return;
        } else {
            Song song = listIterator.next();
            System.out.println("Song " + song.getName() + " is playing now. duration " + song.getDuration());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case QUIT_ACTION:
                    System.out.println("Songs over");
                    quit = true;
                    break;
                case NEXT_SONG:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        Song nextSong = listIterator.next();
                        System.out.println("Now playing " + nextSong.getName() + ". " + nextSong.getDuration() + " minute");
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case PREVIOUS_SONG:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        Song previousSong = listIterator.previous();
                        System.out.println("Now playing " + previousSong.getName() + ". " + previousSong.getDuration() + " minute");
                    } else {
                        System.out.println("We are at the  start of the list");
                        goingForward = true;
                    }
                    break;
                case REPLAY_SONG:
                    Song repeatSong = listIterator.next();
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + repeatSong.getName() + ". " + repeatSong.getDuration() + " minute");
                        listIterator.previous();
                    } else {
                        System.out.println("Now playing " + repeatSong.getName() + ". " + repeatSong.getDuration() + " minute");
                        listIterator.next();
                    }
                    break;
            }
        }
    }

    private void printMenu() {
        System.out.println("Avaluable actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - to go to next song\n" +
                "2 - go to previous song\n" +
                "3 - replay song");
    }


}
