package com.example.giphysharingapp.searchModel;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class OnloadModel implements Serializable {

	@SerializedName("url")
	private String url;

	public String getUrl(){
		return url;
	}
}