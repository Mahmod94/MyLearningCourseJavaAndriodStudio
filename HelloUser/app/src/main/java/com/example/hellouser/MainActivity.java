package com.example.hellouser;

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
    public void onBtnClick (View view){
        TextView txtHello = findViewById(R.id.txtHello);
        EditText edtTxtName = findViewById(R.id.edtTxtName);
        edtTxtName.getText().toString();
        txtHello.setText("Hello " + edtTxtName.getText().toString() + " :-)");
    }
}