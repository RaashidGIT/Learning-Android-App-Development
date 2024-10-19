package com.example.project20;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
    }
    public void register(View v)
    {
        SharedPreferences sp = getSharedPreferences("My pref",0);
        SharedPreferences.Editor ed=sp.edit();
        ed.putString("Username",e1.getText().toString());
        ed.putString("Password",e2.getText().toString());
        ed.commit();
    }
    public void login(View v)
    {
        SharedPreferences sp = getSharedPreferences("My pref",0);
        String u = e1.getText().toString();
        String p = e2.getText().toString();
        String k = sp.getString("Username" ," ");
        String k2 = sp.getString("Password" ," ");
        if(k.equals(u)&&k2.equals(p)){
            Toast.makeText(this,"Login Success", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"Login Failed",Toast.LENGTH_SHORT).show();
        }

    }
    public void reset(View v)
    {
        e1.setText("");
        e2.setText("");
    }

}