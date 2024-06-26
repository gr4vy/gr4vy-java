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
 * Apple Pay decrypted token context.
 */
@ApiModel(description = "Apple Pay decrypted token context.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DigitalWalletApplePayTokenDecryptedContext {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  /**
   * The type of payment instrument.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DPAN("dpan"),
    
    FPAN("fpan"),
    
    NULL("null");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_HAS_CRYPTOGRAM = "has_cryptogram";
  @SerializedName(SERIALIZED_NAME_HAS_CRYPTOGRAM)
  private Boolean hasCryptogram;

  public static final String SERIALIZED_NAME_ECI = "eci";
  @SerializedName(SERIALIZED_NAME_ECI)
  private String eci;

  public static final String SERIALIZED_NAME_APPLICATION_DATA = "application_data";
  @SerializedName(SERIALIZED_NAME_APPLICATION_DATA)
  private String applicationData;

  public static final String SERIALIZED_NAME_TRANSACTION_IDENTIFIER = "transaction_identifier";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_IDENTIFIER)
  private String transactionIdentifier;

  public static final String SERIALIZED_NAME_CARDHOLDER_NAME = "cardholder_name";
  @SerializedName(SERIALIZED_NAME_CARDHOLDER_NAME)
  private String cardholderName;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_TRANSACTION_AMOUNT = "transaction_amount";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_AMOUNT)
  private Integer transactionAmount;

  public static final String SERIALIZED_NAME_DEVICE_MANUFACTURER_IDENTIFIER = "device_manufacturer_identifier";
  @SerializedName(SERIALIZED_NAME_DEVICE_MANUFACTURER_IDENTIFIER)
  private String deviceManufacturerIdentifier;

  public static final String SERIALIZED_NAME_PAYMENT_DATA_TYPE = "payment_data_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATA_TYPE)
  private String paymentDataType;

  public static final String SERIALIZED_NAME_MERCHANT_TOKEN_IDENTIFIER = "merchant_token_identifier";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TOKEN_IDENTIFIER)
  private String merchantTokenIdentifier;

  public static final String SERIALIZED_NAME_CARD_EXPIRATION_DATE = "card_expiration_date";
  @SerializedName(SERIALIZED_NAME_CARD_EXPIRATION_DATE)
  private String cardExpirationDate;

  public static final String SERIALIZED_NAME_CARD_SUFFIX = "card_suffix";
  @SerializedName(SERIALIZED_NAME_CARD_SUFFIX)
  private String cardSuffix;


  public DigitalWalletApplePayTokenDecryptedContext version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version information about the payment token.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EC_v1", value = "Version information about the payment token.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public DigitalWalletApplePayTokenDecryptedContext type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of payment instrument.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dpan", value = "The type of payment instrument.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public DigitalWalletApplePayTokenDecryptedContext expirationDate(String expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration of the decrypted data.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expiration of the decrypted data.")

  public String getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public DigitalWalletApplePayTokenDecryptedContext hasCryptogram(Boolean hasCryptogram) {
    
    this.hasCryptogram = hasCryptogram;
    return this;
  }

   /**
   * Online payment cryptogram, as defined by 3D Secure.
   * @return hasCryptogram
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Online payment cryptogram, as defined by 3D Secure.")

  public Boolean getHasCryptogram() {
    return hasCryptogram;
  }


  public void setHasCryptogram(Boolean hasCryptogram) {
    this.hasCryptogram = hasCryptogram;
  }


  public DigitalWalletApplePayTokenDecryptedContext eci(String eci) {
    
    this.eci = eci;
    return this;
  }

   /**
   * ECI indicator, as defined by 3D Secure.
   * @return eci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ECI indicator, as defined by 3D Secure.")

  public String getEci() {
    return eci;
  }


  public void setEci(String eci) {
    this.eci = eci;
  }


  public DigitalWalletApplePayTokenDecryptedContext applicationData(String applicationData) {
    
    this.applicationData = applicationData;
    return this;
  }

   /**
   * Hash of the application data property of the original request.
   * @return applicationData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hash of the application data property of the original request.")

  public String getApplicationData() {
    return applicationData;
  }


  public void setApplicationData(String applicationData) {
    this.applicationData = applicationData;
  }


  public DigitalWalletApplePayTokenDecryptedContext transactionIdentifier(String transactionIdentifier) {
    
    this.transactionIdentifier = transactionIdentifier;
    return this;
  }

   /**
   * The unique identifier from Apple Pay.
   * @return transactionIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier from Apple Pay.")

  public String getTransactionIdentifier() {
    return transactionIdentifier;
  }


  public void setTransactionIdentifier(String transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
  }


  public DigitalWalletApplePayTokenDecryptedContext cardholderName(String cardholderName) {
    
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


  public DigitalWalletApplePayTokenDecryptedContext currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * ISO 4217 numeric currency code for the transaction.
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "840", value = "ISO 4217 numeric currency code for the transaction.")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public DigitalWalletApplePayTokenDecryptedContext transactionAmount(Integer transactionAmount) {
    
    this.transactionAmount = transactionAmount;
    return this;
  }

   /**
   * The amount for the transaction.
   * @return transactionAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount for the transaction.")

  public Integer getTransactionAmount() {
    return transactionAmount;
  }


  public void setTransactionAmount(Integer transactionAmount) {
    this.transactionAmount = transactionAmount;
  }


  public DigitalWalletApplePayTokenDecryptedContext deviceManufacturerIdentifier(String deviceManufacturerIdentifier) {
    
    this.deviceManufacturerIdentifier = deviceManufacturerIdentifier;
    return this;
  }

   /**
   * Hex-encoded device manufacturer identifier which initiated the transaction.
   * @return deviceManufacturerIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hex-encoded device manufacturer identifier which initiated the transaction.")

  public String getDeviceManufacturerIdentifier() {
    return deviceManufacturerIdentifier;
  }


  public void setDeviceManufacturerIdentifier(String deviceManufacturerIdentifier) {
    this.deviceManufacturerIdentifier = deviceManufacturerIdentifier;
  }


  public DigitalWalletApplePayTokenDecryptedContext paymentDataType(String paymentDataType) {
    
    this.paymentDataType = paymentDataType;
    return this;
  }

   /**
   * Either \&quot;3DSecure\&quot; or \&quot;EMV\&quot;.
   * @return paymentDataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3DSecure", value = "Either \"3DSecure\" or \"EMV\".")

  public String getPaymentDataType() {
    return paymentDataType;
  }


  public void setPaymentDataType(String paymentDataType) {
    this.paymentDataType = paymentDataType;
  }


  public DigitalWalletApplePayTokenDecryptedContext merchantTokenIdentifier(String merchantTokenIdentifier) {
    
    this.merchantTokenIdentifier = merchantTokenIdentifier;
    return this;
  }

   /**
   * For a merchant token request, the provisioned merchant token identifier from the payment network.
   * @return merchantTokenIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For a merchant token request, the provisioned merchant token identifier from the payment network.")

  public String getMerchantTokenIdentifier() {
    return merchantTokenIdentifier;
  }


  public void setMerchantTokenIdentifier(String merchantTokenIdentifier) {
    this.merchantTokenIdentifier = merchantTokenIdentifier;
  }


  public DigitalWalletApplePayTokenDecryptedContext cardExpirationDate(String cardExpirationDate) {
    
    this.cardExpirationDate = cardExpirationDate;
    return this;
  }

   /**
   * Expiration date of card.
   * @return cardExpirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expiration date of card.")

  public String getCardExpirationDate() {
    return cardExpirationDate;
  }


  public void setCardExpirationDate(String cardExpirationDate) {
    this.cardExpirationDate = cardExpirationDate;
  }


  public DigitalWalletApplePayTokenDecryptedContext cardSuffix(String cardSuffix) {
    
    this.cardSuffix = cardSuffix;
    return this;
  }

   /**
   * Last four digits of card PAN.
   * @return cardSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last four digits of card PAN.")

  public String getCardSuffix() {
    return cardSuffix;
  }


  public void setCardSuffix(String cardSuffix) {
    this.cardSuffix = cardSuffix;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalWalletApplePayTokenDecryptedContext digitalWalletApplePayTokenDecryptedContext = (DigitalWalletApplePayTokenDecryptedContext) o;
    return Objects.equals(this.version, digitalWalletApplePayTokenDecryptedContext.version) &&
        Objects.equals(this.type, digitalWalletApplePayTokenDecryptedContext.type) &&
        Objects.equals(this.expirationDate, digitalWalletApplePayTokenDecryptedContext.expirationDate) &&
        Objects.equals(this.hasCryptogram, digitalWalletApplePayTokenDecryptedContext.hasCryptogram) &&
        Objects.equals(this.eci, digitalWalletApplePayTokenDecryptedContext.eci) &&
        Objects.equals(this.applicationData, digitalWalletApplePayTokenDecryptedContext.applicationData) &&
        Objects.equals(this.transactionIdentifier, digitalWalletApplePayTokenDecryptedContext.transactionIdentifier) &&
        Objects.equals(this.cardholderName, digitalWalletApplePayTokenDecryptedContext.cardholderName) &&
        Objects.equals(this.currencyCode, digitalWalletApplePayTokenDecryptedContext.currencyCode) &&
        Objects.equals(this.transactionAmount, digitalWalletApplePayTokenDecryptedContext.transactionAmount) &&
        Objects.equals(this.deviceManufacturerIdentifier, digitalWalletApplePayTokenDecryptedContext.deviceManufacturerIdentifier) &&
        Objects.equals(this.paymentDataType, digitalWalletApplePayTokenDecryptedContext.paymentDataType) &&
        Objects.equals(this.merchantTokenIdentifier, digitalWalletApplePayTokenDecryptedContext.merchantTokenIdentifier) &&
        Objects.equals(this.cardExpirationDate, digitalWalletApplePayTokenDecryptedContext.cardExpirationDate) &&
        Objects.equals(this.cardSuffix, digitalWalletApplePayTokenDecryptedContext.cardSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, type, expirationDate, hasCryptogram, eci, applicationData, transactionIdentifier, cardholderName, currencyCode, transactionAmount, deviceManufacturerIdentifier, paymentDataType, merchantTokenIdentifier, cardExpirationDate, cardSuffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalWalletApplePayTokenDecryptedContext {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    hasCryptogram: ").append(toIndentedString(hasCryptogram)).append("\n");
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
    sb.append("    applicationData: ").append(toIndentedString(applicationData)).append("\n");
    sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    deviceManufacturerIdentifier: ").append(toIndentedString(deviceManufacturerIdentifier)).append("\n");
    sb.append("    paymentDataType: ").append(toIndentedString(paymentDataType)).append("\n");
    sb.append("    merchantTokenIdentifier: ").append(toIndentedString(merchantTokenIdentifier)).append("\n");
    sb.append("    cardExpirationDate: ").append(toIndentedString(cardExpirationDate)).append("\n");
    sb.append("    cardSuffix: ").append(toIndentedString(cardSuffix)).append("\n");
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

