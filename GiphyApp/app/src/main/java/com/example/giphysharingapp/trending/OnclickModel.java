package com.example.giphysharingapp.trending;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class OnclickModel implements Serializable {

	@SerializedName("url")
	private String url;

	public String getUrl(){
		return url;
	}
}