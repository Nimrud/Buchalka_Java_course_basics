package pl.jaczewski.m8_Arrays_Lists_Autoboxing.Linked_Lists;

import java.util.LinkedList;

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

    public boolean addSong(String songName, int duration){
        if (findSong(songName) >= 0){
            return false;
        } else {
            this.songs.add(new Song(songName, duration));
            return true;
        }
    }

    private int findSong(String name){
        for (int i = 0; i < songs.size(); i++){
            if (this.songs.get(i).getTitle() == name){
                System.out.println(name + " is already in the album.");
                return i;
            }
        }
        return -1;
    }

    /*
    public void displaySongs(){
        for (int i = 0; )
    }

     */

}
