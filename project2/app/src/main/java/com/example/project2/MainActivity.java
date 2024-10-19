package com.example.project2;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText txt1;
    private EditText txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txt1  = findViewById(R.id.editTextNumber);
        txt2 =  findViewById(R.id.editTextNumber3);
    }

    public void function1(View v)
    {
        int num1 = Integer.parseInt(txt1.getText().toString());
        int num2 = Integer.parseInt(txt2.getText().toString());
        int sum = num1 + num2;
        Toast.makeText(this, "Sum = " +sum, Toast.LENGTH_SHORT).show();
    }

    public void function2(View v)
    {
        int num1 = Integer.parseInt(txt1.getText().toString());
        int num2 = Integer.parseInt(txt2.getText().toString());
        int Diff = num1 - num2;
        Toast.makeText(this, "Differnce = " +Diff, Toast.LENGTH_SHORT).show();
    }

    public void function3(View v)
    {
        int num1 = Integer.parseInt(txt1.getText().toString());
        int num2 = Integer.parseInt(txt2.getText().toString());
        int mult = num1 * num2;
        Toast.makeText(this, "Multiply = " +mult, Toast.LENGTH_SHORT).show();
    }

    public void function4(View v)
    {
        int num1 = Integer.parseInt(txt1.getText().toString());
        int num2 = Integer.parseInt(txt2.getText().toString());
        int Division = num1 / num2;
        Toast.makeText(this, "Division = " +Division, Toast.LENGTH_SHORT).show();
    }
}