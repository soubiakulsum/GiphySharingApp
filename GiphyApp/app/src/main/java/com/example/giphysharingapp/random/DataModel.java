package com.example.giphysharingapp.random;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class DataModel implements Serializable {

	@SerializedName("type")
	private String type;

	@SerializedName("id")
	private String id;

	@SerializedName("url")
	private String url;

	@SerializedName("slug")
	private String slug;

	@SerializedName("bitly_gif_url")
	private String bitlyGifUrl;

	@SerializedName("bitly_url")
	private String bitlyUrl;

	@SerializedName("embed_url")
	private String embedUrl;

	@SerializedName("username")
	private String username;

	@SerializedName("source")
	private String source;

	@SerializedName("title")
	private String title;

	@SerializedName("rating")
	private String rating;

	@SerializedName("content_url")
	private String contentUrl;

	@SerializedName("source_tld")
	private String sourceTld;

	@SerializedName("source_post_url")
	private String sourcePostUrl;

	@SerializedName("is_sticker")
	private int isSticker;

	@SerializedName("import_datetime")
	private String importDatetime;

	@SerializedName("trending_datetime")
	private String trendingDatetime;

	@SerializedName("images")
	private ImagesModel images;

	@SerializedName("user")
	private UserModel user;

	@SerializedName("image_original_url")
	private String imageOriginalUrl;

	@SerializedName("image_url")
	private String imageUrl;

	@SerializedName("image_mp4_url")
	private String imageMp4Url;

	@SerializedName("image_frames")
	private String imageFrames;

	@SerializedName("image_width")
	private String imageWidth;

	@SerializedName("image_height")
	private String imageHeight;

	@SerializedName("fixed_height_downsampled_url")
	private String fixedHeightDownsampledUrl;

	@SerializedName("fixed_height_downsampled_width")
	private String fixedHeightDownsampledWidth;

	@SerializedName("fixed_height_downsampled_height")
	private String fixedHeightDownsampledHeight;

	@SerializedName("fixed_width_downsampled_url")
	private String fixedWidthDownsampledUrl;

	@SerializedName("fixed_width_downsampled_width")
	private String fixedWidthDownsampledWidth;

	@SerializedName("fixed_width_downsampled_height")
	private String fixedWidthDownsampledHeight;

	@SerializedName("fixed_height_small_url")
	private String fixedHeightSmallUrl;

	@SerializedName("fixed_height_small_still_url")
	private String fixedHeightSmallStillUrl;

	@SerializedName("fixed_height_small_width")
	private String fixedHeightSmallWidth;

	@SerializedName("fixed_height_small_height")
	private String fixedHeightSmallHeight;

	@SerializedName("fixed_width_small_url")
	private String fixedWidthSmallUrl;

	@SerializedName("fixed_width_small_still_url")
	private String fixedWidthSmallStillUrl;

	@SerializedName("fixed_width_small_width")
	private String fixedWidthSmallWidth;

	@SerializedName("fixed_width_small_height")
	private String fixedWidthSmallHeight;

	@SerializedName("caption")
	private String caption;

	public String getType(){
		return type;
	}

	public String getId(){
		return id;
	}

	public String getUrl(){
		return url;
	}

	public String getSlug(){
		return slug;
	}

	public String getBitlyGifUrl(){
		return bitlyGifUrl;
	}

	public String getBitlyUrl(){
		return bitlyUrl;
	}

	public String getEmbedUrl(){
		return embedUrl;
	}

	public String getUsername(){
		return username;
	}

	public String getSource(){
		return source;
	}

	public String getTitle(){
		return title;
	}

	public String getRating(){
		return rating;
	}

	public String getContentUrl(){
		return contentUrl;
	}

	public String getSourceTld(){
		return sourceTld;
	}

	public String getSourcePostUrl(){
		return sourcePostUrl;
	}

	public int getIsSticker(){
		return isSticker;
	}

	public String getImportDatetime(){
		return importDatetime;
	}

	public String getTrendingDatetime(){
		return trendingDatetime;
	}

	public ImagesModel getImages(){
		return images;
	}

	public UserModel getUser(){
		return user;
	}

	public String getImageOriginalUrl(){
		return imageOriginalUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public String getImageMp4Url(){
		return imageMp4Url;
	}

	public String getImageFrames(){
		return imageFrames;
	}

	public String getImageWidth(){
		return imageWidth;
	}

	public String getImageHeight(){
		return imageHeight;
	}

	public String getFixedHeightDownsampledUrl(){
		return fixedHeightDownsampledUrl;
	}

	public String getFixedHeightDownsampledWidth(){
		return fixedHeightDownsampledWidth;
	}

	public String getFixedHeightDownsampledHeight(){
		return fixedHeightDownsampledHeight;
	}

	public String getFixedWidthDownsampledUrl(){
		return fixedWidthDownsampledUrl;
	}

	public String getFixedWidthDownsampledWidth(){
		return fixedWidthDownsampledWidth;
	}

	public String getFixedWidthDownsampledHeight(){
		return fixedWidthDownsampledHeight;
	}

	public String getFixedHeightSmallUrl(){
		return fixedHeightSmallUrl;
	}

	public String getFixedHeightSmallStillUrl(){
		return fixedHeightSmallStillUrl;
	}

	public String getFixedHeightSmallWidth(){
		return fixedHeightSmallWidth;
	}

	public String getFixedHeightSmallHeight(){
		return fixedHeightSmallHeight;
	}

	public String getFixedWidthSmallUrl(){
		return fixedWidthSmallUrl;
	}

	public String getFixedWidthSmallStillUrl(){
		return fixedWidthSmallStillUrl;
	}

	public String getFixedWidthSmallWidth(){
		return fixedWidthSmallWidth;
	}

	public String getFixedWidthSmallHeight(){
		return fixedWidthSmallHeight;
	}

	public String getCaption(){
		return caption;
	}
}