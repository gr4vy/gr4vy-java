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
 * Details to register a new redirect payment method.
 */
@ApiModel(description = "Details to register a new redirect payment method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-06T15:11:33.631354Z[Etc/UTC]")
public class RedirectRequest {
  /**
   * The method to use, this can be any of the methods that support redirect requests.  When storing a new payment method, only &#x60;gocardless&#x60; and &#x60;stripedd&#x60; are currently supported.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    PAYPAL("paypal"),
    
    BANKED("banked"),
    
    BITPAY("bitpay"),
    
    GOCARDLESS("gocardless"),
    
    STRIPEDD("stripedd");

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

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirect_url";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_EXTERNAL_IDENTIFIER = "external_identifier";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDENTIFIER)
  private String externalIdentifier;

  public static final String SERIALIZED_NAME_BUYER_ID = "buyer_id";
  @SerializedName(SERIALIZED_NAME_BUYER_ID)
  private UUID buyerId;

  public static final String SERIALIZED_NAME_BUYER_EXTERNAL_IDENTIFIER = "buyer_external_identifier";
  @SerializedName(SERIALIZED_NAME_BUYER_EXTERNAL_IDENTIFIER)
  private String buyerExternalIdentifier;


  public RedirectRequest method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * The method to use, this can be any of the methods that support redirect requests.  When storing a new payment method, only &#x60;gocardless&#x60; and &#x60;stripedd&#x60; are currently supported.
   * @return method
  **/
  @ApiModelProperty(example = "paypal", required = true, value = "The method to use, this can be any of the methods that support redirect requests.  When storing a new payment method, only `gocardless` and `stripedd` are currently supported.")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public RedirectRequest redirectUrl(String redirectUrl) {
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * The redirect URL to redirect a buyer to after they have authorized their transaction.
   * @return redirectUrl
  **/
  @ApiModelProperty(example = "https://example.com/callback", required = true, value = "The redirect URL to redirect a buyer to after they have authorized their transaction.")

  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  public RedirectRequest currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The ISO-4217 currency code to use this payment method for. This is used to select the payment service to use.
   * @return currency
  **/
  @ApiModelProperty(example = "USD", required = true, value = "The ISO-4217 currency code to use this payment method for. This is used to select the payment service to use.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public RedirectRequest country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The 2-letter ISO code of the country to use this payment method for. This is used to select the payment service to use.
   * @return country
  **/
  @ApiModelProperty(example = "US", required = true, value = "The 2-letter ISO code of the country to use this payment method for. This is used to select the payment service to use.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public RedirectRequest externalIdentifier(String externalIdentifier) {
    
    this.externalIdentifier = externalIdentifier;
    return this;
  }

   /**
   * An external identifier that can be used to match the account against your own records.
   * @return externalIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "account-23423423", value = "An external identifier that can be used to match the account against your own records.")

  public String getExternalIdentifier() {
    return externalIdentifier;
  }


  public void setExternalIdentifier(String externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }


  public RedirectRequest buyerId(UUID buyerId) {
    
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


  public RedirectRequest buyerExternalIdentifier(String buyerExternalIdentifier) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectRequest redirectRequest = (RedirectRequest) o;
    return Objects.equals(this.method, redirectRequest.method) &&
        Objects.equals(this.redirectUrl, redirectRequest.redirectUrl) &&
        Objects.equals(this.currency, redirectRequest.currency) &&
        Objects.equals(this.country, redirectRequest.country) &&
        Objects.equals(this.externalIdentifier, redirectRequest.externalIdentifier) &&
        Objects.equals(this.buyerId, redirectRequest.buyerId) &&
        Objects.equals(this.buyerExternalIdentifier, redirectRequest.buyerExternalIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, redirectUrl, currency, country, externalIdentifier, buyerId, buyerExternalIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectRequest {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    buyerId: ").append(toIndentedString(buyerId)).append("\n");
    sb.append("    buyerExternalIdentifier: ").append(toIndentedString(buyerExternalIdentifier)).append("\n");
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

