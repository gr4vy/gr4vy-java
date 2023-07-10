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
 * Details about the error resulting from 3DS processing a Transaction.
 */
@ApiModel(description = "Details about the error resulting from 3DS processing a Transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-30T05:21:36.133441Z[Etc/UTC]")
public class ThreeDSecureError {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;


  public ThreeDSecureError description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The error description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Invalid ThreeDSCompInd", required = true, value = "The error description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ThreeDSecureError detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * Detail for the error.
   * @return detail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The threeDSCompInd must be 'Y' when successful", required = true, value = "Detail for the error.")

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  public ThreeDSecureError code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The error code.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "305", required = true, value = "The error code.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ThreeDSecureError component(String component) {
    
    this.component = component;
    return this;
  }

   /**
   * Code indicating the 3-D Secure component that identified the error..
   * @return component
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "C", required = true, value = "Code indicating the 3-D Secure component that identified the error..")

  public String getComponent() {
    return component;
  }


  public void setComponent(String component) {
    this.component = component;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSecureError threeDSecureError = (ThreeDSecureError) o;
    return Objects.equals(this.description, threeDSecureError.description) &&
        Objects.equals(this.detail, threeDSecureError.detail) &&
        Objects.equals(this.code, threeDSecureError.code) &&
        Objects.equals(this.component, threeDSecureError.component);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, detail, code, component);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSecureError {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
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
