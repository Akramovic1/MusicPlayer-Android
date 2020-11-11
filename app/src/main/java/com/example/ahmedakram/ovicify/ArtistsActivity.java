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

public class ArtistsActivity extends AppCompatActivity implements ListView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists_activity);
        Artists artists = new Artists();
        ArrayList<Artist> allArtists = artists.getAllArtists();
        artistAdapter adapter = new artistAdapter(this,allArtists);
        GridView gridView = findViewById(R.id.Artists_gridView);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(this);
        ImageView back = findViewById(R.id.artists_backbtn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Artist currentArtist = (Artist) adapterView.getItemAtPosition(i);
        String artist_name = currentArtist.getArtist_name();
        int image = currentArtist.getImageID();
        Intent SongIntent = new Intent(ArtistsActivity.this, ArtistTracksActivity.class);
        SongIntent.putExtra("artist",artist_name);
        SongIntent.putExtra("image",image);
        startActivity(SongIntent);
    }
}