package com.lidiabazhenova;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {


    public void getMenu(LinkedList playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.isEmpty()) {
            System.out.println("No songs in the itenarary");
            return;
        } else {
            System.out.println("Song " + listIterator.next().getName() + " is playing now");
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Songs over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().getName());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().getName());
                    } else {
                        System.out.println("We are at the  start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                   // System.out.println("Now playing " + listIterator.getName());
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
