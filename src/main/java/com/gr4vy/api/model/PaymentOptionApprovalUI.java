/*
 * Gr4vy API
 * Welcome to the Gr4vy API reference documentation. Our API is still very much a work in product and subject to change.
 *
 * The version of the OpenAPI document: 1.1.0-beta
 * Contact: code@gr4vy.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.gr4vy.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Configuration for the approval interface that should be shown to the buyer.
 */
@ApiModel(description = "Configuration for the approval interface that should be shown to the buyer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-06T16:38:13.632050Z[Etc/UTC]")
public class PaymentOptionApprovalUI {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private String width;


  public PaymentOptionApprovalUI height(String height) {
    
    this.height = height;
    return this;
  }

   /**
   * Height of the approval interface in either pixels or view height (vh).
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300px", value = "Height of the approval interface in either pixels or view height (vh).")

  public String getHeight() {
    return height;
  }


  public void setHeight(String height) {
    this.height = height;
  }


  public PaymentOptionApprovalUI width(String width) {
    
    this.width = width;
    return this;
  }

   /**
   * Width of the approval interface in either pixels or view width (vw).
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300px", value = "Width of the approval interface in either pixels or view width (vw).")

  public String getWidth() {
    return width;
  }


  public void setWidth(String width) {
    this.width = width;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentOptionApprovalUI paymentOptionApprovalUI = (PaymentOptionApprovalUI) o;
    return Objects.equals(this.height, paymentOptionApprovalUI.height) &&
        Objects.equals(this.width, paymentOptionApprovalUI.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentOptionApprovalUI {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

