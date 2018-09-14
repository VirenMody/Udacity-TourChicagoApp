package com.example.android.tourchicagoapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsFragment extends Fragment {

    public SightsFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.sight_millenniumpark, R.string.sight_address_millenniumpark, R.drawable.sight_millenniumpark));
        places.add(new Place(R.string.sight_willistower, R.string.sight_address_willistower,
                R.drawable.sight_willistower));
        places.add(new Place(R.string.sight_navypier, R.string.sight_address_navypier,
                R.drawable.sight_navypier));
        places.add(new Place(R.string.sight_buckinghamfountain, R.string.sight_address_buckinghamfountain,
                R.drawable.sight_buckinghamfountain));
        places.add(new Place(R.string.sight_lincolnparkzoo, R.string.sight_address_lincolnparkzoo,
                R.drawable.sight_lincolnparkzoo));
        places.add(new Place(R.string.sight_bahaihouseofworship, R.string.sight_address_bahaihouseofworship,
                R.drawable.sight_bahaihouseofworship));
        places.add(new Place(R.string.sight_architectureboattour, R.string.sight_address_architectureboattour,
                R.drawable.sight_architectureboattour));

        View rootView = inflater.inflate(R.layout.place_list, container, false);
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_sights);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
