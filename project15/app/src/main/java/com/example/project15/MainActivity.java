package com.example.project15;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    TextView tv1;
    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.textview);
        tv2 = findViewById(R.id.textview2);
    }
    public void Set(View v){
        if(v.getId()==R.id.b1){
            TimePickerDialog tp = new TimePickerDialog(this,this,11,15,false);
            tp.show();
        }
        if (v.getId()==R.id.b2){
            DatePickerDialog dp = new DatePickerDialog(this,this,2023,2,6);
            dp.show();
        }
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        tv2.setText(year+"/"+(month+1)+"/"+dayOfMonth);
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        tv1.setText(hourOfDay+":"+minute);
    }
}