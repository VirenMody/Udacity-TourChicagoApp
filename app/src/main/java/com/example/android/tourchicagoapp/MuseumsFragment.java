package com.example.android.tourchicagoapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.museum_artinstitute, R.string.museum_address_artinstitute));
        places.add(new Place(R.string.museum_sheddaquarium, R.string.museum_address_sheddaquarium));
        places.add(new Place(R.string.museum_fieldmuseum, R.string.museum_address_fieldmuseum));
        places.add(new Place(R.string.museum_adlerplanetarium, R.string.museum_address_adlerplanetarium));
        places.add(new Place(R.string.museum_scienceindustry, R.string.museum_address_scienceindustry));
        places.add(new Place(R.string.museum_chicagohistory, R.string.museum_address_chicagohistory));


        View rootView = inflater.inflate(R.layout.place_list, container, false);
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_museums);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
