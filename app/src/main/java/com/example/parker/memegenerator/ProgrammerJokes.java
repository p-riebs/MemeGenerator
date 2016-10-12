package com.example.parker.memegenerator;

import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.ImageView;

public class ProgrammerJokes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programmer_jokes);

        getSupportActionBar().setTitle("Programmer Jokes");

        ImageView image = (ImageView) findViewById(R.id.imageView3);

        image.setBackgroundResource(R.drawable.terminal_animation);
        AnimationDrawable animate = (AnimationDrawable) image.getBackground();
        animate.setOneShot(false);

        animate.start();
    }
}
