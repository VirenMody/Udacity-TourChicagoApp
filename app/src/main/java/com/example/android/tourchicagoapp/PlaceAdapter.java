package com.example.android.tourchicagoapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter {

    private int mBackgroundColorResourceId;

    public PlaceAdapter(Context context, ArrayList<Place> words, int backgroundColorResourceId) {
        super(context, 0, words);
        mBackgroundColorResourceId = backgroundColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Retrieve the Place obj at the current position and populate all the appropriate fields.
        Place currentPlace = (Place) getItem(position);

        TextView placeNameTextView = (TextView) listItemView.findViewById(R.id.place_name);
        placeNameTextView.setText(currentPlace.getPlaceNameId());

        TextView placeDescriptionTextView = (TextView) listItemView.findViewById(R.id.place_description);
        placeDescriptionTextView.setText(currentPlace.getPlaceDescriptionId());

        ImageView placeImageView = (ImageView) listItemView.findViewById(R.id.place_image);
        if (currentPlace.hasImage()) {
            placeImageView.setImageResource(currentPlace.getImageResourceId());
            placeImageView.setVisibility(View.VISIBLE);
        } else {
            placeImageView.setVisibility(View.GONE);
        }

        // Define the color for this set of attractions
        View placeContainerView = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mBackgroundColorResourceId);
        placeContainerView.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;    }


}
