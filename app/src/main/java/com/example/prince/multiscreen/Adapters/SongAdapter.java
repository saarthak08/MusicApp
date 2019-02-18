package com.example.prince.multiscreen.Adapters;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.prince.multiscreen.R;
import com.example.prince.multiscreen.SongList;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends ArrayAdapter<SongList> {
    public SongAdapter(Context context, ArrayList<SongList>list) {
        super(context,0,list);
    }
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
       View listitemView =convertView;
       if (listitemView==null) {
       listitemView=LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
       }
       SongList currentSongList= (SongList) getItem(position);
        TextView song= (TextView) listitemView.findViewById(R.id.song);
        song.setText(currentSongList.getMsongName());
        TextView singer= (TextView) listitemView.findViewById(R.id.singer);
        singer.setText(currentSongList.getMsingerName());
        TextView time= (TextView) listitemView.findViewById(R.id.time);
        time.setText(currentSongList.getSongDuration());
        ImageView img= (ImageView) listitemView.findViewById(R.id.image);
        img.setImageResource(R.drawable.cover_art);
        return listitemView;
    }
}