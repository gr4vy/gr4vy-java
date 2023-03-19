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
import com.gr4vy.api.model.RequiredFieldsAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The fields that are required to process a transaction for this payment option.
 */
@ApiModel(description = "The fields that are required to process a transaction for this payment option.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-19T17:27:23.170866Z[Etc/UTC]")
public class RequiredFields {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private Boolean firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private Boolean lastName;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private Boolean emailAddress;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private Boolean phoneNumber;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private RequiredFieldsAddress address;

  public static final String SERIALIZED_NAME_TAX_ID = "tax_id";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private Boolean taxId;


   /**
   * The first (given) name of the buyer.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first (given) name of the buyer.")

  public Boolean getFirstName() {
    return firstName;
  }




   /**
   * The last (family) name of the buyer.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last (family) name of the buyer.")

  public Boolean getLastName() {
    return lastName;
  }




   /**
   * The email address of the buyer.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address of the buyer.")

  public Boolean getEmailAddress() {
    return emailAddress;
  }




   /**
   * The phone number of the buyer.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone number of the buyer.")

  public Boolean getPhoneNumber() {
    return phoneNumber;
  }




  public RequiredFields address(RequiredFieldsAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RequiredFieldsAddress getAddress() {
    return address;
  }


  public void setAddress(RequiredFieldsAddress address) {
    this.address = address;
  }


   /**
   * The tax id code associated with the billing details.
   * @return taxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tax id code associated with the billing details.")

  public Boolean getTaxId() {
    return taxId;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequiredFields requiredFields = (RequiredFields) o;
    return Objects.equals(this.firstName, requiredFields.firstName) &&
        Objects.equals(this.lastName, requiredFields.lastName) &&
        Objects.equals(this.emailAddress, requiredFields.emailAddress) &&
        Objects.equals(this.phoneNumber, requiredFields.phoneNumber) &&
        Objects.equals(this.address, requiredFields.address) &&
        Objects.equals(this.taxId, requiredFields.taxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, emailAddress, phoneNumber, address, taxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequiredFields {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
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

