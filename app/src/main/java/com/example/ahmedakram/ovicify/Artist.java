package com.example.ahmedakram.ovicify;

import java.util.ArrayList;

public class Artist {
    private String artist_name;
    private int imageID;
    private ArrayList<Song> artistSongs;
    public Artist(String artist_name, int imageID){
        this.artist_name = artist_name;
        this.imageID = imageID;
        this.artistSongs = makeArtistSongs(artist_name);
    }
    private ArrayList<Song> makeArtistSongs(String artist_name) {
        Songs songs = new Songs();
        ArrayList<Song> artist = new ArrayList<>();
        for (int i = 0; i < songs.getAllSongs().size(); i++) {
            if (songs.getAllSongs().get(i).getArtist_name().equals(artist_name)) {
                artist.add(songs.getAllSongs().get(i));
            }
        }
        return artist;}
    public String getArtist_name(){return artist_name;}
    public int getImageID(){return imageID;}
    public ArrayList<Song> getArtistSongs() {
        return artistSongs;
    }

}
