package com.example.android.newsapp;

import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Salvador on 16/10/2016.
 */

public class News {

    private String mTitle;
    private ArrayList<String> mAuthor;
    private URL mNews;
    private String mSection;
    private String mPublicationDate;

    public News (String title, ArrayList<String> author, String section, String publication, URL news) {

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

    public URL getmNews() {
        return mNews;
    }

    public String getmSection() {
        return mSection;
    }


    public String getmPublicationDate() {
        return mPublicationDate;
    }
}
