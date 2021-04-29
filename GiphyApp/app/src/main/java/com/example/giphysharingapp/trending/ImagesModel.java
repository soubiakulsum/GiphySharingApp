package com.example.giphysharingapp.trending;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ImagesModel implements Serializable {

	@SerializedName("original")
	private OriginalModel original;

	@SerializedName("downsized")
	private DownsizedModel downsized;

	@SerializedName("downsized_large")
	private DownsizedLargeModel downsizedLarge;

	@SerializedName("downsized_medium")
	private DownsizedMediumModel downsizedMedium;

	@SerializedName("downsized_small")
	private DownsizedSmallModel downsizedSmall;

	@SerializedName("downsized_still")
	private DownsizedStillModel downsizedStill;

	@SerializedName("fixed_height")
	private FixedHeightModel fixedHeight;

	@SerializedName("fixed_height_downsampled")
	private FixedHeightDownsampledModel fixedHeightDownsampled;

	@SerializedName("fixed_height_small")
	private FixedHeightSmallModel fixedHeightSmall;

	@SerializedName("fixed_height_small_still")
	private FixedHeightSmallStillModel fixedHeightSmallStill;

	@SerializedName("fixed_height_still")
	private FixedHeightStillModel fixedHeightStill;

	@SerializedName("fixed_width")
	private FixedWidthModel fixedWidth;

	@SerializedName("fixed_width_downsampled")
	private FixedWidthDownsampledModel fixedWidthDownsampled;

	@SerializedName("fixed_width_small")
	private FixedWidthSmallModel fixedWidthSmall;

	@SerializedName("fixed_width_small_still")
	private FixedWidthSmallStillModel fixedWidthSmallStill;

	@SerializedName("fixed_width_still")
	private FixedWidthStillModel fixedWidthStill;

	@SerializedName("looping")
	private LoopingModel looping;

	@SerializedName("original_still")
	private OriginalStillModel originalStill;

	@SerializedName("original_mp4")
	private OriginalMp4Model originalMp4;

	@SerializedName("preview")
	private PreviewModel preview;

	@SerializedName("preview_gif")
	private PreviewGifModel previewGif;

	@SerializedName("preview_webp")
	private PreviewWebpModel previewWebp;

	@SerializedName("480w_still")
	private JsonMember480wStillModel jsonMember480wStill;

	public OriginalModel getOriginal(){
		return original;
	}

	public DownsizedModel getDownsized(){
		return downsized;
	}

	public DownsizedLargeModel getDownsizedLarge(){
		return downsizedLarge;
	}

	public DownsizedMediumModel getDownsizedMedium(){
		return downsizedMedium;
	}

	public DownsizedSmallModel getDownsizedSmall(){
		return downsizedSmall;
	}

	public DownsizedStillModel getDownsizedStill(){
		return downsizedStill;
	}

	public FixedHeightModel getFixedHeight(){
		return fixedHeight;
	}

	public FixedHeightDownsampledModel getFixedHeightDownsampled(){
		return fixedHeightDownsampled;
	}

	public FixedHeightSmallModel getFixedHeightSmall(){
		return fixedHeightSmall;
	}

	public FixedHeightSmallStillModel getFixedHeightSmallStill(){
		return fixedHeightSmallStill;
	}

	public FixedHeightStillModel getFixedHeightStill(){
		return fixedHeightStill;
	}

	public FixedWidthModel getFixedWidth(){
		return fixedWidth;
	}

	public FixedWidthDownsampledModel getFixedWidthDownsampled(){
		return fixedWidthDownsampled;
	}

	public FixedWidthSmallModel getFixedWidthSmall(){
		return fixedWidthSmall;
	}

	public FixedWidthSmallStillModel getFixedWidthSmallStill(){
		return fixedWidthSmallStill;
	}

	public FixedWidthStillModel getFixedWidthStill(){
		return fixedWidthStill;
	}

	public LoopingModel getLooping(){
		return looping;
	}

	public OriginalStillModel getOriginalStill(){
		return originalStill;
	}

	public OriginalMp4Model getOriginalMp4(){
		return originalMp4;
	}

	public PreviewModel getPreview(){
		return preview;
	}

	public PreviewGifModel getPreviewGif(){
		return previewGif;
	}

	public PreviewWebpModel getPreviewWebp(){
		return previewWebp;
	}

	public JsonMember480wStillModel getJsonMember480wStill(){
		return jsonMember480wStill;
	}
}