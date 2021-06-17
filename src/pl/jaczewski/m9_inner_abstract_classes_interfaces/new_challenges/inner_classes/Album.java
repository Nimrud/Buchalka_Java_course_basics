package pl.jaczewski.m9_inner_abstract_classes_interfaces.new_challenges.inner_classes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    private class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            for (int i = 0; i < songs.size(); i++) {
                if ((i+1) == trackNumber) {
                    return songs.get(i);
                }
            }
            return null;
        }
    }

    public boolean addSong(String title, double duration) {
        if (songs.findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        if (songs.findSong(trackNumber) != null) {
            playList.add(songs.findSong(trackNumber));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        if (songs.findSong(title) != null) {
            playList.add(songs.findSong(title));
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }
}
