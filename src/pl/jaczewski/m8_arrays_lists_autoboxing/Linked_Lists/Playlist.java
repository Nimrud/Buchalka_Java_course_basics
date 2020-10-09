package pl.jaczewski.m8_arrays_lists_autoboxing.Linked_Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album1 = new Album("Mój album");
        album1.addSong("chapter 1", 284);
        album1.addSong("chapter 2", 128);
        album1.addSong("chapter 3", 300);
        album1.addSong("chapter 4", 180);
        albums.add(album1);

        Album album2 = new Album("Pieśni ludowe");
        album2.addSong("Szła dzieweczka...", 314);
        album2.addSong("...do laseczka", 150);
        album2.addSong("...a tam Wisła płynie", 273);
        album2.addSong("...po polskiej krainie", 822);
        albums.add(album2);

        LinkedList<Song> playlist = new LinkedList<>();
        album1.addToPlaylist("chapter 2", playlist);
        album2.addToPlaylist("Szła dzieweczka...", playlist);
        album2.addToPlaylist("...po polskiej krainie", playlist);

        play(playlist);
    }

    public static void play(LinkedList<Song> playlist){
        int option = 0;
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();

        if (playlist.size() == 0){
            System.out.println("No songs in the playlist");
        } else {
            System.out.println("Playing " + listIterator.next().toString());
            printInstructions();
        }

        while (!quit){
            System.out.print("Please select an option (0 for menu): ");
            boolean isInt = sc.hasNextInt();
            if (!isInt){
                System.out.println("Invalid number");
                sc.nextLine();
            } else {
                option = sc.nextInt();
                sc.nextLine();

                switch (option){
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        displayAllSongs();
                        break;
                    case 2:
                        displaySongsInAlbum();
                        break;
                    case 3:
                        if (!forward){
                            if (listIterator.hasNext()){
                                listIterator.next();
                            }
                            forward = true;
                        }

                        if (listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                        } else {
                            System.out.println("This is the end of playlist");
                            forward = false;
                        }
                        break;
                    case 4:
                        if (forward){
                            if(listIterator.hasPrevious()){
                                listIterator.previous();
                            }
                            forward = false;
                        }

                        if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                        } else {
                            System.out.println("This is the start of playlist");
                            forward = true;
                        }
                        break;
                    case 5:
                        if(forward) {
                            if(listIterator.hasPrevious()) {
                                System.out.println("Now replaying " + listIterator.previous().toString());
                                forward = false;
                            } else {
                                System.out.println("This is the start of playlist");
                            }
                        } else {
                            if(listIterator.hasNext()) {
                                System.out.println("Now replaying " + listIterator.next().toString());
                                forward = true;
                            } else {
                                System.out.println("This is the end of playlist");
                            }
                        }
                        break;
                    case 6:
                        quit = true;
                        break;
                }
            }
        }
    }

    public static void printInstructions() {
        System.out.println("Menu: ");
        System.out.println("\t 0 - To display options.");
        System.out.println("\t 1 - To display all available songs.");
        System.out.println("\t 2 - To display all songs in the list.");
        System.out.println("\t 3 - To go forward to the next song.");
        System.out.println("\t 4 - To go back to the previous song.");
        System.out.println("\t 5 - To replay the current song.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void displayAllSongs(){
        if (albums.size() == 0){
            System.out.println("No songs available");
        } else {
            for (int i = 0; i < albums.size(); i++) {
                System.out.println(albums.get(i).getSongs());
            }
        }
    }

    private static void displayAllAlbums(){
        if (albums.size() == 0){
            System.out.println("No albums available");
        } else{
            for (int i = 0; i < albums.size(); i++){
                System.out.println(albums.get(i).getName());
            }
        }
    }

    private static Album findAlbum(String albumName){
        for (int i = 0; i < albums.size(); i++){
            if (albumName.equals(albums.get(i).getName())){
                return albums.get(i);
            }
        }
        return null;
    }

    private static void displaySongsInAlbum(){
        System.out.println("Available albums: ");
        displayAllAlbums();
        System.out.print("Enter album name: ");
        String albumName = sc.nextLine();
        Album albumFinder = findAlbum(albumName);
        if (albumFinder != null){
            System.out.println(albumFinder.getSongs());
        } else {
            System.out.println("Invalid album name");
        }
    }
}

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listIterator.remove()
