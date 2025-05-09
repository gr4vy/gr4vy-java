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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * The recipient of an account funding transaction.
 */
@ApiModel(description = "The recipient of an account funding transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Recipient {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;


  public Recipient firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name(s) or given name for the recipient.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John", value = "The first name(s) or given name for the recipient.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public Recipient lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name, or family name, of the recipient.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lunn", value = "The last name, or family name, of the recipient.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public Recipient address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * The billing address for the recipient.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The billing address for the recipient.")

  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public Recipient accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The destination account number to receive an account funding transaction.
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567", value = "The destination account number to receive an account funding transaction.")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public Recipient dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The recipient&#39;s date of birth.
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sat Aug 31 00:00:00 UTC 1996", value = "The recipient's date of birth.")

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recipient recipient = (Recipient) o;
    return Objects.equals(this.firstName, recipient.firstName) &&
        Objects.equals(this.lastName, recipient.lastName) &&
        Objects.equals(this.address, recipient.address) &&
        Objects.equals(this.accountNumber, recipient.accountNumber) &&
        Objects.equals(this.dateOfBirth, recipient.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, address, accountNumber, dateOfBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipient {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

