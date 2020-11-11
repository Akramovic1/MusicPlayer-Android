package com.example.ahmedakram.ovicify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_activity);
        Albums albums = new Albums();
        ArrayList<Album> allAlbums = albums.getAllAlbums();
        albumAdapter adapter = new albumAdapter(this,allAlbums);
        GridView gridView = findViewById(R.id.Albums_gridView);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(this);
        ImageView back = findViewById(R.id.albums_backbtn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { finish(); }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Album currentAlbum = (Album) adapterView.getItemAtPosition(i);
        String album_name = currentAlbum.getAlbum_name();
        Intent SongIntent = new Intent(AlbumsActivity.this, AlbumsTracksActivity.class);
        SongIntent.putExtra("album",album_name);
        startActivity(SongIntent);
    }
}