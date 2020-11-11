package com.example.ahmedakram.ovicify;

import java.util.ArrayList;

public class Artists {
    private ArrayList<Artist> allArtist;
    public Artists(){
        this.allArtist = sort(artistsMakers());
    }
    public Artist getArtist(String artist){
        Artist reqArtist = null;
        for (int i = 0; i < allArtist.size(); i++) {
            if (allArtist.get(i).getArtist_name().equals(artist)) {
                reqArtist = allArtist.get(i);
                break;
            }
        }
        return reqArtist;
    }
    public ArrayList<Artist> getAllArtists() {
        return allArtist;
    }
    private ArrayList<Artist> sort(ArrayList<Artist> artists){
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i<artists.size()-1; i++){
                Artist temp = artists.get(i);
                int comparison = artists.get(i).getArtist_name().compareTo(artists.get(i+1).getArtist_name());
                if(comparison>0){
                    artists.set(i,artists.get(i+1));
                    artists.set(i+1,temp);
                    flag = true; } }
        }
        return artists;
    }
    private ArrayList<Artist> artistsMakers() {
        ArrayList<Artist> artists = new ArrayList<>();
        artists.add(new Artist("Wegz",R.drawable.wegz));
        artists.add(new Artist("Pablo",R.drawable.pablo2));
        artists.add(new Artist("Maro",R.drawable.maroo2));
        artists.add(new Artist("L5vav",R.drawable.l5av));
        return artists;
    }
}
