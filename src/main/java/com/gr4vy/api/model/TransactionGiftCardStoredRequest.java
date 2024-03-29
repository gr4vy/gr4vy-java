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
import java.util.UUID;

/**
 * Create a transaction with a stored gift card.
 */
@ApiModel(description = "Create a transaction with a stored gift card.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionGiftCardStoredRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;


  public TransactionGiftCardStoredRequest id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the gift card to check a balance for.
   * @return id
  **/
  @ApiModelProperty(example = "e6cdf979-87e2-4796-8ff6-9784d5aed893", required = true, value = "The ID of the gift card to check a balance for.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public TransactionGiftCardStoredRequest amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The monetary amount to charge for this gift card, in the smallest currency unit for the given currency, for example &#x60;1299&#x60; cents to create an authorization for &#x60;$12.99&#x60;.  All gift card amounts are subtracted from the total transaction amount. The remainder is charged to the provided &#x60;payment_method&#x60;.
   * minimum: 1
   * maximum: 99999999
   * @return amount
  **/
  @ApiModelProperty(example = "1299", required = true, value = "The monetary amount to charge for this gift card, in the smallest currency unit for the given currency, for example `1299` cents to create an authorization for `$12.99`.  All gift card amounts are subtracted from the total transaction amount. The remainder is charged to the provided `payment_method`.")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionGiftCardStoredRequest transactionGiftCardStoredRequest = (TransactionGiftCardStoredRequest) o;
    return Objects.equals(this.id, transactionGiftCardStoredRequest.id) &&
        Objects.equals(this.amount, transactionGiftCardStoredRequest.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionGiftCardStoredRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

