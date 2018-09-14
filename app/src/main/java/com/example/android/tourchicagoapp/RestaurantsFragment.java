package com.example.android.tourchicagoapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.restaurants_chicagodiner, R.string.restaurants_address_chicagodiner));
        places.add(new Place(R.string.restaurants_giordanos, R.string.restaurants_address_giordanos));
        places.add(new Place(R.string.restaurants_superdawg, R.string.restaurants_address_superdawg));
        places.add(new Place(R.string.restaurants_garrettpopcorn, R.string.restaurants_address_garrettpopcorn));
        places.add(new Place(R.string.restaurants_stans, R.string.restaurants_address_stans));
        places.add(new Place(R.string.restaurants_velvettaco, R.string.restaurants_address_velvettaco));

        View rootView = inflater.inflate(R.layout.place_list, container, false);
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
