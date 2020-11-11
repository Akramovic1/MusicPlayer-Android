package com.example.ahmedakram.ovicify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class artistAdapter extends ArrayAdapter<Artist> {
    public artistAdapter(Context context, ArrayList<Artist> artists) {
        super(context, 0, artists);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artist_item, parent, false);
        }
        Artist currentArtist = getItem(position);
        TextView artist_name = listItemView.findViewById(R.id.song_artistname);
        artist_name.setText(currentArtist.getArtist_name());
        ImageView artist_image = listItemView.findViewById(R.id.artist_artistimage);
        artist_image.setImageResource(currentArtist.getImageID());
        return listItemView;
    }
}
