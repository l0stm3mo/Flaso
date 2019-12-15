package com.example.flaso;

public class Word {
    private String mNama;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    private String mScreen;
    private String mCamera;
    private String mMemory;
    private String mChipset;
    private String mBattery;
    /**
     * Create a new Word object.
     */
    public Word(String Nama, int imageResourceId, String Screen, String Camera, String Memory, String Chipset, String Battery) {
        mNama = Nama;
        mImageResourceId = imageResourceId;
        mScreen = Screen;
        mCamera = Camera;
        mMemory = Memory;
        mChipset = Chipset;
        mBattery = Battery;
    }

    /**
     *
     */
    public String getNama() {
        return mNama;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getScreen() {
        return mScreen;
    }

    public String getCamera() {
        return mCamera;
    }

    public String getMemory() {
        return mMemory;
    }

    public String getChipset() {
        return mChipset;
    }

    public String getBattery() {
        return mBattery;
    }
}
