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
import java.util.ArrayList;
import java.util.List;

/**
 * Request body to update a registered digital wallet&#39;s details.
 */
@ApiModel(description = "Request body to update a registered digital wallet's details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T06:53:23.548460Z[Etc/UTC]")
public class DigitalWalletUpdate {
  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_DOMAIN_NAMES = "domain_names";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAMES)
  private List<String> domainNames = null;


  public DigitalWalletUpdate merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * The name of the merchant. This is used to update the value initially used to register with a digital wallet provider and this name is not displayed to the buyer.
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Gr4vy", value = "The name of the merchant. This is used to update the value initially used to register with a digital wallet provider and this name is not displayed to the buyer.")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public DigitalWalletUpdate domainNames(List<String> domainNames) {
    
    this.domainNames = domainNames;
    return this;
  }

  public DigitalWalletUpdate addDomainNamesItem(String domainNamesItem) {
    if (this.domainNames == null) {
      this.domainNames = new ArrayList<String>();
    }
    this.domainNames.add(domainNamesItem);
    return this;
  }

   /**
   * The list of domain names that a digital wallet can be used on. To use a digital wallet on a website, the domain of the site is required to be in this list.
   * @return domainNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"example.com\"]", value = "The list of domain names that a digital wallet can be used on. To use a digital wallet on a website, the domain of the site is required to be in this list.")

  public List<String> getDomainNames() {
    return domainNames;
  }


  public void setDomainNames(List<String> domainNames) {
    this.domainNames = domainNames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalWalletUpdate digitalWalletUpdate = (DigitalWalletUpdate) o;
    return Objects.equals(this.merchantName, digitalWalletUpdate.merchantName) &&
        Objects.equals(this.domainNames, digitalWalletUpdate.domainNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantName, domainNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalWalletUpdate {\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
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

