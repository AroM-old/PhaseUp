package com.example.android.phaseup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SoldierCreedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soldier_creed);

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
    }

}
