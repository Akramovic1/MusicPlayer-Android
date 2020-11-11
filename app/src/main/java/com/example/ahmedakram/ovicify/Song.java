package com.example.ahmedakram.ovicify;

import java.util.ArrayList;

public class Song {
    private String artist_name;
    private String album_name;
    private String song_name;
    private int imageID;

    public Song(String artist_name, String album_name, String song_name,int imageID) {
        this.artist_name = artist_name;
        this.album_name = album_name;
        this.song_name = song_name;
        this.imageID = imageID;
    }
    public String getArtist_name(){return artist_name;}
    public String getAlbum_name(){return album_name;}
    public String getSong_name(){return song_name;}
    public int getImageID(){return imageID;}
}
