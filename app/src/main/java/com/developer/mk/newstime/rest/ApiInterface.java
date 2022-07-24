package com.developer.mk.newstime.rest;

import com.developer.mk.newstime.model.HomepageModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface ApiInterface {

    // Retrofit Interface
    // JSON --> GSON Library --> Java Object

    @GET("homepage_api")
    Call<HomepageModel> getHomepageApi(@QueryMap Map<String, String> params);


   // Getting news by id
    // Displaying news details using news id
    @GET("news_by_pid")
    Call<HomepageModel> getNewsDetailsById(@QueryMap Map<String, String> params);


}
