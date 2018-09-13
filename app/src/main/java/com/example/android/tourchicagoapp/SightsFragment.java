package com.example.android.tourchicagoapp;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsFragment extends Fragment {

    public SightsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.sight_milleniumpark, R.string.sight_description_milleniumpark, R.drawable.sight_milleniumpark));
        places.add(new Place(R.string.sight_willistower, R.string.sight_description_willistower,
                R.drawable.sight_willistower));
        places.add(new Place(R.string.sight_navypier, R.string.sight_description_navypier,
                R.drawable.sight_navypier));
        places.add(new Place(R.string.sight_buckinghamfountain, R.string.sight_description_buckinghamfountain,
                R.drawable.sight_buckinghamfountain));
        places.add(new Place(R.string.sight_lincolnparkzoo, R.string.sight_description_lincolnparkzoo,
                R.drawable.sight_lincolnparkzoo));
        places.add(new Place(R.string.sight_bahaihouseofworship, R.string.sight_description_bahaihouseofworship,
                R.drawable.sight_bahaihouseofworship));
        places.add(new Place(R.string.sight_architectureboattour, R.string.sight_description_architectureboattour,
                R.drawable.sight_architectureboattour));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_sights);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
