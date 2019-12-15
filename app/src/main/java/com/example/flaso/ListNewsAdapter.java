package com.example.flaso;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.flaso.MainActivity;
import com.example.flaso.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by SHAJIB-PC on 9/9/2019.
 */

class ListNewsAdapter extends BaseAdapter {
    private Activity activity;
    private ArrayList<HashMap<String, String>> data;

    public ListNewsAdapter(Activity a, ArrayList<HashMap<String, String>> d) {
        activity = a;
        data=d;
    }
    public int getCount() {
        return data.size();
    }
    public Object getItem(int position) {
        return position;
    }
    public long getItemId(int position) {
        return position;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        ListNewsViewHolder holder = null;
        if (convertView == null) {
            holder = new ListNewsViewHolder();
            convertView = LayoutInflater.from(activity).inflate(
                    R.layout.list_row, parent, false);
            holder.Image = (ImageView) convertView.findViewById(R.id.Image);
            holder.title = (TextView) convertView.findViewById(R.id.title);
            holder.url = (TextView) convertView.findViewById(R.id.url);
            convertView.setTag(holder);
        } else {
            holder = (ListNewsViewHolder) convertView.getTag();
        }
        holder.Image.setId(position);
        holder.title.setId(position);
        holder.url.setId(position);

        HashMap<String, String> song = new HashMap<String, String>();
        song = data.get(position);

        try{
            holder.title.setText(song.get(ScndActivity.KEY_TITLE));
            holder.url.setText(song.get(ScndActivity.KEY_URL));

            if(song.get(ScndActivity.KEY_IMAGE).toString().length() < 5)
            {
                holder.Image.setVisibility(View.GONE);
            }else{
                Picasso.get()
                        .load(song.get(ScndActivity.KEY_IMAGE))
                        .resize(400, 530)
                        .centerCrop()
                        .into(holder.Image);
            }
        }catch(Exception e) {}
        return convertView;
    }
}

class ListNewsViewHolder {
    ImageView Image;
    TextView title, url;
}