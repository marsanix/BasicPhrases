package com.marsanix.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int[] phrases = {
            R.raw.welcome,
            R.raw.howareyou,
            R.raw.iamfine,
            R.raw.nicetomeetyou,
            R.raw.mynameis,
            R.raw.iloveyou,
            R.raw.ihateyou,
            R.raw.goodby
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void buttonClicked(View view) {
        int id = Integer.parseInt(view.getTag().toString());

        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), phrases[id]);
        mp.start();

        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
    }
}