package com.example.project12;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rg = findViewById(R.id.radiogroup);
        rg.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        String msg = "";
        if ( checkedId == R.id.radioButton)
            msg = "Male";
        else if (checkedId == R.id.radioButton2)
            msg = "Female";
        else
            msg = "Other";
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show();
    }
}