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
 * Additional options for Cybersource payment gateway.
 */
@ApiModel(description = "Additional options for Cybersource payment gateway.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectionOptionsCybersourceCard {
  public static final String SERIALIZED_NAME_META_KEY_MERCHANT_ID = "meta_key_merchant_id";
  @SerializedName(SERIALIZED_NAME_META_KEY_MERCHANT_ID)
  private String metaKeyMerchantId;


  public ConnectionOptionsCybersourceCard metaKeyMerchantId(String metaKeyMerchantId) {
    
    this.metaKeyMerchantId = metaKeyMerchantId;
    return this;
  }

   /**
   * An override for the merchant ID configured for the connector, used in combination with meta keys.
   * @return metaKeyMerchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An override for the merchant ID configured for the connector, used in combination with meta keys.")

  public String getMetaKeyMerchantId() {
    return metaKeyMerchantId;
  }


  public void setMetaKeyMerchantId(String metaKeyMerchantId) {
    this.metaKeyMerchantId = metaKeyMerchantId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionOptionsCybersourceCard connectionOptionsCybersourceCard = (ConnectionOptionsCybersourceCard) o;
    return Objects.equals(this.metaKeyMerchantId, connectionOptionsCybersourceCard.metaKeyMerchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaKeyMerchantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionOptionsCybersourceCard {\n");
    sb.append("    metaKeyMerchantId: ").append(toIndentedString(metaKeyMerchantId)).append("\n");
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

