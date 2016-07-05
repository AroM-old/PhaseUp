package com.example.android.phaseup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class BlueBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue_book);

        ArrayList<BlueBookQuestions> blueBookList = new ArrayList<BlueBookQuestions>();
        blueBookList.add(new BlueBookQuestions("What is the purpose of the Honor Code at the 128th Aviation Brigade?", "The purpose is to instill " +
                "an enviroment where academic, personel, and professional achievement flourish while maintaining academic integrity."));
        blueBookList.add(new BlueBookQuestions("Write 3 violations to the Honor Code?", "Cheating, plagiarism, innapropiate personal or professional behavior."));
        blueBookList.add(new BlueBookQuestions("The 1-222d Aviation Regiment is also recognize as?", "Skymaster or triple deuces."));
        blueBookList.add(new BlueBookQuestions("Following what war the 222d was relocated?", "Vietnam war."));
        blueBookList.add(new BlueBookQuestions("When the 128th Aviation Brigade was activated?", "Feb. 1, 2012."));
        blueBookList.add(new BlueBookQuestions("What recognition was awarded to the 222d for its service in Vietnam war?", "The Meritorious Unit Commendation."));
        blueBookList.add(new BlueBookQuestions("What is the motto of the 128th Aviation Brigade?", "Born Under Fire."));
        blueBookList.add(new BlueBookQuestions("What is the purpose of the Blue Book?", "The purpose is to inform Soldiers of the Aviation Warfighting Center and Fort Eustis " +
                "about basic standards for individual discipline, appereance, conduct, and military courtesy as established by both Army and Fort Eustis regulations."));
        blueBookList.add(new BlueBookQuestions("Where do you store the headgear when it is not worn?", "In the ACU cargo pockets."));
        blueBookList.add(new BlueBookQuestions("How the personnel must wear the patrol cap?", "Straight in the head so that the cap band creates a straight line around " +
                "the head, parallel to the ground."));
        blueBookList.add(new BlueBookQuestions("How many inches above the eyebrows the beret is worn?", "1 inch"));
        blueBookList.add(new BlueBookQuestions("True or False that the sideburns will not extend below the buttom of the hear opening?", "True."));
        blueBookList.add(new BlueBookQuestions("Where is worn the organizational patches?", "Organizational patches are centered on the hook and loop-faced pad already provided " +
                "on the left sleeve of the ACU coat."));
        blueBookList.add(new BlueBookQuestions("Mention two unanthorize male hair style?", "Mohawk or Horseshoe"));
        blueBookList.add(new BlueBookQuestions("How long must be the female bun when extended?", "Maximum of 3 inch from the scalp."));
        blueBookList.add(new BlueBookQuestions("Is the tongue splitting authorize?", "Not."));
        blueBookList.add(new BlueBookQuestions("Write two facilities that are authorize to use IAW their phase privileges?", "Library and PX."));
        blueBookList.add(new BlueBookQuestions("What Army regulation talk about physical readiness?", "AR 350-1 Army Training and Leader Development."));
        blueBookList.add(new BlueBookQuestions("What is the name of your platoon sergeant?", "PSG \'Rank Last Name\'"));
        blueBookList.add(new BlueBookQuestions("During physical training soldiers can or can't wear headphones?", "Can't wear."));
        blueBookList.add(new BlueBookQuestions("Retired militar personnel deserve the respect normally afforded their active duty rank?", "Yes."));
        blueBookList.add(new BlueBookQuestions("What do you do if when driving you heard the \"Retreat\" or \"Reveille\"?", "Soldier will exit the vehicule and render the proper " +
                "military courtesy. Patriotics civilians will stop and place their right hand over their heart."));
        blueBookList.add(new BlueBookQuestions("Walk and talk/text with the cellphone while in uniform is authorized?", "Not, Is not authorized."));
        blueBookList.add(new BlueBookQuestions("What are three prohited items to keep with you or inside the rooms?", "Drugs, Food, Pornography."));
        blueBookList.add(new BlueBookQuestions("Write the 9 steps to clear a weapon?", "-Refer to your Blue Book-"));


        BlueBookAdapter blueBookQuestionsAdapter = new BlueBookAdapter(this, blueBookList);
        ListView listView = (ListView) findViewById(R.id.activity_blue_book);
        listView.setAdapter(blueBookQuestionsAdapter);
    }
}
