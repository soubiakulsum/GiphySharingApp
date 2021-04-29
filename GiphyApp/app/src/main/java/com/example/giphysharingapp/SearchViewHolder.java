package com.example.giphysharingapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.giphysharingapp.searchModel.DataModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SearchViewHolder extends RecyclerView.ViewHolder {

    private ImageView SearchGiphy;
    private int screenSize;
    private ItemClickListener itemClickListener;
    private CardView CardViewGify;
    private int findSizeOfImageView(int width, int height, int screenWidth) {
        return height * screenWidth / width;
    }

    public SearchViewHolder(@NonNull View itemView, int screenSize,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        this.screenSize = screenSize;
        initViews(itemView);

    }

    private void initViews(View itemView) {
        SearchGiphy = itemView.findViewById(R.id.SearchGiphy);
        CardViewGify = itemView.findViewById(R.id.CardViewGify);

    }


    public void setData(DataModel dataModel) {

//        Glide.with(itemView.getContext()).asGif().load(dataModel.get(0).source.web).into(SearchGiphy);


//    Glide.with(itemView.getContext()).asGif().load(dataModel.getImages().getOriginal().getUrl()).into(SearchGiphy);


//        Glide.with(itemView.getContext()).asGif().load("https://i.pinimg.com/originals/28/7b/61/287b612d87648274e86c7e12124a2e66.gif").into(SearchGiphy);

        int height = findSizeOfImageView(Integer.parseInt(dataModel.getImages().getDownsized().getWidth()), Integer.parseInt(dataModel.getImages().getDownsized().getHeight()), screenSize);
        LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(screenSize, height);
        SearchGiphy.setLayoutParams(parms);
        Glide.with(itemView.getContext()).asGif().load(dataModel.getImages().getDownsized().getUrl()).placeholder(new ColorDrawable(getRandomColor())).into(SearchGiphy);

        CardViewGify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.OnClick(dataModel);

            }
        });

    }

    public static int getRandomColor() {
        List<Integer> colours = new ArrayList<>();
        colours.add(Color.parseColor("#FED8A9"));
        colours.add(Color.parseColor("#C599D6"));
        colours.add(Color.parseColor("#78D6C6"));
        colours.add(Color.parseColor("#A6B8FF"));
        colours.add(Color.parseColor("#E5B9D2"));
        colours.add(Color.parseColor("#FFEABF"));
        colours.add(Color.parseColor("#CCBBE5"));
        colours.add(Color.parseColor("#BCE4FE"));
        colours.add(Color.parseColor("#DAF5A8"));
        colours.add(Color.parseColor("#FFA4B5"));
        colours.add(Color.parseColor("#92CED8"));
        colours.add(Color.parseColor("#DBCBA7"));

        Random rand = new Random();
        return colours.get(rand.nextInt(colours.size()));
    }
}
