package com.example.amar.musicplayer;

public class Word {

    /**
     * String resource ID for the default singer name of the word
     */
    private int mSingerNameId;

    /**
     * String resource ID for the song name of the word
     */
    private int mSongNameId;

    /**
     * Audio resource ID for the word
     */
    private int mAudioResourceId;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(int singerNameId, int songNameId, int audioResourceId) {
        mSingerNameId = singerNameId;
        mSongNameId = songNameId;
        mAudioResourceId = audioResourceId;
    }

    public Word(int singerNameId, int songNameId, int imageResourceId, int audioResourceId) {
        mSingerNameId = singerNameId;
        mSongNameId = songNameId;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the string resource ID for the singer name of the word.
     */
    public int getSingerNameId() {
        return mSingerNameId;
    }

    /**
     * Get the string resource ID for the song name of the word.
     */
    public int getSongName() {
        return mSongNameId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}