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
 * The billing address of the buyer.
 */
@ApiModel(description = "The billing address of the buyer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-09T14:10:22.211861Z[Etc/UTC]")
public class CardRequiredFieldsAddress {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private Boolean city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private Boolean country;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private Boolean postalCode;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private Boolean state;

  public static final String SERIALIZED_NAME_HOUSE_NUMBER_OR_NAME = "house_number_or_name";
  @SerializedName(SERIALIZED_NAME_HOUSE_NUMBER_OR_NAME)
  private Boolean houseNumberOrName;

  public static final String SERIALIZED_NAME_LINE1 = "line1";
  @SerializedName(SERIALIZED_NAME_LINE1)
  private Boolean line1;


   /**
   * The city for the billing address.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The city for the billing address.")

  public Boolean getCity() {
    return city;
  }




   /**
   * The country for the billing address.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country for the billing address.")

  public Boolean getCountry() {
    return country;
  }




   /**
   * The postal code or zip code for the billing address.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code or zip code for the billing address.")

  public Boolean getPostalCode() {
    return postalCode;
  }




   /**
   * The state, county, or province for the billing address.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state, county, or province for the billing address.")

  public Boolean getState() {
    return state;
  }




   /**
   * The house number or name for the billing address. Not all payment services use this field but some do.
   * @return houseNumberOrName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The house number or name for the billing address. Not all payment services use this field but some do.")

  public Boolean getHouseNumberOrName() {
    return houseNumberOrName;
  }




   /**
   * The first line of the billing address.
   * @return line1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first line of the billing address.")

  public Boolean getLine1() {
    return line1;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardRequiredFieldsAddress cardRequiredFieldsAddress = (CardRequiredFieldsAddress) o;
    return Objects.equals(this.city, cardRequiredFieldsAddress.city) &&
        Objects.equals(this.country, cardRequiredFieldsAddress.country) &&
        Objects.equals(this.postalCode, cardRequiredFieldsAddress.postalCode) &&
        Objects.equals(this.state, cardRequiredFieldsAddress.state) &&
        Objects.equals(this.houseNumberOrName, cardRequiredFieldsAddress.houseNumberOrName) &&
        Objects.equals(this.line1, cardRequiredFieldsAddress.line1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, postalCode, state, houseNumberOrName, line1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardRequiredFieldsAddress {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    houseNumberOrName: ").append(toIndentedString(houseNumberOrName)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
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

