package com.example.ahmedakram.ovicify;

import java.util.ArrayList;

public class Albums {
    private ArrayList<Album> allAlbums;
    public Albums(){
        allAlbums = sort(albumsMakers());
    }
    public ArrayList<Album> getAllAlbums(){return allAlbums;}
    public Album getAlbum(String album){
        Album req_album = null;
        for(int i = 0;i<allAlbums.size();i++){
            if(allAlbums.get(i).getAlbum_name().equals(album)){
                req_album = allAlbums.get(i);
                break;
            }
        }
        return req_album;
    }
    public ArrayList<Album> sort(ArrayList<Album> albums){
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0 ;i<albums.size()-1;i++){
                Album temp = albums.get(i);
                int comparison = albums.get(i).getAlbum_name().compareTo(albums.get(i+1).getAlbum_name());
                if(comparison>0){
                    albums.set(i,albums.get(i+1));
                    albums.set(i+1,temp);
                    flag = true; } } }
        return albums;
    }
    private ArrayList<Album> albumsMakers(){
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album("Wegz","Wegz Single tracks",R.drawable.wegz));
        albums.add(new Album("Pablo","Pablo Single tracks",R.drawable.pablo2));
        albums.add(new Album("L5vav","L5vav Single tracks",R.drawable.l5av));
        albums.add(new Album("Maro","Maro Single tracks",R.drawable.maroo2));
        return albums;
    }
}
