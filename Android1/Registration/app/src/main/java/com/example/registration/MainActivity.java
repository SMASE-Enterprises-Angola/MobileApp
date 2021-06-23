package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegistrarBtnClick(View view){
        TextView txtFirstName =findViewById(R.id.txtfirstname);
        TextView txtLastName =findViewById(R.id.txtLastName);
        TextView txtEmail =findViewById(R.id.TxtEmail);

        EditText edtTxtFirstName = findViewById(R.id.edtTxtFirstName);
        EditText edtTxtLastName = findViewById(R.id.edtTxtLastName);
        EditText edtTxtemail = findViewById(R.id.edtTextEmail);

        txtFirstName.setText("Primeiro Nome:" +edtTxtFirstName.getText().toString());
        txtFirstName.setText("Ultimo Nome:" +edtTxtLastName.getText().toString());
        txtFirstName.setText("E-mail:" +edtTxtemail.getText().toString());


    }
}