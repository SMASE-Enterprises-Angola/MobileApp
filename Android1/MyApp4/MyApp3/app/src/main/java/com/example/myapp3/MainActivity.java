package com.example.myapp3;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = (Button) findViewById(R.id.btn1);

        myButton.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){

                        TextView myText = (TextView) findViewById(R.id.myText);
                        myText.setText("Button Clicked");

                    }
                }
        );

        myButton.setOnLongClickListener(
                new View.OnLongClickListener(){
                    public boolean onLongClick(View v)
                    {
                        TextView myText =(TextView) findViewById(R.id.myText);
                        myText.setText("Long button pressed");
                        return true;
                    }
                }
        );

    }
}