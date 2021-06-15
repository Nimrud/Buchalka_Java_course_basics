package pl.jaczewski.m8_arrays_lists_autoboxing.new_challenges.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        for (int i = 0; i < songs.size(); i++) {
            if ((i+1) == trackNumber) {
                playList.add(songs.get(i));
                return true;
            }
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                playList.add(song);
                return true;
            }
        }
        return false;
    }
}
