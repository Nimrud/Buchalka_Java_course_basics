package pl.jaczewski.m8_arrays_lists_autoboxing.Linked_Lists;

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
        if (findSong(songName) != null){
            System.out.println(songName + " is already in the album.");
            return false;
        } else {
            System.out.println("\"" + songName + "\" added to album \"" + this.name + "\".");
            this.songs.add(new Song(songName, duration));
            return true;
        }
    }

    private Song findSong(String name){
        for (int i = 0; i < songs.size(); i++){
            if (this.songs.get(i).getTitle().equals(name)){
                return this.songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlaylist(String name, LinkedList<Song> playlist){
        Song songChecker = findSong(name);
        if (songChecker != null){
            playlist.add(songChecker);
            return true;
        }
        System.out.println(name + " not found.");
        return false;
    }

    public void displayAllSongs(){
        getSongs();
    }

}
