package com.fernandoim.newsappstage1;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    private List<News> currentNews;

    public NewsAdapter(Context context, List<News> theNews){
        super(context, 0, theNews);
        currentNews = theNews;
    }

    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        if (currentNews != null){

            News theNews = currentNews.get(position);
            // Find the earthquake at the given position in the list of earthquakes
            // News currentNews = getItem(position);

            // Find the TextView with view ID location
            TextView titleView = listItemView.findViewById(R.id.title_textview);
            titleView.setText(theNews.getTitle());

            TextView sectionView = listItemView.findViewById(R.id.section_textview);
            sectionView.setText(theNews.getSection());

            TextView authorView = listItemView.findViewById(R.id.author_textview);
            authorView.setText(theNews.getAuthor());

        }
        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
