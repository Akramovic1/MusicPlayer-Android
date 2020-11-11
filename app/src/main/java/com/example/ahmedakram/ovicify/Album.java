package com.example.ahmedakram.ovicify;

import java.util.ArrayList;

public class Album {
    private String artist_name;
    private String album_name;
    private int imageID;
    private ArrayList<Song> albumSongs;
    public Album(String artist_name, String album_name, int imageID){
        this.artist_name = artist_name;
        this.album_name = album_name;
        this.imageID = imageID;
        this.albumSongs = makeAlbum();
    }
    private ArrayList<Song> makeAlbum() {
        Songs songs = new Songs();
        ArrayList<Song> album = new ArrayList<>();
        for (int i = 0; i < songs.getAllSongs().size(); i++) {
            if (songs.getAllSongs().get(i).getAlbum_name().equals(album_name)) {
                album.add(songs.getAllSongs().get(i));
            }
        }
        return album;
    }
    public String getArtist_name(){return artist_name;}
    public String getAlbum_name(){return  album_name;}
    public int getImageID(){return imageID;}
    public ArrayList<Song> getAlbumSongs() { return albumSongs; }
}
