package pl.jaczewski.m8_Arrays_Lists_Autoboxing.Linked_Lists;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Album> albums;

    public Playlist() {
        this.albums = new ArrayList<>();
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public static void main(String[] args) {
        Album album = new Album("Mój album");
        album.getSongs();
        album.addSong("chapter 1", 284);
        album.addSong("chapter 2", 128);
        album.addSong("chapter 3", 300);
        album.addSong("chapter 4", 180);
        album.addSong("chapter 4", 180);
        System.out.println(album.songs.get(0).getTitle());
        System.out.println(album.songs.get(1).getTitle());
        System.out.println(album.songs.get(2).getTitle());
        System.out.println(album.songs.get(3).getTitle());

    }
}
