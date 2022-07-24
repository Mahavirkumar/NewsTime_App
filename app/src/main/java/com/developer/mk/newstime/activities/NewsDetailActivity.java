package com.developer.mk.newstime.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.developer.mk.newstime.R;
import com.developer.mk.newstime.adapter.NewsAdapter;
import com.developer.mk.newstime.model.HomepageModel;
import com.developer.mk.newstime.rest.ApiClient;
import com.developer.mk.newstime.rest.ApiInterface;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsDetailActivity extends AppCompatActivity {



    Toolbar toolbar;

    TextView sourceName, newsTitle, newsDesc, newsDate, newsView,labelSimilar;
    Button viewMore;
    ImageView imagy,small_icn;


    ProgressBar progressBar;




    HomepageModel.News detailNews = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        initViews();


        LoadNewsDetails();


    }

    private void LoadNewsDetails() {
        // Calling our api
        ApiInterface apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        Map<String, String> params = new HashMap<>();

        params.put("id" , getIntent().getIntExtra("pid", 0) + "");


        Call<HomepageModel> call = apiInterface.getNewsDetailsById(params);
        call.enqueue(new Callback<HomepageModel>() {
            @Override
            public void onResponse(Call<HomepageModel> call, Response<HomepageModel> response) {

                // Update the news layout
                detailNews = response.body().getNews().get(0);
                newsTitle.setText(detailNews.getTitle());
                newsDesc.setText(NewsAdapter.removeHtml(detailNews.getPostContent()));

                if (detailNews.getImage().length() >=1){
                    Glide.with(NewsDetailActivity.this)
                            .load(detailNews.getImage())
                            .into(imagy);
                }else{
                    imagy.setVisibility(View.GONE);
                }



                sourceName.setText(detailNews.getSource());
                if (detailNews.getSourceLogo() != null){
                    Glide.with(NewsDetailActivity.this)
                            .load(detailNews.getSourceLogo())
                            .into(small_icn);

                }

                //View More
                viewMore.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String newsUrl = "";
                        if (detailNews.getSourceUrl() != null){
                            newsUrl = detailNews.getUrl();
                        }else{
                            newsUrl = detailNews.getSourceUrl();
                        }

                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(newsUrl));
                        startActivity(browserIntent);
                    }
                });



            }

            @Override
            public void onFailure(Call<HomepageModel> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
            }
        });





    }

    private void initViews() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setNavigationIcon(R.drawable.icon_arrow_back_white);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();

                }
            });


        }


        sourceName = findViewById(R.id.source_name );
        newsTitle  = findViewById(R.id.news_title);
        newsDesc  = findViewById(R.id.news_desc);
        newsDate = findViewById(R.id.news_date);
        newsView = findViewById(R.id.news_view);
        labelSimilar = findViewById(R.id.label_similar_news);

        viewMore = findViewById(R.id.view_more);
        progressBar = findViewById(R.id.progressBar);

        imagy =findViewById(R.id.news_image);
        small_icn = findViewById(R.id.small_icn);







    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.news_details_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.share){

            if (detailNews != null){
            // Opening sharing options
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_SUBJECT, detailNews.getTitle());
            i.putExtra(Intent.EXTRA_TEXT, detailNews.getPostContent());
            startActivity(i);

        }else{
                Toast.makeText(this, "Sorry!", Toast.LENGTH_SHORT).show();

            }
        }

        return super.onOptionsItemSelected(item);
    }
}


