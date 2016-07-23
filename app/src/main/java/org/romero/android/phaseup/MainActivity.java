package org.romero.android.phaseup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Call BlueBook Activity
        TextView blueBook = (TextView) findViewById(R.id.blue_book);

        //Set a click listener in that View
        blueBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent blueBookIntent = new Intent(MainActivity.this, BlueBookActivity.class);
                startActivity(blueBookIntent);
            }
        });

        //Call Aviation Song Activity
        TextView aviationSong = (TextView) findViewById(R.id.aviation_songs);

        //Set a click listener in that View
        aviationSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aviationIntent = new Intent(MainActivity.this, AviationSongActivity.class);
                startActivity(aviationIntent);
            }
        });

        //Call Soldier's Creed Activity
        TextView soldierCreed = (TextView) findViewById(R.id.soldier_creed);

        //Set a click listener in that View
        soldierCreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent soldierCreedIntent = new Intent(MainActivity.this, SoldierCreedActivity.class);
                startActivity(soldierCreedIntent);
            }
        });

        //Call Room Inspection Activity
        TextView roomInspection = (TextView) findViewById(R.id.room_inspection);

        //Set a click listener in that View
        roomInspection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent roomInspectionIntent = new Intent(MainActivity.this, RoomInspectionActivity.class);
                startActivity(roomInspectionIntent);
            }
        });

        //Call Wall Locker Inspection Activity
        TextView wallLocker = (TextView) findViewById(R.id.wall_Locker_inspection);

        //Set a click listener in that View
        wallLocker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wallLockerIntent = new Intent(MainActivity.this, WallLockerActivity.class);
                startActivity(wallLockerIntent);
            }
        });

        //Call ASU Inspection Activity
        TextView asuInspection = (TextView) findViewById(R.id.asu_inspection);

        //Set a click listener in that View
        asuInspection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asuIntent = new Intent(MainActivity.this, ASUActivity.class);
                startActivity(asuIntent);
            }
        });

        //Feedback button.
        TextView sendFeedBack = (TextView) findViewById(R.id.send_feedback);
        sendFeedBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendFeedbackIntent = new Intent(Intent.ACTION_SENDTO);
                sendFeedbackIntent.setData(Uri.parse("mailto: algenisromero@gmail.com"));
                sendFeedbackIntent.putExtra(Intent.EXTRA_SUBJECT, "Phase UP Support.");
                if (sendFeedbackIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(sendFeedbackIntent);
                }
            }
        });

    }
}
