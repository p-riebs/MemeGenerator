package com.example.parker.memegenerator;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Motivation extends AppCompatActivity {

    ImageView image;
    private Button button3;
    int lastSound;
    MediaPlayer mp;
    AnimationDrawable animate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);

        getSupportActionBar().setTitle("Motivation!");

        image = (ImageView) findViewById(R.id.imageView2);
        button3 = (Button) findViewById(R.id.button3);
        final int[] sounds = getSounds();

        image.setBackgroundResource(R.drawable.djkhaled_animation);
        animate = (AnimationDrawable) image.getBackground();
        animate.setOneShot(false);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playRandomSound(sounds);
            }
        });

    }

    private void playRandomSound(int[] sounds) {

        Random getRand = new Random();

        int randomSound = getRand.nextInt(7);

        while(randomSound == lastSound)
        {
            randomSound = getRand.nextInt(7);
        }

        animate.start();

        mp = MediaPlayer.create(this, sounds[randomSound]);

        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
            public void onCompletion(MediaPlayer player) {
                animate.stop();
                mp.release();
            }});

        mp.start();

        lastSound = randomSound;
    }

    private int[] getSounds()
    {
        int[] sounds = new int[7];
        sounds[0] = R.raw.i_appreciate_you;
        sounds[1] = R.raw.save_dat_money;
        sounds[2] = R.raw.we_the_best;
        sounds[3] = R.raw.win_win_win;
        sounds[4] = R.raw.you_a_genius;
        sounds[5] = R.raw.you_loyal;
        sounds[6] = R.raw.you_smart;

        return sounds;
    }
}
