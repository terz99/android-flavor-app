package com.example.terz99.androidflavor;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by terz99 on 3/15/17.
 */

class AndroidFlavorAdapter extends ArrayAdapter<AndroidFlavor> {

    public AndroidFlavorAdapter(Context context, ArrayList<AndroidFlavor> androidFlavors){
        super(context, 0, androidFlavors);
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        View listView = convertView;
        if(listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        AndroidFlavor currentAndroidFlavor = getItem(position);

        ImageView icon = (ImageView) listView.findViewById(R.id.image);
        TextView versionNameTextView = (TextView) listView.findViewById(R.id.version_name);
        TextView versionNumberTextView = (TextView) listView.findViewById(R.id.version_number);

        icon.setImageResource(currentAndroidFlavor.getImageResourceId());
        versionNameTextView.setText(currentAndroidFlavor.getVersionName());
        versionNumberTextView.setText(currentAndroidFlavor.getVersionNumber());

        return listView;
    }
}
