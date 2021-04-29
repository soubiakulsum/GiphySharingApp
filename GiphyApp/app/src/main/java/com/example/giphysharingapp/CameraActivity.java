package com.example.giphysharingapp;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.VideoView;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        Intent takeVideoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        takeVideoIntent.putExtra(MediaStore.EXTRA_DURATION_LIMIT,3);
        takeVideoIntent.putExtra(MediaStore.VOLUME_INTERNAL,2);
        startActivityForResult(takeVideoIntent,1);
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK && requestCode ==1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            VideoView videoView = new VideoView(this);videoView.setVideoURI(data.getData());
            videoView.start();
            builder.setView(videoView).show();
        }

        Uri videoUri = data.getData();
        //   TakeData(videoUri);
        // SendData(videoUri);
        ShareApp(videoUri);
    }
    private void ShareApp(Uri videoUri) {
        {
            Intent sendIntent = new Intent(Intent.ACTION_SEND);
            sendIntent.setType("video/mp4");
            sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Video");
            sendIntent.putExtra(Intent.EXTRA_STREAM, videoUri);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "Here is a fun vedio for you");
            startActivity(Intent.createChooser(sendIntent, "Email:"));
        }
    }
}
