package com.example.giphysharingapp.random;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class FixedHeightStillModel implements Serializable {

	@SerializedName("height")
	private String height;

	@SerializedName("size")
	private String size;

	@SerializedName("url")
	private String url;

	@SerializedName("width")
	private String width;

	public String getHeight(){
		return height;
	}

	public String getSize(){
		return size;
	}

	public String getUrl(){
		return url;
	}

	public String getWidth(){
		return width;
	}
}