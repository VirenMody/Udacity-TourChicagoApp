package com.example.android.tourchicagoapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SportArenasFragment extends Fragment {

    public SportArenasFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.arena_guaranteedrate, R.string.arena_address_guaranteedrate));
        places.add(new Place(R.string.arena_wrigley, R.string.arena_address_wrigley));
        places.add(new Place(R.string.arena_soldierfield, R.string.arena_address_soldierfield));
        places.add(new Place(R.string.arena_unitedcenter, R.string.arena_address_unitedcenter));


        View rootView = inflater.inflate(R.layout.place_list, container, false);
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_sportarenas);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
