package com.example.ihcfindeat;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);

//            ImageView btnOpen = (ImageView) view.findViewById(R.id.btnOpen);


//            btnOpen.setOnClickListener(new View.OnClickListener() {
  //              @Override
      //          public void onClick(View view) {
    //                Intent in = new Intent(getActivity(), Meatloaf2.class);
//                    startActivity(in);

  //              }
    //        });

        ImageView btnOpen = (ImageView)view.findViewById(R.id.btnOpen);
        ImageView imageView22 = (ImageView)view.findViewById(R.id.imageview22);

        btnOpen.setOnClickListener(new ImageView.OnClickListener() {
            @SuppressWarnings("ResourceType")
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Meatloaf2.class);
                startActivity(in);

            }});


        imageView22.setOnClickListener(new ImageView.OnClickListener() {
            @SuppressWarnings("ResourceType")
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Apple2Activity.class);
                startActivity(in);

            }});

            return view;


        }

}
