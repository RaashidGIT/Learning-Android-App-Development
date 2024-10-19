package com.example.project5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.imageView);
        Button b1 = findViewById(R.id.button5);
        Button b2 = findViewById(R.id.button6);
        Button b3 = findViewById(R.id.button7);
        Button b4 = findViewById(R.id.button8);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button5)
        {
            iv.setImageResource(R.drawable.female1);
        }
        else if (v.getId()==R.id.button6) {
            iv.setImageResource(R.drawable.female2);
        }
        else if (v.getId()==R.id.button7) {
            iv.setImageResource(R.drawable.male1);
        }
        else {
            iv.setImageResource(R.drawable.male2);
        }
    }
}