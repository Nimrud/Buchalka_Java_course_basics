package pl.jaczewski.m8_Arrays_Lists_Autoboxing.Linked_Lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    LinkedList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public void addSong(String songName, int duration){

    }

    private int findSong(String name, LinkedList songs){
        ListIterator<String> i = songs.listIterator();
        while (i.hasNext()){
            int compare = i.next().compareTo(name);
            if (compare == 0){
                System.out.println("That song is already in this album.");
                return -1;
            } else {
                System.out.println("Song " + name + " not found.");
                return 1;
            }
        }
        return -1;
    }


}
