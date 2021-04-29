package com.example.giphysharingapp.random;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class DownsizedSmallModel implements Serializable {

	@SerializedName("height")
	private String height;

	@SerializedName("mp4")
	private String mp4;

	@SerializedName("mp4_size")
	private String mp4Size;

	@SerializedName("width")
	private String width;

	public String getHeight(){
		return height;
	}

	public String getMp4(){
		return mp4;
	}

	public String getMp4Size(){
		return mp4Size;
	}

	public String getWidth(){
		return width;
	}
}