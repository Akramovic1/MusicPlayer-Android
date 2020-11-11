package com.example.ahmedakram.ovicify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class albumAdapter extends ArrayAdapter<Album> {
    public albumAdapter(Context context, ArrayList<Album> albums) {
        super(context, 0, albums);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.album_item, parent, false);
        }
        Album currentAlbum = getItem(position);
        TextView album_name = listItemView.findViewById(R.id.album_name);
        album_name.setText(currentAlbum.getAlbum_name());
        TextView artist_name = listItemView.findViewById(R.id.album_artistname);
        artist_name.setText(currentAlbum.getArtist_name());
        ImageView artist_image = listItemView.findViewById(R.id.album_artistimage);
        artist_image.setImageResource(currentAlbum.getImageID());
        return listItemView;
    }
}
