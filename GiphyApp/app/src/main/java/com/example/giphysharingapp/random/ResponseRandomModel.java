package com.example.giphysharingapp.random;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ResponseRandomModel implements Serializable {

	@SerializedName("data")
	private DataModel data;

	@SerializedName("meta")
	private MetaModel meta;

	public DataModel getData(){
		return data;
	}

	public MetaModel getMeta(){
		return meta;
	}
}