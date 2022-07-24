package com.developer.mk.newstime.rest;

import androidx.appcompat.app.AppCompatActivity;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient extends AppCompatActivity {

    // Local Host for emulators
    // 10.0.2.2 default local host for emulators in android studio
    public static final String BASE_URL = "http://10.0.2.2/newsapp/wp-json/api/";

    // For Real Devices Users
    // 1- Connect your laptop and mobile on the same wifi
    // 2- find local ip address of your laptop
    // 3- Add that local IP address in your BASE_URL variable

    // You need to update this ip address everytime your pc is connected to internet
    public static final String BASE_URL_REAL = "http://192.168.5.199/newsapp/wp-json/api";

     // Getting the retrofit api client
    private static Retrofit retrofit = null;

    public static Retrofit getApiClient(){
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                                    .addInterceptor(loggingInterceptor)
                                     .build();
        if (retrofit == null){

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


        }
        return retrofit;

    }


}



// Amazing!!
// our data is fetched to the console correctly!~!
