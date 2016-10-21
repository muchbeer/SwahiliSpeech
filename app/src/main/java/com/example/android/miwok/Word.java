package com.example.android.miwok;

import android.content.Intent;

/**
 * Created by muchbeer on 10/19/2016.
 */
public class Word {

    private String mDefaultTranslation;

    private String mSwahiliTranslation;

    private int mImageResourceId;


    public Word(String defaultTranslation, String swahiliTranslation, int imageResourceId) {

        mDefaultTranslation = defaultTranslation;
        mSwahiliTranslation = swahiliTranslation;
        mImageResourceId = imageResourceId;
    }

    /*
    //this happen when we have another screen that contain list item with only two variables
    public Word(String defaultTranlation, String swahiliTranslation) {
        mDefaultTranslation = defaultTranlation;
        mSwahiliTranslation = swahiliTranslation;

    }

    */
    //get the default translation of the word
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //get the swahili translation of the word
    public String getSwahiliTranslation() {
        return mSwahiliTranslation;
    }

    public int getmImageResourceId() {

        return mImageResourceId;
    }
}
