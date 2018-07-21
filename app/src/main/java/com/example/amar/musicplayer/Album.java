package com.example.amar.musicplayer;

public class Album {

    /**
     * String resource ID for the default singer name of the audio
     */
    private int mSingerNameId;

    /**
     * String resource ID for the song name of the audio
     */
    private int mSongNameId;

    /**
     * Audio resource ID for the audio
     */
    private int mAudioResourceId;

    /**
     * Image resource ID for the audio
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this audio
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Album(int singerNameId, int songNameId, int audioResourceId) {
        mSingerNameId = singerNameId;
        mSongNameId = songNameId;
        mAudioResourceId = audioResourceId;
    }

    public Album(int singerNameId, int songNameId, int imageResourceId, int audioResourceId) {
        mSingerNameId = singerNameId;
        mSongNameId = songNameId;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the string resource ID for the singer name of the audio.
     */
    public int getSingerNameId() {
        return mSingerNameId;
    }

    /**
     * Get the string resource ID for the song name of the audio.
     */
    public int getSongName() {
        return mSongNameId;
    }

    /**
     * Return the image resource ID of the audio.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this audio.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the audio.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}