package com.lidiabazhenova;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    private static final int QUIT_ACTION = 0;
    private static final int NEXT_SONG = 1;
    private static final int PREVIOUS_SONG = 2;
    private static final int REPLAY_SONG = 3;
    private static final int REMOVE_SONG = 4;
    private static final int PRINT_PLAYLIST = 5;
    private static final int PRINT_MENU = 6;

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
            System.out.println("Song " + song.toString());
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
                        System.out.println("Now is playing " + nextSong.toString());
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
                        System.out.println("Now is playing " + previousSong.toString());
                    } else {
                        System.out.println("We are at the  start of the list");
                        goingForward = true;
                    }
                    break;
                case REPLAY_SONG:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now is playing " + listIterator.previous().toString());
                            goingForward = false;
                        } else {
                            System.out.println("Reached the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now is playing " + listIterator.next().toString());
                            goingForward = true;
                        } else {
                            System.out.println("Reached the end of the list");
                        }
                    }


//                    Song repeatSong = listIterator.next();
//                    if (listIterator.hasNext()) {
//                        System.out.println("Now playing " + repeatSong.toString());
//                        listIterator.previous();
//                    } else {
//                        System.out.println("Now playing " + repeatSong.toString());
//                        listIterator.next();
//                    }
                    break;
                case REMOVE_SONG:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now is playing " + listIterator.next().toString());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now is playing " + listIterator.previous().toString());
                        }
                    }
                    break;
                case PRINT_PLAYLIST:
                    printList(playList);
                    break;
                case PRINT_MENU:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Avaluable actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - to go to next song\n" +
                "2 - go to previous song\n" +
                "3 - replay song\n" +
                "4 - delete from playlist\n" +
                "5 - print playlist\n" +
                "6 - print menu");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println(("===================================="));
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(("===================================="));

    }


}
