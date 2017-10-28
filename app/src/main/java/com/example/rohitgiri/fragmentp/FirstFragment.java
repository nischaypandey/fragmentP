package com.example.rohitgiri.fragmentp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FirstFragment extends Fragment {

private onFragmentInteraction listner;


    public FirstFragment() {
    }


    public static FirstFragment newInstance() {

        FirstFragment fragment = new FirstFragment();

        return fragment;
    }

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
        listner= (onFragmentInteraction) context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_first, container, false);
        Button button= (Button) view.findViewById(R.id.b1);
        Button button2= (Button) view.findViewById(R.id.b2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //interface required to do communication between two fragments
                listner.launchSecondFragment();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listner.launchThirdFragment();

            }
        });
        return view;
    }
    public interface onFragmentInteraction
    {
        void launchSecondFragment();
        void launchThirdFragment();
    }



    }


