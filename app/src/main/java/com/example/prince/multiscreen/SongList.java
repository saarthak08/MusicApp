package com.example.prince.multiscreen;


public class SongList {


    private String msongName;
    private String msingerName;
    private String songDuration;
    private int mimageResourecId;
    private String maudioResourceId;

    public SongList(String msongName, String msingerName, String songDuration, int mimageResourecId,String maudioResourceId) {
        this.msongName = msongName;
        this.msingerName = msingerName;
        this.songDuration = songDuration;
        this.mimageResourecId = mimageResourecId;
        this.maudioResourceId = maudioResourceId;
    }

    public int getMimageResourecId() {
        return mimageResourecId;
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
}
