package com.example.android.phaseup;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AviationSongActivity extends AppCompatActivity {

    //Media Player variable.
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviation_song);

        //Create and Upload the MP3 file.
        mMediaPlayer = MediaPlayer.create(this, R.raw.aviationsong);


        //The aviation song text show in the screen.
        TextView textViewAviation = (TextView) findViewById(R.id.textview_aviation);
        textViewAviation.setText("High above the best, high above the best \n\n" +
                "We are Army Aviation USA, \n\n" +
                "proud and strong We meet the test \n\n" +
                "Skies filled with thunder \n\n" +
                "Wearing silver wings upon our chest \n\n" +
                "We meet the needs of Ground Command \n\n" +
                "As we aid the Nation's quest \n\n" +
                "Army Aviation, flying high above the best!");

        //Listener to play sound when user touched.
        Button playButton = (Button) findViewById(R.id.play_sound);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mMediaPlayer.start();

            }
        });
    }
}