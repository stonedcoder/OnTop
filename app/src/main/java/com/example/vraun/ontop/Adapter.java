package com.example.vraun.ontop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import static java.security.AccessController.getContext;

/**
 * Created by vraun on 10-02-2017.
 */

public class Adapter extends ArrayAdapter<News> {

    public Adapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View newsListItem = convertView;
        if (newsListItem == null) {
            newsListItem = LayoutInflater.from(getContext()).inflate(R.layout.list, parent, false);
        }

        News currentNews = getItem(position);

        ImageView newsImageView = (ImageView) newsListItem.findViewById(R.id.news_image);
        TextView titleTextView = (TextView) newsListItem.findViewById(R.id.headline);
        TextView authorTextView = (TextView) newsListItem.findViewById(R.id.author);

//        if (currentNews.hasImage()) {
//            Picasso.with(getContext()).load(currentNews.getImageResource()).into(newsImageView);
//            newsImageView.setVisibility(View.VISIBLE);
//        } else {
//            newsImageView.setVisibility(View.GONE);
//        }

        titleTextView.setText(currentNews.getTitle());
        authorTextView.setText(currentNews.getAuthor());

        return newsListItem;
    }

}


}
