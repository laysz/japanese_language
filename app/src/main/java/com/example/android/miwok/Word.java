package com.example.android.miwok;

/**
 * Created by startupuser on 2017/10/05.
 */

public class Word {

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int maudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = maudioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int mimageResourceId, int maudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = mimageResourceId;
        mAudioResourceId = maudioResourceId;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

}
