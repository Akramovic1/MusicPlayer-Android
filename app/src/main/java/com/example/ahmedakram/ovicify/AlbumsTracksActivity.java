package com.example.ahmedakram.ovicify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumsTracksActivity extends AppCompatActivity implements ListView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_tracksactivity);
        Intent receivedIntent = getIntent();
        TextView albumName = findViewById(R.id.album_name);
        albumName.setText(receivedIntent.getStringExtra("album"));
        Albums albums = new Albums();
        Album album = albums.getAlbum(receivedIntent.getStringExtra("album"));
        ImageView back = findViewById(R.id.albumstracks_backbtn);
        ArrayList<Song> songs = new ArrayList<>(album.getAlbumSongs());
        SongAdapter adapter = new SongAdapter(this,songs);
        ListView listView = findViewById(R.id.albums_tracksView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
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
        Intent SongIntent = new Intent(AlbumsTracksActivity.this, PlayActivity.class);
        SongIntent.putExtra("song", song_name);
        SongIntent.putExtra("artist", artist_name);
        SongIntent.putExtra("album",album_name);
        SongIntent.putExtra("image",image);
        startActivity(SongIntent);
    }
}