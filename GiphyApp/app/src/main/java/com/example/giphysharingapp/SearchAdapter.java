package com.example.giphysharingapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.giphysharingapp.searchModel.DataModel;

import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<SearchViewHolder> {

    private List<DataModel>dataModelList;
    private int screenSize;
    private ItemClickListener itemClickListener;

    public SearchAdapter(List<DataModel> dataModelList, int i,ItemClickListener itemClickListener) {
        this.dataModelList = dataModelList;
        this.screenSize= i;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_item_layout,parent,false);
        return new SearchViewHolder(view,screenSize,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {

        DataModel dataModel = dataModelList.get(position);
        holder.setData(dataModel);

    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

    public void updateList(List<DataModel>dataModelList){
        this.dataModelList = dataModelList;
        notifyDataSetChanged();
    }
}
