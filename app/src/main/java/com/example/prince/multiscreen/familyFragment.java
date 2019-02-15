package com.example.prince.multiscreen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class familyFragment extends Fragment {

    TextView song_name;
    public familyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_family, container, false);
      song_name=(TextView) rootView.findViewById(R.id.song_name);
      song_name.setSelected(true);
        return rootView;
    }

}
