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
 * An address for the buyer.
 */
@ApiModel(description = "An address for the buyer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Address {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_STATE_CODE = "state_code";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private String stateCode;

  public static final String SERIALIZED_NAME_HOUSE_NUMBER_OR_NAME = "house_number_or_name";
  @SerializedName(SERIALIZED_NAME_HOUSE_NUMBER_OR_NAME)
  private String houseNumberOrName;

  public static final String SERIALIZED_NAME_LINE1 = "line1";
  @SerializedName(SERIALIZED_NAME_LINE1)
  private String line1;

  public static final String SERIALIZED_NAME_LINE2 = "line2";
  @SerializedName(SERIALIZED_NAME_LINE2)
  private String line2;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization;


  public Address city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city for the address.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "London", value = "The city for the address.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public Address country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country for the address in ISO 3166 format.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GB", value = "The country for the address in ISO 3166 format.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public Address postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code or zip code for the address.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "789123", value = "The postal code or zip code for the address.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public Address state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state, county, or province for the address.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Greater London", value = "The state, county, or province for the address.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Address stateCode(String stateCode) {
    
    this.stateCode = stateCode;
    return this;
  }

   /**
   * The code of state, county, or province for the address in ISO 3166-2 format.
   * @return stateCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GB-LND", value = "The code of state, county, or province for the address in ISO 3166-2 format.")

  public String getStateCode() {
    return stateCode;
  }


  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  public Address houseNumberOrName(String houseNumberOrName) {
    
    this.houseNumberOrName = houseNumberOrName;
    return this;
  }

   /**
   * The house number or name for the address. Not all payment services use this field but some do.
   * @return houseNumberOrName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "The house number or name for the address. Not all payment services use this field but some do.")

  public String getHouseNumberOrName() {
    return houseNumberOrName;
  }


  public void setHouseNumberOrName(String houseNumberOrName) {
    this.houseNumberOrName = houseNumberOrName;
  }


  public Address line1(String line1) {
    
    this.line1 = line1;
    return this;
  }

   /**
   * The first line of the address.
   * @return line1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10 Oxford Street", value = "The first line of the address.")

  public String getLine1() {
    return line1;
  }


  public void setLine1(String line1) {
    this.line1 = line1;
  }


  public Address line2(String line2) {
    
    this.line2 = line2;
    return this;
  }

   /**
   * The second line of the address.
   * @return line2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "New Oxford Court", value = "The second line of the address.")

  public String getLine2() {
    return line2;
  }


  public void setLine2(String line2) {
    this.line2 = line2;
  }


  public Address organization(String organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * The optional name of the company or organisation to add to the address.
   * @return organization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Gr4vy", value = "The optional name of the company or organisation to add to the address.")

  public String getOrganization() {
    return organization;
  }


  public void setOrganization(String organization) {
    this.organization = organization;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.city, address.city) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.stateCode, address.stateCode) &&
        Objects.equals(this.houseNumberOrName, address.houseNumberOrName) &&
        Objects.equals(this.line1, address.line1) &&
        Objects.equals(this.line2, address.line2) &&
        Objects.equals(this.organization, address.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, postalCode, state, stateCode, houseNumberOrName, line1, line2, organization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    houseNumberOrName: ").append(toIndentedString(houseNumberOrName)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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

