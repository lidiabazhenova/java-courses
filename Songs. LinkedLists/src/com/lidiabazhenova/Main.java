package com.lidiabazhenova;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {


    // Create a program that implements a playlist for songs
    // Create a Song class having Title and Duration for a song.
    // The program will have an Album class containing a list of songs.
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the list in the order
    // they are added.
    // Once the songs have been added to the playlist, create a menu of options to:-
    // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
    // List the songs in the playlist
    // A song must exist in an album before it can be added to the playlist (so you can only play songs that
    // you own).
    // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
    // started tracking the direction we were going.
    // As an optional extra, provide an option to remove the current song from the playlist
    // (hint: listiterator.remove()

    public static void main(String[] args) {
        ArrayList<Song> listOfSongsEnriqueIglesias = new ArrayList<>();
        Album albumEnriqueIglesias = new Album("Enrique Iglesias", listOfSongsEnriqueIglesias);
        listOfSongsEnriqueIglesias.add(new Song("No Llores Por Mí", 4));
        listOfSongsEnriqueIglesias.add(new Song("Trapecista", 2));
        listOfSongsEnriqueIglesias.add(new Song("Por Amarte", 3));
        listOfSongsEnriqueIglesias.add(new Song("Si Tú Te Vas", 4.5));
        //albumEnriqueIglesias.printList(listOfSongsEnriqueIglesias);


        ArrayList<Song> listOfSongsVivir = new ArrayList<>();
        Album albumVivir = new Album("Vivir", listOfSongsVivir);
        listOfSongsVivir.add(new Song("Enamorado Por Primera Vez", 4));
        listOfSongsVivir.add(new Song("Al Despertar", 2));
        listOfSongsVivir.add(new Song("Lluvia Cae", 3));
        listOfSongsVivir.add(new Song("Tu Vacío", 4.5));
        //albumVivir.printList(listOfSongsVivir);

        Playlist playList = new Playlist();
        LinkedList<Song> myplayList = new LinkedList<>();
        myplayList.add(albumEnriqueIglesias.getSongs().get(0));
        myplayList.add(albumEnriqueIglesias.getSongs().get(1));
        myplayList.add(albumEnriqueIglesias.getSongs().get(2));
        myplayList.add(albumEnriqueIglesias.getSongs().get(3));
        playList.getMenu(myplayList);


    }


}
