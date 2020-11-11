package com.example.ahmedakram.ovicify;

import java.util.ArrayList;

public class Songs {
    private ArrayList<Song> allSongs;

    public Songs(){
        allSongs = sort(songsMakers());
    }
    public ArrayList<Song> getAllSongs(){return allSongs;}
    private ArrayList<Song> sort(ArrayList<Song> songs){
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i<songs.size()-1;i++){
                Song temp = songs.get(i);
                int comparison = songs.get(i).getSong_name().compareTo(songs.get(i+1).getSong_name());
                if(comparison>0){
                    songs.set(i,songs.get(i+1));
                    songs.set(i+1,temp);
                    flag = true; } } }
        return songs;
    }
    public Song getSong(String title, String artist) {
        Song song = null;
        for (int i = 0; i < allSongs.size(); i++) {
            if (allSongs.get(i).getSong_name().equals(title) && allSongs.get(i).getArtist_name().equals(artist)) {
                song = allSongs.get(i);
                break;
            }
        }
        return song;
    }

    private ArrayList<Song> songsMakers(){
         ArrayList<Song> songs = new ArrayList<>();
         songs.add(new Song("Wegz", "Wegz Single tracks", "Ali Baba", R.drawable.wegz));
         songs.add(new Song("Wegz", "Wegz Single tracks", "Dorak gai", R.drawable.wegz));
         songs.add(new Song("Wegz", "Wegz Single tracks", "Bel Salama", R.drawable.wegz));
         songs.add(new Song("Wegz", "Wegz Single tracks", "Bazet", R.drawable.wegz));
         songs.add(new Song("Wegz", "Wegz Single tracks", "Porch", R.drawable.wegz));
         songs.add(new Song("Wegz", "Wegz Single tracks", "Alzar", R.drawable.wegz));
         songs.add(new Song("Wegz", "Wegz Single tracks", "ATM", R.drawable.wegz));

         songs.add(new Song("Pablo", "Pablo Single tracks", "Dinamit", R.drawable.pablo2));
         songs.add(new Song("Pablo", "Pablo Single tracks", "Gamiza", R.drawable.pablo2));
         songs.add(new Song("Pablo", "Pablo Single tracks", "Free", R.drawable.pablo2));
         songs.add(new Song("Pablo", "Pablo Single tracks", "Sinbad", R.drawable.pablo2));
         songs.add(new Song("Pablo", "Pablo Single tracks", "Abo Maka", R.drawable.pablo2));

         songs.add(new Song("L5vav", "L5vav Single tracks", "Gdeed novy", R.drawable.l5av));
         songs.add(new Song("L5vav", "L5vav Single tracks", "Elvis", R.drawable.l5av));
         songs.add(new Song("L5vav", "L5vav Single tracks", "Domina", R.drawable.l5av));

         songs.add(new Song("Maro", "Maro Single tracks", "Masr al gdeda", R.drawable.maroo2));
         songs.add(new Song("Maro", "Maro Single tracks", "Zhab w 3awda", R.drawable.maroo2));
         songs.add(new Song("Maro", "Maro Single tracks", "Tnen", R.drawable.maroo2));
         songs.add(new Song("Maro", "Maro Single tracks", "Albosla da3t", R.drawable.maroo2));

         return songs;
    }
}

