package com.example.project10;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater i = getMenuInflater();
        i.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.m1)
        {
            Toast.makeText(this, "You selected Settings", Toast.LENGTH_SHORT).show();
        }
        else if (id==R.id.m2)
        {
            Toast.makeText(this, "You selected About", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "You selected Versions", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}