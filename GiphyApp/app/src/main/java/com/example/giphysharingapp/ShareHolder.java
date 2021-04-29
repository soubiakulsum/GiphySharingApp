//package com.example.giphysharingapp;
//
//import android.content.Context;
//import android.content.Intent;
//import android.graphics.drawable.ColorDrawable;
//import android.view.View;
//import android.widget.ImageView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.bumptech.glide.Glide;
//import com.example.giphysharingapp.searchModel.DataModel;
//
//public class ShareHolder extends RecyclerView.ViewHolder {
//
//    private ImageView SearchGiphyShare;
//    private Context context;
//
//
//    public ShareHolder(@NonNull View itemView,Context context) {
//        super(itemView);
//        this.context = context;
//        initViews(itemView);
//
//    }
//
//    private void initViews(View itemView) {
//        SearchGiphyShare = itemView.findViewById(R.id.SearchGiphyShare);
//    }
//
//    public void setData(DataModel dataModel){
//
//        Glide.with(itemView.getContext()).asGif().load(dataModel.getImages().getDownsized().getUrl()).into(SearchGiphyShare);
//        SearchGiphyShare.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String gify = dataModel.getImages().getDownsized().getUrl();
//                Intent intent = new Intent(context,GifyViewActivity.class);
//                intent.putExtra("giff",gify.toString());
//                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
//                context.startActivity(intent);
//            }
//        });
//    }
//
//
//}
