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
import java.util.UUID;

/**
 * Return digital payment application details for Click to Pay.
 */
@ApiModel(description = "Return digital payment application details for Click to Pay.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ClickToPaySessionRequest {
  public static final String SERIALIZED_NAME_CHECKOUT_SESSION_ID = "checkout_session_id";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_SESSION_ID)
  private UUID checkoutSessionId;


  public ClickToPaySessionRequest checkoutSessionId(UUID checkoutSessionId) {
    
    this.checkoutSessionId = checkoutSessionId;
    return this;
  }

   /**
   * The identifier for the current checkout session.
   * @return checkoutSessionId
  **/
  @ApiModelProperty(example = "fe26475d-ec3e-4884-9553-f7356683f7f9", required = true, value = "The identifier for the current checkout session.")

  public UUID getCheckoutSessionId() {
    return checkoutSessionId;
  }


  public void setCheckoutSessionId(UUID checkoutSessionId) {
    this.checkoutSessionId = checkoutSessionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClickToPaySessionRequest clickToPaySessionRequest = (ClickToPaySessionRequest) o;
    return Objects.equals(this.checkoutSessionId, clickToPaySessionRequest.checkoutSessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutSessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickToPaySessionRequest {\n");
    sb.append("    checkoutSessionId: ").append(toIndentedString(checkoutSessionId)).append("\n");
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

