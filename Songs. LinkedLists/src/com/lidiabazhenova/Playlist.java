package com.lidiabazhenova;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {


    private static void getPlayList(LinkedList playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = playList.listIterator();
        if (playList.isEmpty()) {
            System.out.println("No songs in the itenarary");
            return;
        } else {
            System.out.println("No songs " + listIterator.next());
            printMenu();
        }
    }

    private static void printMenu() {
        System.out.println("Avaluable actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - to go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }


}
