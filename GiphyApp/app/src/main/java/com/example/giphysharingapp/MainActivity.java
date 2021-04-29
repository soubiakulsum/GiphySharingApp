package com.example.giphysharingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.example.giphysharingapp.network.ApiClient;
import com.example.giphysharingapp.network.Network;
import com.example.giphysharingapp.random.ResponseRandomModel;
import com.example.giphysharingapp.searchModel.DataModel;
import com.example.giphysharingapp.searchModel.ResponseModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private EditText etSearch;
    private ImageButton btnSearch;
    private RecyclerView searchRecycler;
    private Button btnTrend;
    private Button btnRandom;
    private FrameLayout FLRandom;
    private ImageView ivRandomGif;
    private List<DataModel> dataModelList = new ArrayList<>();
    private SearchAdapter searchAdapter;
    private ProgressBar ProgressBarMain;
    private LottieAnimationView lottieCamera;
    private CardView cardRandom;
    private TextView tvRandom;
    private CardView cardTrending;
    private TextView tvTrending;




    public static final String API_KEY = "PqlitsWhnCHHhF6KoD0SMRJYEOgHdCQ3";
    public static final String API_TREND_KEY = "PqlitsWhnCHHhF6KoD0SMRJYEOgHdCQ3";
    public static final String API_RANDOM_KEY = "PqlitsWhnCHHhF6KoD0SMRJYEOgHdCQ3";
    public static final int LIMIT = 25;
    public static final String RATING = "g";
    public static final String TAG = "random";
    public static final String RANDOMRATING = "g";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        callTrendingApi();
        setAdapterData();


    }

    private void callTrendingApi() {

        ApiClient apiClient = Network.getInstance().create(ApiClient.class);
        apiClient.getTrending(API_TREND_KEY, LIMIT, RATING).enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                if (response.body() != null) {
                    dataModelList = response.body().getData();
                    searchAdapter.updateList(dataModelList);
                }
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void setAdapterData() {

        Display screensize = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        screensize.getSize(size);
        int width = size.x;

        StaggeredGridLayoutManager gridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        searchRecycler.setLayoutManager(gridLayoutManager);
        searchAdapter = new SearchAdapter(dataModelList, (width / 2) - 15, this);
        searchRecycler.setAdapter(searchAdapter);

    }

    private void initViews() {
        etSearch = findViewById(R.id.etSearch);
        btnTrend = findViewById(R.id.btnTrend);
//        cardTrending = findViewById(R.id.cardTrending);
//        tvTrending = findViewById(R.id.tvTrending);
        FLRandom = findViewById(R.id.FLRandom);
        ProgressBarMain = findViewById(R.id.ProgressBarMain);
        searchRecycler = findViewById(R.id.searchRecycler);
        btnRandom = findViewById(R.id.btnRandom);
//        cardRandom = findViewById(R.id.cardRandom);
//        tvRandom = findViewById(R.id.tvRandom);
        ivRandomGif = findViewById(R.id.ivRandomGif);
        btnSearch = findViewById(R.id.btnSearch);
        lottieCamera = findViewById(R.id.lottieCamera);
        ProgressBarMain.setVisibility(View.VISIBLE);

        lottieCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,CameraActivity.class);
                startActivity(intent);

            }
        });

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                cardTrending.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
//                tvTrending.setTextColor(Color.parseColor("#000000"));

//                cardRandom.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
//                tvRandom.setTextColor(Color.parseColor("#000000"));


                searchRecycler.setVisibility(View.GONE);
                FLRandom.setVisibility(View.VISIBLE);
                callRandomApi();

            }
        });


        cardTrending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                cardTrending.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.black)));
//                tvTrending.setTextColor(Color.parseColor("#FFFFFF"));


                cardRandom.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.black)));
                tvRandom.setTextColor(Color.parseColor("#FFFFFF"));
                searchRecycler.setVisibility(View.VISIBLE);
                FLRandom.setVisibility(View.GONE);
                callTrendingApi();

            }
        });
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchRecycler.setVisibility(View.VISIBLE);
                FLRandom.setVisibility(View.GONE);
                CallApi();


            }
        });
//        etSearch.setOnTouchListener(new View.OnTouchListener() {
//            @SuppressLint("ClickableViewAccessibility")
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                List<DataModel>dataModelList = new ArrayList<>();
//                searchAdapter.updateList(dataModelList);
//                return true;
//            }
//        });
    }

    private void callRandomApi() {
        ApiClient apiClient = Network.getInstance().create(ApiClient.class);
        apiClient.getRandom(API_RANDOM_KEY, TAG, RANDOMRATING).enqueue(new Callback<ResponseRandomModel>() {
            @Override
            public void onResponse(Call<ResponseRandomModel> call, Response<ResponseRandomModel> response) {
                if (response.body() != null) {
                    Log.d("body", "response");

                    ResponseRandomModel responseModel = response.body();
                    com.example.giphysharingapp.random.DataModel dataModel = new com.example.giphysharingapp.random.DataModel();


                    Glide.with(MainActivity.this).load(responseModel.getData().getImages().getDownsized().getUrl()).into(ivRandomGif);

                    ProgressBarMain.setVisibility(View.GONE);

                }
            }

            @Override
            public void onFailure(Call<ResponseRandomModel> call, Throwable t) {

            }
        });
    }

    private void CallApi() {
        ApiClient apiClient = Network.getInstance().create(ApiClient.class);
        apiClient.getGif(API_KEY, etSearch.getText().toString()).enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {

                if (response.body() != null) {
                    dataModelList.clear();
                    dataModelList = response.body().getData();
                    searchAdapter.updateList(dataModelList);
                    ProgressBarMain.setVisibility(View.GONE);

                }

            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {


            }
        });
    }


    @Override
    public void OnClick(DataModel dataModel) {

        Intent intent = new Intent(MainActivity.this, GifyViewActivity.class);
        intent.putExtra("giphy", dataModel.getImages().getDownsized().getUrl());
        startActivity(intent);


    }
}