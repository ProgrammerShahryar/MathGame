package com.example.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MathGame2 extends AppCompatActivity {
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button closeBtn;

    public void one(View view){
        Toast.makeText(getApplicationContext(), "Correct! " + getIntent().getStringExtra("name"), Toast.LENGTH_LONG).show();

                closeBtn.setVisibility(View.VISIBLE);
    }

    public void two(View view){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Wrong",
                Toast.LENGTH_SHORT);

        toast.show();
    }

    public void three(View view){

        Toast toast = Toast.makeText(getApplicationContext(),
                "Wrong",
                Toast.LENGTH_SHORT);

        toast.show();
    }

    public void four(View view){

        Toast toast = Toast.makeText(getApplicationContext(),
                "Wrong",
                Toast.LENGTH_SHORT);

        toast.show();

    }

    public void close(View view){
        Intent intent = new Intent(MathGame2.this, MainActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_game2);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        closeBtn = findViewById(R.id.closeBtn);
    }
}
