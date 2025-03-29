package com.example.hdb250325;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDigitalSignage= findViewById(R.id.digitalsignage);
        btnDigitalSignage.setOnClickListener(buttonListener11);
    }

    private View.OnClickListener buttonListener11 = new View.OnClickListener(){

        public void onClick(View view) {
            Intent intent=new Intent();
            intent.setClass(MainActivity.this, DigitalSignage.class);
            startActivities(new Intent[]{intent});
        }
    };
}