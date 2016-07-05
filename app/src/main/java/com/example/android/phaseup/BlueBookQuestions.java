package com.example.android.phaseup;

/**
 * Created by algenisromero on 7/3/16.
 */

public class BlueBookQuestions {

//   Blue Book Questions to show
    private String mBlueBookQueston;

//    Blue Book Answers
    private String mBlueBookAnswer;

    /*
    * Create a new BlueBook object.
    *
    * @param vName is the name of the Android version (e.g. Gingerbread)
    * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
    * @param image is drawable reference ID that corresponds to the Android version
    * */
    public BlueBookQuestions(String vQuestions, String vAnswer){
        mBlueBookQueston = vQuestions;
        mBlueBookAnswer = vAnswer;
    }

    /**
     * Get the Question
     */
    public String getBlueBookQueston() {
        return mBlueBookQueston;
    }
    /**
     * Get the Answer
     */
    public String getBlueBookAnswer() {
        return mBlueBookAnswer;
    }
}
