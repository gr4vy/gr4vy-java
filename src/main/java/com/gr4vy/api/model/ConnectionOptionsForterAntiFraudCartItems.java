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
import com.gr4vy.api.model.ConnectionOptionsForterAntiFraudBasicItemData;
import com.gr4vy.api.model.ConnectionOptionsForterAntiFraudBeneficiaries;
import com.gr4vy.api.model.ConnectionOptionsForterAntiFraudDeliveryDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ConnectionOptionsForterAntiFraudCartItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectionOptionsForterAntiFraudCartItems {
  public static final String SERIALIZED_NAME_BASIC_ITEM_DATA = "basic_item_data";
  @SerializedName(SERIALIZED_NAME_BASIC_ITEM_DATA)
  private ConnectionOptionsForterAntiFraudBasicItemData basicItemData;

  public static final String SERIALIZED_NAME_DELIVERY_DETAILS = "delivery_details";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DETAILS)
  private ConnectionOptionsForterAntiFraudDeliveryDetails deliveryDetails;

  public static final String SERIALIZED_NAME_BENEFICIARIES = "beneficiaries";
  @SerializedName(SERIALIZED_NAME_BENEFICIARIES)
  private List<ConnectionOptionsForterAntiFraudBeneficiaries> beneficiaries = null;


  public ConnectionOptionsForterAntiFraudCartItems basicItemData(ConnectionOptionsForterAntiFraudBasicItemData basicItemData) {
    
    this.basicItemData = basicItemData;
    return this;
  }

   /**
   * Get basicItemData
   * @return basicItemData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionOptionsForterAntiFraudBasicItemData getBasicItemData() {
    return basicItemData;
  }


  public void setBasicItemData(ConnectionOptionsForterAntiFraudBasicItemData basicItemData) {
    this.basicItemData = basicItemData;
  }


  public ConnectionOptionsForterAntiFraudCartItems deliveryDetails(ConnectionOptionsForterAntiFraudDeliveryDetails deliveryDetails) {
    
    this.deliveryDetails = deliveryDetails;
    return this;
  }

   /**
   * Get deliveryDetails
   * @return deliveryDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionOptionsForterAntiFraudDeliveryDetails getDeliveryDetails() {
    return deliveryDetails;
  }


  public void setDeliveryDetails(ConnectionOptionsForterAntiFraudDeliveryDetails deliveryDetails) {
    this.deliveryDetails = deliveryDetails;
  }


  public ConnectionOptionsForterAntiFraudCartItems beneficiaries(List<ConnectionOptionsForterAntiFraudBeneficiaries> beneficiaries) {
    
    this.beneficiaries = beneficiaries;
    return this;
  }

  public ConnectionOptionsForterAntiFraudCartItems addBeneficiariesItem(ConnectionOptionsForterAntiFraudBeneficiaries beneficiariesItem) {
    if (this.beneficiaries == null) {
      this.beneficiaries = new ArrayList<ConnectionOptionsForterAntiFraudBeneficiaries>();
    }
    this.beneficiaries.add(beneficiariesItem);
    return this;
  }

   /**
   * List of all entities receiving or using the purchased cart item.
   * @return beneficiaries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all entities receiving or using the purchased cart item.")

  public List<ConnectionOptionsForterAntiFraudBeneficiaries> getBeneficiaries() {
    return beneficiaries;
  }


  public void setBeneficiaries(List<ConnectionOptionsForterAntiFraudBeneficiaries> beneficiaries) {
    this.beneficiaries = beneficiaries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionOptionsForterAntiFraudCartItems connectionOptionsForterAntiFraudCartItems = (ConnectionOptionsForterAntiFraudCartItems) o;
    return Objects.equals(this.basicItemData, connectionOptionsForterAntiFraudCartItems.basicItemData) &&
        Objects.equals(this.deliveryDetails, connectionOptionsForterAntiFraudCartItems.deliveryDetails) &&
        Objects.equals(this.beneficiaries, connectionOptionsForterAntiFraudCartItems.beneficiaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicItemData, deliveryDetails, beneficiaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionOptionsForterAntiFraudCartItems {\n");
    sb.append("    basicItemData: ").append(toIndentedString(basicItemData)).append("\n");
    sb.append("    deliveryDetails: ").append(toIndentedString(deliveryDetails)).append("\n");
    sb.append("    beneficiaries: ").append(toIndentedString(beneficiaries)).append("\n");
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

