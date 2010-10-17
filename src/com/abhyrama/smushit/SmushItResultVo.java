/**
 * Created by IntelliJ IDEA.
 * User: abhirama
 * Date: Oct 17, 2010
 * Time: 11:46:31 AM
 * To change this template use File | Settings | File Templates.
 */
package com.abhyrama.smushit;

import java.util.Map;

public class SmushItResultVo {
  public static final String JSON_RESPONSE_PARAM_SRC = "src";
  public static final String JSON_RESPONSE_PARAM_SRC_SIZE = "src_size";
  public static final String JSON_RESPONSE_PARAM_DEST = "dest";
  public static final String JSON_RESPONSE_PARAM_DEST_SIZE = "dest_size";
  public static final String JSON_RESPONSE_PARAM_PERCENT = "percent";

  protected String sourceImage;
  protected String sourceImageSize;
  protected String smushedImageUrl;
  protected String smushedImageSize;
  protected String savingPercentage;

  public String getSourceImage() {
    return sourceImage;
  }

  public void setSourceImage(String sourceImage) {
    this.sourceImage = sourceImage;
  }

  public String getSourceImageSize() {
    return sourceImageSize;
  }

  public void setSourceImageSize(String sourceImageSize) {
    this.sourceImageSize = sourceImageSize;
  }

  public String getSmushedImageUrl() {
    return smushedImageUrl;
  }

  public void setSmushedImageUrl(String smushedImageUrl) {
    this.smushedImageUrl = smushedImageUrl;
  }

  public String getSmushedImageSize() {
    return smushedImageSize;
  }

  public void setSmushedImageSize(String smushedImageSize) {
    this.smushedImageSize = smushedImageSize;
  }

  public String getSavingPercentage() {
    return savingPercentage;
  }

  public void setSavingPercentage(String savingPercentage) {
    this.savingPercentage = savingPercentage;
  }

  public static SmushItResultVo create(Map map) {
    SmushItResultVo smushItResultVo = new SmushItResultVo();
    smushItResultVo.setSourceImage((String.valueOf(map.get(JSON_RESPONSE_PARAM_SRC))));
    smushItResultVo.setSourceImageSize((String.valueOf(map.get(JSON_RESPONSE_PARAM_SRC_SIZE))));
    smushItResultVo.setSmushedImageUrl((String.valueOf(map.get(JSON_RESPONSE_PARAM_DEST))));
    smushItResultVo.setSmushedImageSize((String.valueOf(map.get(JSON_RESPONSE_PARAM_DEST_SIZE))));
    smushItResultVo.setSavingPercentage((String.valueOf(map.get(JSON_RESPONSE_PARAM_PERCENT))));

    return smushItResultVo;
  }

  public String toString() {
    String str = "{source image=" + this.sourceImage + ", source image size=" + this.sourceImageSize
        + ", smushed images url=" + this.smushedImageUrl + ", smushed image size=" + this.smushedImageSize
        + ", percentage saving=" + this.savingPercentage + "}";

    return str;
  }
}