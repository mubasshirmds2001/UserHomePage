package com.mubasshir.userhomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Homepage extends AppCompatActivity {
    Button click;
    ImageButton labour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        labour=(ImageButton) findViewById(R.id.imgbtn_labour);

        labour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Homepage.this, "Button clicked successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}