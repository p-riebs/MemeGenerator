package com.example.parker.memegenerator;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Coolest App in the Universe");

        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        image = (ImageView) findViewById(R.id.imageView4);

        resetPicture();

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetPicture();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ShowMeTheMemes.class));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Motivation.class));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ProgrammerJokes.class));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DJKhaledBio.class));
            }
        });
    }

    public void resetPicture() {
        Random getRand = new Random();

        int randomPic = getRand.nextInt(9);

        String[] pictures = getPictures();

        int imageRes = getResources().getIdentifier(pictures[randomPic], null, getPackageName());
        Drawable res = getResources().getDrawable(imageRes);
        image.setImageDrawable(res);

        return;
    }

    private String[] getPictures() {
        String[] cute = new String[10];

        cute[0] = "@drawable/j";
        cute[1] = "@drawable/j";
        cute[2] = "@drawable/k";
        cute[3] = "@drawable/l";
        cute[4] = "@drawable/m";
        cute[5] = "@drawable/n";
        cute[6] = "@drawable/o";
        cute[7] = "@drawable/p";
        cute[8] = "@drawable/q";
        cute[9] = "@drawable/r";

        return cute;
    }
}
