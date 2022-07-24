package com.developer.mk.newstime.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.developer.mk.newstime.R;
import com.developer.mk.newstime.activities.NewsDetailActivity;
import com.developer.mk.newstime.model.HomepageModel;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    List<HomepageModel.News> news;
    int image_left = 1;
    int image_top = 2;

    // Constructor
    public NewsAdapter(Context context, List<HomepageModel.News> news) {
        this.context = context;
        this.news = news;
    }

    @Override
    public int getItemViewType(int position) {
        // We will load 2 different layouts (Multiple Layouts in recyclerView)
        if ((position+1)%8 == 0 || position == 0){
            // Loading the first item & every 8 items the big layout
            return image_top;
        }else{
            return image_left;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == image_left){
            View v = LayoutInflater.from(context).inflate(R.layout.item_news,parent, false);
            return new ViewHolder(v);
        }
        else{
            View v = LayoutInflater.from(context).inflate(R.layout.item_news_image,parent, false);
            return new ViewHolder(v);
        }
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        // Keep us making new tutorials by rating us 5 stars on udemy  and playstore
        // & Subscribe to our channel: Master Coding

        /** We will fix some errors and prevent white spaces in news **/
        HomepageModel.News singleNews = news.get(holder.getAdapterPosition());

        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.newsTitle.setText(removeHtml(singleNews.getTitle()).trim());
        viewHolder.newsDesc.setText(removeHtml(singleNews.getPostContent()).trim());

        if (singleNews.getSource() != null){
            viewHolder.newsSource.setText(singleNews.getSource());
        }

        if(singleNews.getImage().length() <=1){
            viewHolder.newsImage.setVisibility(View.GONE);
        }else{
            viewHolder.newsImage.setVisibility(View.VISIBLE);
            Glide.with(context)
                    .load(singleNews.getImage())
                    .into(viewHolder.newsImage);
        }

    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    // Custom View holder
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        View holder;
        ImageView newsImage;
        TextView newsTitle, newsDesc, newsDate, newsSource, newsView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            holder = itemView;
            newsImage = holder.findViewById(R.id.news_image);
            newsTitle = holder.findViewById(R.id.news_title);
            newsDesc  = holder.findViewById(R.id.news_desc);
            newsDate  = holder.findViewById(R.id.news_date);
            newsView  = holder.findViewById(R.id.news_view);
            newsSource= holder.findViewById(R.id.news_source);

            holder.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {

            Intent i  = new Intent(context, NewsDetailActivity.class);
            i.putExtra("pid", news.get(getAdapterPosition()).getPid());
            context.startActivity(i);

        }

        // Every thing is working fine...
        // Now, let's add the details for every news
    }




    // Removing HTML Codes
    public static String removeHtml(String html){
        html = html.replaceAll("<(.*?)\\>"," ");//Removes all items in brackets
        html = html.replaceAll("<(.*?)\\\n"," ");//Must be undeneath
        html = html.replaceFirst("(.*?)\\>", " ");//Removes any connected item to the last bracket
        html = html.replaceAll("&nbsp;"," ");
        html = html.replaceAll("&amp;"," ");
        return html;
        // Check the description and the source code if you want it
    }



}
// Perfect
// We deserve a 5 stars review from you on udemy and playstore: Master Coding
//  & a subscribe to our youtube channel: Master Coding

// Thanks
// See you in next videos
