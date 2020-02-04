package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void playSound(View view) {
        String tag = view.getTag().toString();
        Log.i("button tag", tag);
        switch(tag) {
            case "0":
                mediaPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
                break;
            case "1":
                mediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
                break;
            case "2":
                mediaPlayer = MediaPlayer.create(this, R.raw.hello);
                break;
            case "3":
                mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
                break;
            case "4":
                mediaPlayer = MediaPlayer.create(this, R.raw.ilivein);
                break;
            case "5":
                mediaPlayer = MediaPlayer.create(this, R.raw.mynameis);
                break;
            case "6":
                mediaPlayer = MediaPlayer.create(this, R.raw.please);
                break;
            case "7":
                mediaPlayer = MediaPlayer.create(this, R.raw.welcome);
                break;
        }

        //Button buttonPressed = (Button) view;
        //MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(tag.toString(), "raw", getPackageName()));

        mediaPlayer.start();
    }
}
