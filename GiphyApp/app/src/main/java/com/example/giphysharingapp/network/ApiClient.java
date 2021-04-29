package com.example.giphysharingapp.network;

import com.example.giphysharingapp.random.ResponseRandomModel;
import com.example.giphysharingapp.searchModel.ResponseModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ApiClient {

//@GET("v1/gifs/search")
//Call<List<ResponseModel>>getGif(@Query("api_key") String Type,
//                                @Query("q") String lol,
//                                @Query("limit") int limit,
//                                @Query("offset") int zero,
//                                @Query("rating") String rate,
//                                @Query("lang") String en);

    @GET("/v1/gifs/search")
    Call<ResponseModel> getGif(@Query("api_key") String Type,
                               @Query("q") String lol);

    @GET("/v1/gifs/trending")
    Call<ResponseModel> getTrending(@Query("api_key") String Trend,
                                    @Query("limit") int limit,
                                    @Query("rating") String g);

    @GET("v1/gifs/random")
    Call<ResponseRandomModel> getRandom(@Query("api_key") String key,
                                        @Query("tag") String random,
                                        @Query("rating") String g);


}
