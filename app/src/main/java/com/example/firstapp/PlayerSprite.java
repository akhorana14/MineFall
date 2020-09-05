package com.example.firstapp;
import android.app.Activity;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.view.SurfaceView;
import android.view.View;

/**
 * A class for the player sprite, its models, and actions during the game.
 *
 */
public class PlayerSprite extends AnimationDrawable {
    View v;
    Bitmap b;

    public PlayerSprite(View v, Bitmap b)
    {
        v = this.v;
        b = this.b;
    }

    public Bitmap getB() {
        return b;
    }

    public View getV() {
        return v;
    }

    public void followFinger()
    {



    }
}
