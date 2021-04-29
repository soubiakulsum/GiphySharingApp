package com.example.giphysharingapp.random;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class UserModel implements Serializable {

	@SerializedName("avatar_url")
	private String avatarUrl;

	@SerializedName("banner_image")
	private String bannerImage;

	@SerializedName("banner_url")
	private String bannerUrl;

	@SerializedName("profile_url")
	private String profileUrl;

	@SerializedName("username")
	private String username;

	@SerializedName("display_name")
	private String displayName;

	@SerializedName("description")
	private String description;

	@SerializedName("is_verified")
	private boolean isVerified;

	@SerializedName("website_url")
	private String websiteUrl;

	@SerializedName("instagram_url")
	private String instagramUrl;

	public String getAvatarUrl(){
		return avatarUrl;
	}

	public String getBannerImage(){
		return bannerImage;
	}

	public String getBannerUrl(){
		return bannerUrl;
	}

	public String getProfileUrl(){
		return profileUrl;
	}

	public String getUsername(){
		return username;
	}

	public String getDisplayName(){
		return displayName;
	}

	public String getDescription(){
		return description;
	}

	public boolean isIsVerified(){
		return isVerified;
	}

	public String getWebsiteUrl(){
		return websiteUrl;
	}

	public String getInstagramUrl(){
		return instagramUrl;
	}
}