package com.example.giphysharingapp.trending;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ResponseModel implements Serializable {

	@SerializedName("data")
	private List<DataModel> data;

	@SerializedName("pagination")
	private PaginationModel pagination;

	@SerializedName("meta")
	private MetaModel meta;

	public List<DataModel> getData(){
		return data;
	}

	public PaginationModel getPagination(){
		return pagination;
	}

	public MetaModel getMeta(){
		return meta;
	}
}