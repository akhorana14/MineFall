package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void onStartTap(View view) {
        view.setVisibility(View.INVISIBLE); // Sets the button as invisible
        Game instanceGame = new Game(); //Creates a new instance of the Game class
        instanceGame.start(); //Starts the game
    }

}