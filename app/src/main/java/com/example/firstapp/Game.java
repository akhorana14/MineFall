package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

/**
 * A class that is considered an instance of a "Game," or a time when the user presses the screen to await digging down
 * Keeps track of:
 * score - increases by x when moving down one block
 * WIP materials - ores / resources gained through mining
 *
 * @author Arjun Khorana
 * Current issue - Emulator crashes computer, leaving no immediate method to test.
 */

public class Game extends AppCompatActivity {

    int score;
    PlayerSprite player;

    public Game()
    {
        score = 0;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int s)
    {
        score = s;
    }

    public void start()
    {
        //graphical changes to game starting
    }




}
