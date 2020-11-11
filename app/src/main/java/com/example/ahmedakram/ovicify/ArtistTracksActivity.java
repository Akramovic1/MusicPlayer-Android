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

public class ArtistTracksActivity extends AppCompatActivity implements ListView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_tracksactivity);
        Intent receivedIntent = getIntent();
        TextView artistName = findViewById(R.id.artist_artistname);
        artistName.setText(receivedIntent.getStringExtra("artist"));
        Artists artists = new Artists();
        Artist artist = artists.getArtist(receivedIntent.getStringExtra("artist"));
        ImageView artistImage = findViewById(R.id.artistimage);
        artistImage.setImageResource(receivedIntent.getIntExtra("image",0));
        ImageView back = findViewById(R.id.artists_songsbackbtn);
        ArrayList<Song> songs = new ArrayList<>(artist.getArtistSongs());
        SongAdapter adapter = new SongAdapter(this,songs);
        ListView listView = findViewById(R.id.artist_artistlistview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        TextView tracksNo = findViewById(R.id.noOfTracks);
        tracksNo.setText(Integer.toString(songs.size())+" tracks");
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
        Intent SongIntent = new Intent(ArtistTracksActivity.this, PlayActivity.class);
        SongIntent.putExtra("song", song_name);
        SongIntent.putExtra("artist", artist_name);
        SongIntent.putExtra("album",album_name);
        SongIntent.putExtra("image",image);
        startActivity(SongIntent);
    }
}