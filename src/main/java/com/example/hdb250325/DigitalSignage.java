package com.example.hdb250325;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DigitalSignage extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.digitalsignage);

        Button btnRtnMainPage=(Button) findViewById(R.id.btnRtnMainPage);
        btnRtnMainPage.setOnClickListener(buttonListener);
    }

    private View.OnClickListener buttonListener = new View.OnClickListener(){

        public void onClick(View view) {
            Intent intent=new Intent();
            intent.setClass(DigitalSignage.this, MainActivity.class);
            startActivities(new Intent[]{intent});
        }
    };

}