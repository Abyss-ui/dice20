package com.example.dice20;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView ImageViewDice;
    private TextView critmisses;
    private TextView crithitter;
    private MediaPlayer miss;
    private MediaPlayer hit;
    private MediaPlayer rolldice;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageViewDice = findViewById(R.id.image_view_dice);
        hit = MediaPlayer.create(MainActivity.this,R.raw.cithit);
        miss = MediaPlayer.create(MainActivity.this,R.raw.critmiss);
        rolldice = MediaPlayer.create(MainActivity.this,R.raw.rollit);
        critmisses = findViewById(R.id.Betty);
        crithitter = findViewById(R.id.Dorthy);
        ImageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }

    private void rollDice() {

        int randomNumber = rng.nextInt(20) + 1;
        rolldice.start();
        if(critmisses.isShown())
            critmisses.setVisibility(View.INVISIBLE);

            if(crithitter.isShown())
            crithitter.setVisibility(View.INVISIBLE);
            switch (randomNumber) {
            case 1:
                miss.start();
                critmisses.setVisibility(View.VISIBLE);
                ImageViewDice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                ImageViewDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                ImageViewDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                ImageViewDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                ImageViewDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                ImageViewDice.setImageResource(R.drawable.dice6);
                break;
            case 7:
                ImageViewDice.setImageResource(R.drawable.dice7);
                break;
            case 8:
                ImageViewDice.setImageResource(R.drawable.dice8);
                break;
            case 9:
                ImageViewDice.setImageResource(R.drawable.dice9);
                break;
            case 10:
                ImageViewDice.setImageResource(R.drawable.dice10);
                break;
            case 11:
                ImageViewDice.setImageResource(R.drawable.dice11);
                break;
            case 12:
                ImageViewDice.setImageResource(R.drawable.dice12);
                break;
            case 13:
                ImageViewDice.setImageResource(R.drawable.dice13);
                break;
            case 14:
                ImageViewDice.setImageResource(R.drawable.dice14);
                break;
            case 15:
                ImageViewDice.setImageResource(R.drawable.dice15);
                break;
            case 16:
                ImageViewDice.setImageResource(R.drawable.dice16);
                break;
            case 17:
                ImageViewDice.setImageResource(R.drawable.dice17);
                break;
            case 18:
                ImageViewDice.setImageResource(R.drawable.dice18);
                break;
            case 19:
                ImageViewDice.setImageResource(R.drawable.dice19);
                break;
            case 20:
                hit.start();
                crithitter.setVisibility(View.VISIBLE);
                ImageViewDice.setImageResource(R.drawable.dice20);
                break;

        }
    }
}