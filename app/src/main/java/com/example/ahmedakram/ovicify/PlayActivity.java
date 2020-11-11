package com.example.ahmedakram.ovicify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        Intent receivedIntent = getIntent();
        TextView songName = findViewById(R.id.play_song_name);
        TextView artistName = findViewById(R.id.play_artist_name);
        TextView albumName = findViewById(R.id.play_albumname);
        ImageView image = findViewById(R.id.play_artistimage);

        String song = receivedIntent.getStringExtra("song");
        songName.setText(song);

        String artist = receivedIntent.getStringExtra("artist");
        artistName.setText(artist);

        String album = receivedIntent.getStringExtra("album");
        albumName.setText(album);

        int imageFinal = receivedIntent.getIntExtra("image",0);
        image.setImageResource(imageFinal);

        ImageView back = findViewById(R.id.play_back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}