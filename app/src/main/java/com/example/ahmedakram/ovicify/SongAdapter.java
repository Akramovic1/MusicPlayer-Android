package com.example.ahmedakram.ovicify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songs_item, parent, false);
        }
        Song currentSong = getItem(position);
        TextView song_name = listItemView.findViewById(R.id.song_name);
        song_name.setText(currentSong.getSong_name());
        TextView artist_name = listItemView.findViewById(R.id.song_artistname);
        artist_name.setText(currentSong.getArtist_name());
        ImageView artist_image = listItemView.findViewById(R.id.song_artistimage);
        artist_image.setImageResource(currentSong.getImageID());
        return listItemView;
    }


}





