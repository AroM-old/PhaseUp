package com.example.android.phaseup;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by algenisromero on 7/3/16.
 */

public class BlueBookAdapter extends ArrayAdapter<BlueBookQuestions> {

    public BlueBookAdapter(Activity context, ArrayList<BlueBookQuestions> blueBook) {
        super(context, 0, blueBook);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link BlueBookQuestions} object located at this position in the list
        BlueBookQuestions currentBlueBook = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.question);
        // Get the version name from the current BlueBookQuestions object and
        // set this text on the name TextView
        nameTextView.setText(currentBlueBook.getBlueBookQueston());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.answer);
        // Get the version number from the current BlueBookQuestions object and
        // set this text on the number TextView
        numberTextView.setText(currentBlueBook.getBlueBookAnswer());

        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;

    }
}
