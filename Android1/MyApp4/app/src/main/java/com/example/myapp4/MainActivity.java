package com.example.myapp4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.view.GestureDetector;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.view.MotionEvent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private  TextView myMessage;
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myMessage = (TextView) findViewById(R.id.myMessage);
        this.gestureDetector = new GestureDetector(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        myMessage.setText("Single tap confirmed");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        myMessage.setText("Ondoubletap confirmed");

        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        myMessage.setText("Ondouble tap event confirmed");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        myMessage.setText("Ondown confirmed");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        myMessage.setText("OnShowPress confirmed");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        myMessage.setText("OnSigleTap up confirmed");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        myMessage.setText("OnScroll confirmed");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        myMessage.setText("OnLOngPress confirmed");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        myMessage.setText("OnFling");
        return false;
    }
}