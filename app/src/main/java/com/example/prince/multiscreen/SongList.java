package com.example.prince.multiscreen;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class SongList {


    private String msongName;
    private String msingerName;
    private String songDuration;
    private String maudioResourceId;
    private String mImage;

    public SongList(String msongName, String msingerName, String songDuration, String maudioResourceId, String x) {
        this.msongName = msongName;
        this.msingerName = msingerName;
        this.songDuration = songDuration;
        this.maudioResourceId = maudioResourceId;
        mImage=x;
    }


    public String getMsongName() {
        return msongName;
    }

    public String getMsingerName() {
        return msingerName;
    }

    public String getMaudioResourceId() {
        return maudioResourceId;
    }

    public String getSongDuration() {
        return songDuration;
    }
    public String getSongImage()
    {
       return  mImage;
    }
}
