package com.example.myfragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.*;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;


public class buttonsection_fragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.bottom_picture_fragment,container,false);
        return view;
    }
}
