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
import com.gr4vy.api.model.BillingDetailsRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A request to create a buyer.
 */
@ApiModel(description = "A request to create a buyer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-06T15:11:33.631354Z[Etc/UTC]")
public class BuyerRequest {
  public static final String SERIALIZED_NAME_EXTERNAL_IDENTIFIER = "external_identifier";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDENTIFIER)
  private String externalIdentifier;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_BILLING_DETAILS = "billing_details";
  @SerializedName(SERIALIZED_NAME_BILLING_DETAILS)
  private BillingDetailsRequest billingDetails;


  public BuyerRequest externalIdentifier(String externalIdentifier) {
    
    this.externalIdentifier = externalIdentifier;
    return this;
  }

   /**
   * An external identifier that can be used to match the buyer against your own records. This value needs to be unique for all buyers.
   * @return externalIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user-789123", value = "An external identifier that can be used to match the buyer against your own records. This value needs to be unique for all buyers.")

  public String getExternalIdentifier() {
    return externalIdentifier;
  }


  public void setExternalIdentifier(String externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }


  public BuyerRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * A unique name for this buyer which is used in the Gr4vy admin panel to give a buyer a human readable name.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John L.", value = "A unique name for this buyer which is used in the Gr4vy admin panel to give a buyer a human readable name.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public BuyerRequest billingDetails(BillingDetailsRequest billingDetails) {
    
    this.billingDetails = billingDetails;
    return this;
  }

   /**
   * The optional billing details to associate with a buyer.
   * @return billingDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The optional billing details to associate with a buyer.")

  public BillingDetailsRequest getBillingDetails() {
    return billingDetails;
  }


  public void setBillingDetails(BillingDetailsRequest billingDetails) {
    this.billingDetails = billingDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyerRequest buyerRequest = (BuyerRequest) o;
    return Objects.equals(this.externalIdentifier, buyerRequest.externalIdentifier) &&
        Objects.equals(this.displayName, buyerRequest.displayName) &&
        Objects.equals(this.billingDetails, buyerRequest.billingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalIdentifier, displayName, billingDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyerRequest {\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    billingDetails: ").append(toIndentedString(billingDetails)).append("\n");
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

