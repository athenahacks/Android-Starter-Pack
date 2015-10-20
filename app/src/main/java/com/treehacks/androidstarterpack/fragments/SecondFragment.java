package com.treehacks.androidstarterpack.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.treehacks.androidstarterpack.R;

/**
 * Created by eddie on 10/20/2015.
 */
public class SecondFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Your code here
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        // Your code here
    }

    @Override
    public void onPause() {
        // Your code here
        super.onPause();
    }

    @Override
    public void onStop() {
        // Your code here
        super.onStop();
    }
}
