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
 * Details for a Google Pay decrypted token payment method.
 */
@ApiModel(description = "Details for a Google Pay decrypted token payment method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionNetworkTokenGooglePayRequest {
  /**
   * &#x60;network-token&#x60;.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    NETWORK_TOKEN("network-token");

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

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_CRYPTOGRAM = "cryptogram";
  @SerializedName(SERIALIZED_NAME_CRYPTOGRAM)
  private String cryptogram;

  public static final String SERIALIZED_NAME_ECI = "eci";
  @SerializedName(SERIALIZED_NAME_ECI)
  private String eci;

  /**
   * Gets or Sets cardSource
   */
  @JsonAdapter(CardSourceEnum.Adapter.class)
  public enum CardSourceEnum {
    GOOGLE_PAY("google-pay");

    private String value;

    CardSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CardSourceEnum fromValue(String value) {
      for (CardSourceEnum b : CardSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CardSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CardSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CardSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CardSourceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CARD_SOURCE = "card_source";
  @SerializedName(SERIALIZED_NAME_CARD_SOURCE)
  private CardSourceEnum cardSource;

  public static final String SERIALIZED_NAME_CARD_SUFFIX = "card_suffix";
  @SerializedName(SERIALIZED_NAME_CARD_SUFFIX)
  private String cardSuffix;

  public static final String SERIALIZED_NAME_CARD_SCHEME = "card_scheme";
  @SerializedName(SERIALIZED_NAME_CARD_SCHEME)
  private String cardScheme;

  public static final String SERIALIZED_NAME_CARDHOLDER_NAME = "cardholder_name";
  @SerializedName(SERIALIZED_NAME_CARDHOLDER_NAME)
  private String cardholderName;


  public TransactionNetworkTokenGooglePayRequest method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * &#x60;network-token&#x60;.
   * @return method
  **/
  @ApiModelProperty(example = "network-token", required = true, value = "`network-token`.")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public TransactionNetworkTokenGooglePayRequest token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * The value of the decrypted Apple Pay token.
   * @return token
  **/
  @ApiModelProperty(required = true, value = "The value of the decrypted Apple Pay token.")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public TransactionNetworkTokenGooglePayRequest expirationDate(String expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The expiration date of the network token, formatted &#x60;MM/YY&#x60;.
   * @return expirationDate
  **/
  @ApiModelProperty(example = "11/25", required = true, value = "The expiration date of the network token, formatted `MM/YY`.")

  public String getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public TransactionNetworkTokenGooglePayRequest cryptogram(String cryptogram) {
    
    this.cryptogram = cryptogram;
    return this;
  }

   /**
   * The cryptogram of the network token.
   * @return cryptogram
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cryptogram of the network token.")

  public String getCryptogram() {
    return cryptogram;
  }


  public void setCryptogram(String cryptogram) {
    this.cryptogram = cryptogram;
  }


  public TransactionNetworkTokenGooglePayRequest eci(String eci) {
    
    this.eci = eci;
    return this;
  }

   /**
   * The ecommerce indicator for 3D-Secure.
   * @return eci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "05", value = "The ecommerce indicator for 3D-Secure.")

  public String getEci() {
    return eci;
  }


  public void setEci(String eci) {
    this.eci = eci;
  }


  public TransactionNetworkTokenGooglePayRequest cardSource(CardSourceEnum cardSource) {
    
    this.cardSource = cardSource;
    return this;
  }

   /**
   * Get cardSource
   * @return cardSource
  **/
  @ApiModelProperty(example = "google-pay", required = true, value = "")

  public CardSourceEnum getCardSource() {
    return cardSource;
  }


  public void setCardSource(CardSourceEnum cardSource) {
    this.cardSource = cardSource;
  }


  public TransactionNetworkTokenGooglePayRequest cardSuffix(String cardSuffix) {
    
    this.cardSuffix = cardSuffix;
    return this;
  }

   /**
   * Last four digits of card PAN.
   * @return cardSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "Last four digits of card PAN.")

  public String getCardSuffix() {
    return cardSuffix;
  }


  public void setCardSuffix(String cardSuffix) {
    this.cardSuffix = cardSuffix;
  }


  public TransactionNetworkTokenGooglePayRequest cardScheme(String cardScheme) {
    
    this.cardScheme = cardScheme;
    return this;
  }

   /**
   * The scheme/brand of the card.
   * @return cardScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The scheme/brand of the card.")

  public String getCardScheme() {
    return cardScheme;
  }


  public void setCardScheme(String cardScheme) {
    this.cardScheme = cardScheme;
  }


  public TransactionNetworkTokenGooglePayRequest cardholderName(String cardholderName) {
    
    this.cardholderName = cardholderName;
    return this;
  }

   /**
   * The cardholder name.
   * @return cardholderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cardholder name.")

  public String getCardholderName() {
    return cardholderName;
  }


  public void setCardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionNetworkTokenGooglePayRequest transactionNetworkTokenGooglePayRequest = (TransactionNetworkTokenGooglePayRequest) o;
    return Objects.equals(this.method, transactionNetworkTokenGooglePayRequest.method) &&
        Objects.equals(this.token, transactionNetworkTokenGooglePayRequest.token) &&
        Objects.equals(this.expirationDate, transactionNetworkTokenGooglePayRequest.expirationDate) &&
        Objects.equals(this.cryptogram, transactionNetworkTokenGooglePayRequest.cryptogram) &&
        Objects.equals(this.eci, transactionNetworkTokenGooglePayRequest.eci) &&
        Objects.equals(this.cardSource, transactionNetworkTokenGooglePayRequest.cardSource) &&
        Objects.equals(this.cardSuffix, transactionNetworkTokenGooglePayRequest.cardSuffix) &&
        Objects.equals(this.cardScheme, transactionNetworkTokenGooglePayRequest.cardScheme) &&
        Objects.equals(this.cardholderName, transactionNetworkTokenGooglePayRequest.cardholderName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, token, expirationDate, cryptogram, eci, cardSource, cardSuffix, cardScheme, cardholderName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionNetworkTokenGooglePayRequest {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
    sb.append("    cardSource: ").append(toIndentedString(cardSource)).append("\n");
    sb.append("    cardSuffix: ").append(toIndentedString(cardSuffix)).append("\n");
    sb.append("    cardScheme: ").append(toIndentedString(cardScheme)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
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

