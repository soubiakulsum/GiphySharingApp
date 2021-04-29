package com.example.giphysharingapp.random;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class JsonMember480wStillModel implements Serializable {

	@SerializedName("url")
	private String url;

	@SerializedName("width")
	private String width;

	@SerializedName("height")
	private String height;

	public String getUrl(){
		return url;
	}

	public String getWidth(){
		return width;
	}

	public String getHeight(){
		return height;
	}
}