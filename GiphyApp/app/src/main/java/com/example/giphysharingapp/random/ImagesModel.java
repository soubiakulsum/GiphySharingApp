package com.example.giphysharingapp.random;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ImagesModel implements Serializable {

	@SerializedName("downsized_large")
	private DownsizedLargeModel downsizedLarge;

	@SerializedName("fixed_height_small_still")
	private FixedHeightSmallStillModel fixedHeightSmallStill;

	@SerializedName("original")
	private OriginalModel original;

	@SerializedName("fixed_height_downsampled")
	private FixedHeightDownsampledModel fixedHeightDownsampled;

	@SerializedName("downsized_still")
	private DownsizedStillModel downsizedStill;

	@SerializedName("fixed_height_still")
	private FixedHeightStillModel fixedHeightStill;

	@SerializedName("downsized_medium")
	private DownsizedMediumModel downsizedMedium;

	@SerializedName("downsized")
	private DownsizedModel downsized;

	@SerializedName("preview_webp")
	private PreviewWebpModel previewWebp;

	@SerializedName("original_mp4")
	private OriginalMp4Model originalMp4;

	@SerializedName("fixed_height_small")
	private FixedHeightSmallModel fixedHeightSmall;

	@SerializedName("fixed_height")
	private FixedHeightModel fixedHeight;

	@SerializedName("downsized_small")
	private DownsizedSmallModel downsizedSmall;

	@SerializedName("preview")
	private PreviewModel preview;

	@SerializedName("fixed_width_downsampled")
	private FixedWidthDownsampledModel fixedWidthDownsampled;

	@SerializedName("fixed_width_small_still")
	private FixedWidthSmallStillModel fixedWidthSmallStill;

	@SerializedName("fixed_width_small")
	private FixedWidthSmallModel fixedWidthSmall;

	@SerializedName("original_still")
	private OriginalStillModel originalStill;

	@SerializedName("fixed_width_still")
	private FixedWidthStillModel fixedWidthStill;

	@SerializedName("looping")
	private LoopingModel looping;

	@SerializedName("fixed_width")
	private FixedWidthModel fixedWidth;

	@SerializedName("preview_gif")
	private PreviewGifModel previewGif;

	@SerializedName("480w_still")
	private JsonMember480wStillModel jsonMember480wStill;

	public DownsizedLargeModel getDownsizedLarge(){
		return downsizedLarge;
	}

	public FixedHeightSmallStillModel getFixedHeightSmallStill(){
		return fixedHeightSmallStill;
	}

	public OriginalModel getOriginal(){
		return original;
	}

	public FixedHeightDownsampledModel getFixedHeightDownsampled(){
		return fixedHeightDownsampled;
	}

	public DownsizedStillModel getDownsizedStill(){
		return downsizedStill;
	}

	public FixedHeightStillModel getFixedHeightStill(){
		return fixedHeightStill;
	}

	public DownsizedMediumModel getDownsizedMedium(){
		return downsizedMedium;
	}

	public DownsizedModel getDownsized(){
		return downsized;
	}

	public PreviewWebpModel getPreviewWebp(){
		return previewWebp;
	}

	public OriginalMp4Model getOriginalMp4(){
		return originalMp4;
	}

	public FixedHeightSmallModel getFixedHeightSmall(){
		return fixedHeightSmall;
	}

	public FixedHeightModel getFixedHeight(){
		return fixedHeight;
	}

	public DownsizedSmallModel getDownsizedSmall(){
		return downsizedSmall;
	}

	public PreviewModel getPreview(){
		return preview;
	}

	public FixedWidthDownsampledModel getFixedWidthDownsampled(){
		return fixedWidthDownsampled;
	}

	public FixedWidthSmallStillModel getFixedWidthSmallStill(){
		return fixedWidthSmallStill;
	}

	public FixedWidthSmallModel getFixedWidthSmall(){
		return fixedWidthSmall;
	}

	public OriginalStillModel getOriginalStill(){
		return originalStill;
	}

	public FixedWidthStillModel getFixedWidthStill(){
		return fixedWidthStill;
	}

	public LoopingModel getLooping(){
		return looping;
	}

	public FixedWidthModel getFixedWidth(){
		return fixedWidth;
	}

	public PreviewGifModel getPreviewGif(){
		return previewGif;
	}

	public JsonMember480wStillModel getJsonMember480wStill(){
		return jsonMember480wStill;
	}
}