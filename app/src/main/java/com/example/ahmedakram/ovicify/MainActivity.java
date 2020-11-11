package com.example.ahmedakram.ovicify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tracksBtn,albumsBtn,artistsBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tracksBtn = findViewById(R.id.tracks_btn);
        tracksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(Intent);
            }
        });
        albumsBtn = findViewById(R.id.albums_btn);
        albumsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(Intent);
            }
        });
        artistsBtn = findViewById(R.id.artists_btn);
        artistsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(Intent);
            }
        });
    }

}