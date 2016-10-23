package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Salvador on 20/10/2016.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news  is the list of news, which is the data source of the adapter
     */

    public NewsAdapter(Context context, List<News> news) {

        super(context,0,news);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list, parent, false);
        }

        // Find the news at the given position in the list of earthquakes
        News currentNews = getItem(position);

        // Find the TextView with the section
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        // Display the section of the current news in that TextView
        sectionView.setText(currentNews.getmSection());

        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        // TODO: Format the view and populate it with an author's Array
        authorView.setText(currentNews.getmAuthor().get(0));

        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(currentNews.getmTitle());

        TextView dateView = (TextView) listItemView.findViewById(R.id.news_date);
        dateView.setText(currentNews.getmPublicationDate());

        return listItemView;

    }


}
