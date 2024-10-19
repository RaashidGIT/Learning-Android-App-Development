package com.example.project17;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void generate(View v){
        EditText et = findViewById(R.id.et);
        EditText et2 = findViewById(R.id.et1);
        String s1 = et.getText().toString();
        int n = Integer.parseInt(s1);
        int m = 1;
        int i = 0;
        int j = 0;
        String s;
        StringBuilder sb = new StringBuilder();
        for (i = 1;i<=n;i++) {
            s = "";
            for (j = 1; j <= n; j++) {
                s = s + i * j + " ";
            }
            sb.append(s);
            sb.append("\n");
            et2.setText(sb.toString());
        }
    }

}