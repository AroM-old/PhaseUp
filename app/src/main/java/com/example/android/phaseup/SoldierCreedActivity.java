package com.example.android.phaseup;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SoldierCreedActivity extends AppCompatActivity {

    //Media Player variable.
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soldier_creed);

        //Create and Upload the MP3 file.
        mMediaPlayer = MediaPlayer.create(this, R.raw.soldierscreed);


        //Show Soldier's Creed text on screen.
        TextView textViewCreed = (TextView)findViewById(R.id.textview_creed);
        textViewCreed.setText("The Soldier's Creed\n\n"+
                "I am an American Soldier. \n" + "I am a Warrior and a member of a team. \n" +
                "I serve to the people of the United States and live the Army Values. \n\n" +
                "I will always place the mission first. \n" + "I will never accept defeat. \n" + "I will never quit. \n" +
                "I will never leave a fallen comrade. \n\n" +
                "I am disciplined, physically and mentally tough, trained and proficient in my warrior tasks and drills. I always maintain my arms, my equipment and myself. \n" +
                "I am an expert and I am a professional. \n\n" + "I stand ready to deploy, engage, and destroy the enemies of the United States of America in close combat. \n" +
                "I am a guardian of freedom and the American way of life. \n\n" +
                "I am an American Soldier.");

        //Listener to play sound when user touched.
        final Button playButton = (Button) findViewById(R.id.play_creed);

        //Listener to show play and pause the audio and change the text.
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mMediaPlayer.isPlaying()){
                    mMediaPlayer.pause();
                    mMediaPlayer.seekTo(0);
                    playButton.setText("Play!");
                }else {
                    mMediaPlayer.start();
                    playButton.setText("Pause!");
                }

            }

        });
    }
}
