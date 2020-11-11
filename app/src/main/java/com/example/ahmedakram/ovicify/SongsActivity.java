package com.example.ahmedakram.ovicify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_activity);
        ListView songsListView = findViewById(R.id.songs_listview);
        ImageView back = findViewById(R.id.songs_backbtn);
        Songs songsLib = new Songs();
        final ArrayList<Song> songs = songsLib.getAllSongs();
        SongAdapter adapter = new SongAdapter(this, songs);
        songsListView.setAdapter(adapter);
        songsListView.setOnItemClickListener(this);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Song currentSong = (Song) adapterView.getItemAtPosition(i);
        String song_name = currentSong.getSong_name();
        String artist_name= currentSong.getArtist_name();
        String album_name = currentSong.getAlbum_name();
        int image = currentSong.getImageID();
        Intent SongIntent = new Intent(SongsActivity.this, PlayActivity.class);
        SongIntent.putExtra("song", song_name);
        SongIntent.putExtra("artist", artist_name);
        SongIntent.putExtra("album",album_name);
        SongIntent.putExtra("image",image);
        startActivity(SongIntent);
    }
}
