package com.example.project16;

import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Chronometer.OnChronometerTickListener{
    Chronometer c;
    int s=0,m=0,h=0;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        c = findViewById(R.id.c);
        c.setBase(0);
        c.setOnChronometerTickListener(this);
    }
    @Override
    public void onChronometerTick(Chronometer chronometer) {
        s++;
        if(s==60)
        {
            m=m+1;
            s=0;
        }
        if(m==60)
        {
            h+=1;
            m=0;
        }
        tv.setText(h+":"+m+":"+s);
    }
    public void Start(View v) {
        c.start();
    }
    public void Pause(View v) {
        c.stop();
    }
    public void Reset(View v) {
        c.stop();
        s=0;
        tv.setText("00:00:00");
    }

}