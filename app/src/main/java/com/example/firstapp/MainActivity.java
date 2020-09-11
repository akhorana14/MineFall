package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    boolean startIsPressed = false;
    View start = findViewById(R.id.startWord);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startScreen();
    }

    public void startScreen()
    {


        int opacity = 100;
        while(!startIsPressed)
        {
            if(opacity == 100)
            {
                for(opacity = 100; opacity > 0; opacity--)
                {
                    start.setAlpha(opacity);
                }
            }
            else if(opacity == 0)
            {
                for(opacity = 0; opacity < 100; opacity++)
                {
                    start.setAlpha(opacity);
                }
            }

        }

    }



    public void onStartTap(View view) {
        startIsPressed = true;
        view.setVisibility(View.INVISIBLE); // Sets the button as invisible
        start.setVisibility(View.INVISIBLE);
        Game instanceGame = new Game(); //Creates a new instance of the Game class
        instanceGame.start(); //Starts the game
    }

}