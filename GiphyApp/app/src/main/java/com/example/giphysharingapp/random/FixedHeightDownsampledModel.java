package com.example.giphysharingapp.random;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class FixedHeightDownsampledModel implements Serializable {

	@SerializedName("height")
	private String height;

	@SerializedName("size")
	private String size;

	@SerializedName("url")
	private String url;

	@SerializedName("webp")
	private String webp;

	@SerializedName("webp_size")
	private String webpSize;

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

	public String getWebp(){
		return webp;
	}

	public String getWebpSize(){
		return webpSize;
	}

	public String getWidth(){
		return width;
	}
}