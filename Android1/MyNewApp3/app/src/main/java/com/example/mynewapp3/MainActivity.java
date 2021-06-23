package com.example.mynewapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout myLayout = new RelativeLayout(this);
        //CREATE A OBJECT
        Button myButton = new Button(this);



        myLayout.setBackgroundColor(Color.BLUE);

        myButton.setBackgroundColor(Color.GREEN);
        myButton.setText("Click here");

        RelativeLayout.LayoutParams buttonDetail =
                new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        buttonDetail.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetail.addRule(RelativeLayout.CENTER_VERTICAL);

        myLayout.addView(myButton, buttonDetail);

        //CREATE A OBJECT
        EditText userName = new EditText(this);

        //SET ID FOR OBJET
        myButton.setId(1);
        userName.setId(2);

        RelativeLayout.LayoutParams userNameDetail =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
        userNameDetail.addRule(RelativeLayout.ABOVE,myButton.getId());
        userNameDetail.addRule(RelativeLayout.CENTER_HORIZONTAL);

        //USING INDEPENDENT PIXEL TO SET A WIDTH FOR AN OBJECT EX: EDITEXT, IF U USE PIXEL, UR APP DIMENSION
        //WILL BE DIFFERENT IN ANY KIND OF DEVICES
        Resources r = getResources();
        int px = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());
        userName.setWidth(px);


        userNameDetail.setMargins(0,0,0,50);
        myLayout.addView(userName, userNameDetail);

        setContentView(myLayout);


    }
}