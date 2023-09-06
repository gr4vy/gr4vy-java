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
import com.google.gson.annotations.SerializedName;

/**
 * Billing details to use associated to a buyer.
 */

public class BillingDetailsRequest {
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

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_TAX_ID = "tax_id";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private TaxId taxId;


  public BillingDetailsRequest firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name(s) or given name for the buyer.
   * @return firstName
  **/

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public BillingDetailsRequest lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name, or family name, of the buyer.
   * @return lastName
  **/

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public BillingDetailsRequest emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address for the buyer.
   * @return emailAddress
  **/

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public BillingDetailsRequest phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number for the buyer which should be formatted according to the [E164 number standard](https://www.twilio.com/docs/glossary/what-e164).
   * @return phoneNumber
  **/

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public BillingDetailsRequest address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * The billing address for the buyer.
   * @return address
  **/

  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public BillingDetailsRequest taxId(TaxId taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * The tax ID information associated with the billing details.
   * @return taxId
  **/

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
    BillingDetailsRequest billingDetailsRequest = (BillingDetailsRequest) o;
    return Objects.equals(this.firstName, billingDetailsRequest.firstName) &&
        Objects.equals(this.lastName, billingDetailsRequest.lastName) &&
        Objects.equals(this.emailAddress, billingDetailsRequest.emailAddress) &&
        Objects.equals(this.phoneNumber, billingDetailsRequest.phoneNumber) &&
        Objects.equals(this.address, billingDetailsRequest.address) &&
        Objects.equals(this.taxId, billingDetailsRequest.taxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, emailAddress, phoneNumber, address, taxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingDetailsRequest {\n");
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

