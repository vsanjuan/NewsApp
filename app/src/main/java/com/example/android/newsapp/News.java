package com.example.android.newsapp;

import android.net.Uri;

import java.util.ArrayList;

/**
 * Created by Salvador on 16/10/2016.
 */

public class News {

    private String mTitle;
    private ArrayList<String> mAuthor;
    private Uri mNews;
    private String mSection;
    private String mPublicationDate;

    public News (String title, ArrayList<String> author, String section, String publication, Uri news) {

        mAuthor = author;
        mNews = news;
        mTitle = title;
        mSection = section;
        mPublicationDate = publication;


    }

    public String getmTitle() {

        return mTitle;
    }

    public ArrayList<String> getmAuthor() {

        return mAuthor;
    }

    public Uri getmNews() {
        return mNews;
    }

    public String getmSection() {
        return mSection;
    }


    public String getmPublicationDate() {
        return mPublicationDate;
    }
}
