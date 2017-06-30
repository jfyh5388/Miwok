package com.example.android.miwok;

/**
 * Created by nxf31834 on 6/27/2017.
 */

public class Word {
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private String mMiwokTranslation;

    private String mDefaultTranslation;

    private static final int NO_IMAGE_PROVIDED = -1;

    public int getmImageResourceId()
    {
        return mImageResourceId;
    }

    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public Word(String defaultWord, String miwokWord)
    {
        mMiwokTranslation = miwokWord;
        mDefaultTranslation = defaultWord;
    }

    public Word(int imageResourceId, String defaultWord, String miwokWord)
    {
        mImageResourceId = imageResourceId;
        mMiwokTranslation = miwokWord;
        mDefaultTranslation = defaultWord;
    }
    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
//    public void setMiwokTranslation(String text)
//    {
//        mMiwokTranslation = text;
//    }
//
//    public void setDefaultTranslation(String text)
//    {
//        mDefaultTranslation = text;
//    }
}
