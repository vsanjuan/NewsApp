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

    public News (String title, ArrayList<String> author, String section, URL news) {

        mAuthor = author;
        mNews = news;
        mTitle = title;
        mSection = section;


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
}
