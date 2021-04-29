package com.example.giphysharingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;

public class GifyViewActivity extends AppCompatActivity {

    private ImageView ivGifyView;
    private LottieAnimationView LottieWatsapp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gify_view);
        initViews();
        getDataFromIntent();
    }

    private void getDataFromIntent() {

        if (getIntent() != null && getIntent().getExtras() != null) {
            String Url = getIntent().getStringExtra("giphy");

//            Bundle bundle = getIntent().getExtras();

//            Uri data = Uri.parse(bundle.getString("giff"));

            Glide.with(ivGifyView).asGif().load(Url).into(ivGifyView);

            LottieWatsapp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

//                    try {
//                        Intent shareIntent = new Intent(Intent.ACTION_SEND);
//                        shareIntent.setType("text/plain");
//                        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
//                        String shareMessage= "\nLet me recommend you this application\n\n";
//                        shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
//                        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
//                        startActivity(Intent.createChooser(shareIntent, "choose one"));
//                    } catch(Exception e) {
//                        //e.toString();
//                    }

                    Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
                    whatsappIntent.setType("text/plain");
                    whatsappIntent.putExtra(Intent.EXTRA_TEXT, Url.toString());
                    whatsappIntent.putExtra(Intent.EXTRA_STREAM,Url.toString() );
                    whatsappIntent.setType("video/mp4");
//  whatsappIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                    startActivity(Intent.createChooser(whatsappIntent, "Email:"));

                }
            });


        }
    }


    private void initViews() {
        ivGifyView = findViewById(R.id.ivGifyView);
        LottieWatsapp = findViewById(R.id.LottieWatsapp);
    }


}