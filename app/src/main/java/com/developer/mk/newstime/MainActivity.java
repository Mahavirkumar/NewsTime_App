package com.developer.mk.newstime;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.ViewFlipper;

import com.bumptech.glide.request.RequestOptions;
//import com.developer.mk.newstime.adapter.GridCategoryAdapter;
import com.developer.mk.newstime.adapter.NewsAdapter;
import com.developer.mk.newstime.model.HomepageModel;
import com.developer.mk.newstime.rest.ApiClient;
import com.developer.mk.newstime.rest.ApiInterface;
import com.google.android.material.slider.Slider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Slider sliderLayout;
    ViewFlipper viewFlipper;

    GridView gridView;
//    GridCategoryAdapter adapter;

    // we will load real news from our website
    RecyclerView recyclerView;
    NewsAdapter newsAdapter;
    List<HomepageModel.News> news;

    // Categories
    List<HomepageModel.CategoryBotton> categoryBottons;


    // Variables for making infinite news feed
    int posts = 3;
    int page = 1;
    boolean isFromStart = true;

    // Progressbar
    ProgressBar progressBar;

    NestedScrollView nestedScrollView;

    // Swipe to refresh
    SwipeRefreshLayout swipeRefreshLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitiateViews();

        AddImagesToSlider();

        //Initial conditions
        page = 1;
        isFromStart = true;


        // Getting Data
        getHomeData();

        // Getting new data on scrolling and swiping down
        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

                if (scrollY == (v.getChildAt(0).getMeasuredHeight() - v.getMeasuredHeight())){
                    isFromStart = false;
                    progressBar.setVisibility(View.VISIBLE);
                    page++;
                    getHomeData();
                }
            }
        });










    }

    private void getHomeData() {

        ApiInterface apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        Map<String, String> params = new HashMap<>();
        params.put("page",page+"");
        params.put("posts", posts+"");

        Call<HomepageModel> call = apiInterface.getHomepageApi(params);
        call.enqueue(new Callback<HomepageModel>() {


            @Override
            public void onResponse(Call<HomepageModel> call, Response<HomepageModel> response) {
                UpdateDataOnHomePage(response.body());

            }

            @Override
            public void onFailure(Call<HomepageModel> call, Throwable t) {

                progressBar.setVisibility(View.GONE);
                swipeRefreshLayout.setRefreshing(false);
            }
        });


    }

    private void UpdateDataOnHomePage(HomepageModel body) {

        // Adding Slider images from server
        // We are getting images now from body response and not from locally stored images (Drawables)

        // we are not getting images, since we are loading the images from localhost server
        //"image": "http://localhost/newsapp/wp-content/uploads/2020/12/bas.jpg"
        // So, our emulator will not get the images
        // we need to replace localhost with the emulator local host 10.0.2.2


        progressBar.setVisibility(View.GONE);
        swipeRefreshLayout.setRefreshing(false);

        if (isFromStart){
            news.clear();
            categoryBottons.clear();
        }

        for (int i= 0; i < body.getBanners().size() ; i++){
            Slider.OnSliderTouchListener onSliderTouchListener = new Slider.OnSliderTouchListener() {
                @Override
                public void onStartTrackingTouch(@NonNull Slider slider) {

                }

                @Override
                public void onStopTrackingTouch(@NonNull Slider slider) {

                }
            };
//            onSliderTouchListener.onStartTrackingTouch(new RequestOptions().centerCrop());
//            onSliderTouchListener.image(body.getBanners().get(i).getImage());
//            onSliderTouchListener.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
//                @Override
//                public void onSliderClick(BaseSliderView slider) {
//                    // Handling Click event for slides
//
//                }
//            });

//            sliderLayout.addOnSliderTouchListener(defaultSliderView);

        }

        // Setting the slider options
//        sliderLayout.startAutoCycle();
//        sliderLayout.setPresetTransformer(SliderLayout.Transformer.Stack);
//        sliderLayout.setDuration(3000);
//        sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Right_Bottom);





        // Making way for getting news in correct order and conserving the page numbers
        int beforeNewsSize = news.size();


        for(int i = 0; i < body.getNews().size(); i++){
            news.add(body.getNews().get(i));
        }
        categoryBottons.addAll(body.getCategoryBotton());


        if (isFromStart){
            recyclerView.setAdapter(newsAdapter);
//            gridView.setAdapter(adapter);
        }else{
            newsAdapter.notifyItemRangeInserted(beforeNewsSize, body.getNews().size());
        }




    }

    private void AddImagesToSlider() {
    }

    @SuppressLint("ResourceAsColor")
    private void InitiateViews() {

        categoryBottons = new ArrayList<>();


        viewFlipper = findViewById(R.id.fliper);
        gridView = findViewById(R.id.grid_view);
//        adapter = new GridCategoryAdapter(this,categoryBottons);

        // progressbar
        progressBar = findViewById(R.id.progressBar);

        // Nested scrollview
        nestedScrollView = findViewById(R.id.nested);

        // RecyclerView
        recyclerView = findViewById(R.id.recy_news);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setNestedScrollingEnabled(false);

        news = new ArrayList<>();
        newsAdapter = new NewsAdapter(this, news);



        swipeRefreshLayout = findViewById(R.id.swipy);
        swipeRefreshLayout.setRefreshing(true);
        swipeRefreshLayout.setColorSchemeColors(R.color.orange,
                R.color.blue,
                R.color.green);


//        swipeRefreshLayout.setOnRefreshListener(this);

    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        sliderLayout.stopAutoCycle();
//    }
//
//    @Override
//    public void onRefresh() {
//        isFromStart = true;
//        page = 1;
//        getHomeData();
//    }
}