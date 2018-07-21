package com.example.amar.musicplayer;


import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Album> {

    /**
     * Resource ID for the background color for this grid of audio
     */
    private int mColorResourceId;

    public AlbumAdapter(Context context, ArrayList<Album> albums, int colorResourceId) {
        super(context, 0, albums);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }

        // Get the {@link Audio} object located at this position in the grid
        Album currentAlbum = getItem(position);


        TextView musicTextView = (TextView) gridItemView.findViewById(R.id.music_text_view_albums);
        musicTextView.setText(currentAlbum.getSongName());
        TextView defaultTextView = (TextView) gridItemView.findViewById(R.id.default_text_view_albums);
        defaultTextView.setText(currentAlbum.getSingerNameId());

        // Find the ImageView in the grid_item.xml layout with the ID image.
        ImageView imageView = (ImageView) gridItemView.findViewById(R.id.image_albums);
        // Check if an image is provided for this audio or not
        if (currentAlbum.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentAlbum.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the grid item
        View textContainer = gridItemView.findViewById(R.id.text_container_albums);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        return gridItemView;
    }
}