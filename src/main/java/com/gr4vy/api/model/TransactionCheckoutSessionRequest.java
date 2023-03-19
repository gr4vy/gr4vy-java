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
 * Checkout Session payment method details to use in a transaction.
 */
@ApiModel(description = "Checkout Session payment method details to use in a transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-19T17:27:23.170866Z[Etc/UTC]")
public class TransactionCheckoutSessionRequest {
  /**
   * &#x60;checkout-session&#x60;.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    CHECKOUT_SESSION("checkout-session");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_EXTERNAL_IDENTIFIER = "external_identifier";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDENTIFIER)
  private String externalIdentifier;

  public static final String SERIALIZED_NAME_BUYER_ID = "buyer_id";
  @SerializedName(SERIALIZED_NAME_BUYER_ID)
  private UUID buyerId;

  public static final String SERIALIZED_NAME_BUYER_EXTERNAL_IDENTIFIER = "buyer_external_identifier";
  @SerializedName(SERIALIZED_NAME_BUYER_EXTERNAL_IDENTIFIER)
  private String buyerExternalIdentifier;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirect_url";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;


  public TransactionCheckoutSessionRequest method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * &#x60;checkout-session&#x60;.
   * @return method
  **/
  @ApiModelProperty(example = "checkout-session", required = true, value = "`checkout-session`.")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public TransactionCheckoutSessionRequest id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the Checkout Session.
   * @return id
  **/
  @ApiModelProperty(example = "8d3fe99b-1422-42e6-bbb3-932d95ae5f79", required = true, value = "The ID of the Checkout Session.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public TransactionCheckoutSessionRequest externalIdentifier(String externalIdentifier) {
    
    this.externalIdentifier = externalIdentifier;
    return this;
  }

   /**
   * An external identifier that can be used to match the card against your own records. This can only be set if the &#x60;store&#x60; flag is set to &#x60;true&#x60;.
   * @return externalIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "card-323444", value = "An external identifier that can be used to match the card against your own records. This can only be set if the `store` flag is set to `true`.")

  public String getExternalIdentifier() {
    return externalIdentifier;
  }


  public void setExternalIdentifier(String externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }


  public TransactionCheckoutSessionRequest buyerId(UUID buyerId) {
    
    this.buyerId = buyerId;
    return this;
  }

   /**
   * The ID of the buyer to associate this payment method to. If this field is provided then the &#x60;buyer_external_identifier&#x60; field needs to be unset.
   * @return buyerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fe26475d-ec3e-4884-9553-f7356683f7f9", value = "The ID of the buyer to associate this payment method to. If this field is provided then the `buyer_external_identifier` field needs to be unset.")

  public UUID getBuyerId() {
    return buyerId;
  }


  public void setBuyerId(UUID buyerId) {
    this.buyerId = buyerId;
  }


  public TransactionCheckoutSessionRequest buyerExternalIdentifier(String buyerExternalIdentifier) {
    
    this.buyerExternalIdentifier = buyerExternalIdentifier;
    return this;
  }

   /**
   * The &#x60;external_identifier&#x60; of the buyer to associate this payment method to. If this field is provided then the &#x60;buyer_id&#x60; field needs to be unset.
   * @return buyerExternalIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user-789123", value = "The `external_identifier` of the buyer to associate this payment method to. If this field is provided then the `buyer_id` field needs to be unset.")

  public String getBuyerExternalIdentifier() {
    return buyerExternalIdentifier;
  }


  public void setBuyerExternalIdentifier(String buyerExternalIdentifier) {
    this.buyerExternalIdentifier = buyerExternalIdentifier;
  }


  public TransactionCheckoutSessionRequest redirectUrl(String redirectUrl) {
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * We strongly recommend providing a &#x60;redirect_url&#x60; either when 3-D Secure is enabled and &#x60;three_d_secure_data&#x60; is not provided, or when using connections where 3DS is enabled. This value will be appended with both a transaction ID and status (e.g. &#x60;https://example.com/callback?gr4vy_transaction_id&#x3D;123 &amp;gr4vy_transaction_status&#x3D;capture_succeeded&#x60;) after 3-D Secure has completed. For those cases, if the value is not present, the transaction will be marked as failed.
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/callback", value = "We strongly recommend providing a `redirect_url` either when 3-D Secure is enabled and `three_d_secure_data` is not provided, or when using connections where 3DS is enabled. This value will be appended with both a transaction ID and status (e.g. `https://example.com/callback?gr4vy_transaction_id=123 &gr4vy_transaction_status=capture_succeeded`) after 3-D Secure has completed. For those cases, if the value is not present, the transaction will be marked as failed.")

  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionCheckoutSessionRequest transactionCheckoutSessionRequest = (TransactionCheckoutSessionRequest) o;
    return Objects.equals(this.method, transactionCheckoutSessionRequest.method) &&
        Objects.equals(this.id, transactionCheckoutSessionRequest.id) &&
        Objects.equals(this.externalIdentifier, transactionCheckoutSessionRequest.externalIdentifier) &&
        Objects.equals(this.buyerId, transactionCheckoutSessionRequest.buyerId) &&
        Objects.equals(this.buyerExternalIdentifier, transactionCheckoutSessionRequest.buyerExternalIdentifier) &&
        Objects.equals(this.redirectUrl, transactionCheckoutSessionRequest.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, id, externalIdentifier, buyerId, buyerExternalIdentifier, redirectUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCheckoutSessionRequest {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    buyerId: ").append(toIndentedString(buyerId)).append("\n");
    sb.append("    buyerExternalIdentifier: ").append(toIndentedString(buyerExternalIdentifier)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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

