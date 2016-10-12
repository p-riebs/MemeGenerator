package com.example.parker.memegenerator;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class ShowMeTheMemes extends AppCompatActivity {

    private Button button;
    private ImageView image;

    private String[] memes;

    private int currentMeme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_me_the_memes);

        getSupportActionBar().setTitle("Meme Generator");

        button = (Button) findViewById(R.id.button);
        image = (ImageView) findViewById(R.id.imageView);

        addMeme();
        resetChooses();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Another One!", Toast.LENGTH_SHORT).show();

                resetChooses();
            }
        });
    }

    public void resetChooses() {
        Random getRand = new Random();

        int randomMeme = getRand.nextInt(9);

        while(randomMeme == currentMeme)
        {
            randomMeme = getRand.nextInt(9);
        }

        int imageRes = getResources().getIdentifier(memes[randomMeme], null, getPackageName());
        Drawable res = getResources().getDrawable(imageRes);
        image.setImageDrawable(res);

        currentMeme = randomMeme;

        return;
    }


    private String[] addMeme() {
        memes = new String[9];

        memes[0] = "@drawable/a";
        memes[1] = "@drawable/b";
        memes[2] = "@drawable/c";
        memes[3] = "@drawable/d";
        memes[4] = "@drawable/e";
        memes[5] = "@drawable/f";
        memes[6] = "@drawable/g";
        memes[7] = "@drawable/h";
        memes[8] = "@drawable/i";

        return memes;
    }
}
