package com.example.giphysharingapp.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Network {
    private static HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    public static Retrofit getInstance() {

        Retrofit.Builder builder = new Retrofit.Builder().baseUrl("https://api.giphy.com/")
                //In most cases requests to a server, and the responses from the server, are not Java objects. They’re mapped to some language neutral format like JSON
                .addConverterFactory(GsonConverterFactory.create())
                //this client will help you to print the API call logs in the Logcat
                .client(new OkHttpClient.Builder()
                        .addInterceptor(httpLoggingInterceptor)
                        .build());
        return builder.build();
    }
}
