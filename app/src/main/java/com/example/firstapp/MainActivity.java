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

        Runnable startAnimation = new Runnable() {
            @Override
            public void run() {
                if(startIsPressed)
                {
                    start.setAlpha(0);
                    return;
                }
                else
                {
                    if(start.getAlpha() == 1)
                    {
                        for(int i = 1; i > 0; i-=.01)
                        {
                            start.setAlpha(i);
                        }
                    }
                    else if(start.getAlpha() == 0)
                    {
                        for(int i = 0; i < 1; i+=.01)
                        {
                            start.setAlpha(i);
                        }
                    }
                }
            }
        };


        startAnimation.run();

    }



    public void onStartTap(View view) {
        startIsPressed = true;
        view.setVisibility(View.INVISIBLE); // Sets the button as invisible
        start.setVisibility(View.INVISIBLE);
        Game instanceGame = new Game(); //Creates a new instance of the Game class
        instanceGame.start(); //Starts the game
    }

}