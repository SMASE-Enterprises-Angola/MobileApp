package com.example.myfragmentapp;

import android.os.Bundle;
import android.support.v4.app.*;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

public class TopSectionFragment  extends Fragment{

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
    View view= inflater.inflate(R.layout.top_section_fragment,container,false);
    return view;
    }
}
