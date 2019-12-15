package com.example.flaso;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Word} objects.
 */
public class WordAdapter extends ArrayAdapter<Word>  {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Word}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView TextNama = (TextView) listItemView.findViewById(R.id.nama);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        TextNama.setText(currentWord.getNama());


        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.gambar);
        imageView.setImageResource(currentWord.getImageResourceId());
        // Make sure the view is visible
        imageView.setVisibility(View.VISIBLE);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView TextScreen = (TextView) listItemView.findViewById(R.id.screen);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        TextScreen.setText(currentWord.getScreen());

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView TextCamera = (TextView) listItemView.findViewById(R.id.camera);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        TextCamera.setText(currentWord.getCamera());

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView TextMemory = (TextView) listItemView.findViewById(R.id.memory);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        TextMemory.setText(currentWord.getMemory());

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView TextChipset = (TextView) listItemView.findViewById(R.id.chipset);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        TextChipset.setText(currentWord.getChipset());

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView TextBattery = (TextView) listItemView.findViewById(R.id.battery);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        TextBattery.setText(currentWord.getBattery());


        // Set the theme color for the list item
        View listMenu = listItemView.findViewById(R.id.list_menu);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        listMenu.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}