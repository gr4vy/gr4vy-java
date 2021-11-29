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
import com.gr4vy.api.model.Address;
import com.gr4vy.api.model.AddressUpdate;
import com.gr4vy.api.model.BillingDetails;
import com.gr4vy.api.model.TaxId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BillingDetailsUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T06:53:23.548460Z[Etc/UTC]")
public class BillingDetailsUpdateRequest {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private AddressUpdate address;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_TAX_ID = "tax_id";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private TaxId taxId;


  public BillingDetailsUpdateRequest address(AddressUpdate address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address associated with the billing details.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address associated with the billing details.")

  public AddressUpdate getAddress() {
    return address;
  }


  public void setAddress(AddressUpdate address) {
    this.address = address;
  }


  public BillingDetailsUpdateRequest firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name(s) or given name for the buyer.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John", value = "The first name(s) or given name for the buyer.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public BillingDetailsUpdateRequest lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name, or family name, of the buyer.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lunn", value = "The last name, or family name, of the buyer.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public BillingDetailsUpdateRequest emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address for the buyer.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "john@example.com", value = "The email address for the buyer.")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public BillingDetailsUpdateRequest phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number to use for this request. This expect the number in the [E164 number standard](https://www.twilio.com/docs/glossary/what-e164).
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+1234567890", value = "The phone number to use for this request. This expect the number in the [E164 number standard](https://www.twilio.com/docs/glossary/what-e164).")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public BillingDetailsUpdateRequest taxId(TaxId taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * Get taxId
   * @return taxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaxId getTaxId() {
    return taxId;
  }


  public void setTaxId(TaxId taxId) {
    this.taxId = taxId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingDetailsUpdateRequest billingDetailsUpdateRequest = (BillingDetailsUpdateRequest) o;
    return Objects.equals(this.address, billingDetailsUpdateRequest.address) &&
        Objects.equals(this.firstName, billingDetailsUpdateRequest.firstName) &&
        Objects.equals(this.lastName, billingDetailsUpdateRequest.lastName) &&
        Objects.equals(this.emailAddress, billingDetailsUpdateRequest.emailAddress) &&
        Objects.equals(this.phoneNumber, billingDetailsUpdateRequest.phoneNumber) &&
        Objects.equals(this.taxId, billingDetailsUpdateRequest.taxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, firstName, lastName, emailAddress, phoneNumber, taxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingDetailsUpdateRequest {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

