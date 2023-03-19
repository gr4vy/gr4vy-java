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
import com.gr4vy.api.model.BuyerSnapshot;
import com.gr4vy.api.model.PaymentMethodSnapshot;
import com.gr4vy.api.model.PaymentServiceSnapshot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * A transaction record.
 */
@ApiModel(description = "A transaction record.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-19T17:27:23.170866Z[Etc/UTC]")
public class TransactionSummary {
  /**
   * The type of this resource. Is always &#x60;transaction&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TRANSACTION("transaction");

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  /**
   * The status of the transaction. The status may change over time as asynchronous processing events occur.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PROCESSING("processing"),
    
    BUYER_APPROVAL_PENDING("buyer_approval_pending"),
    
    AUTHORIZATION_SUCCEEDED("authorization_succeeded"),
    
    AUTHORIZATION_FAILED("authorization_failed"),
    
    AUTHORIZATION_DECLINED("authorization_declined"),
    
    CAPTURE_PENDING("capture_pending"),
    
    CAPTURE_SUCCEEDED("capture_succeeded"),
    
    AUTHORIZATION_VOID_PENDING("authorization_void_pending"),
    
    AUTHORIZATION_VOIDED("authorization_voided");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  /**
   * The original &#x60;intent&#x60; used when the transaction was [created](#operation/authorize-new-transaction).
   */
  @JsonAdapter(IntentEnum.Adapter.class)
  public enum IntentEnum {
    AUTHORIZE("authorize"),
    
    CAPTURE("capture");

    private String value;

    IntentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IntentEnum fromValue(String value) {
      for (IntentEnum b : IntentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IntentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IntentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IntentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INTENT = "intent";
  @SerializedName(SERIALIZED_NAME_INTENT)
  private IntentEnum intent;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_CAPTURED_AMOUNT = "captured_amount";
  @SerializedName(SERIALIZED_NAME_CAPTURED_AMOUNT)
  private Integer capturedAmount;

  public static final String SERIALIZED_NAME_REFUNDED_AMOUNT = "refunded_amount";
  @SerializedName(SERIALIZED_NAME_REFUNDED_AMOUNT)
  private Integer refundedAmount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentMethodSnapshot paymentMethod;

  public static final String SERIALIZED_NAME_BUYER = "buyer";
  @SerializedName(SERIALIZED_NAME_BUYER)
  private BuyerSnapshot buyer;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EXTERNAL_IDENTIFIER = "external_identifier";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDENTIFIER)
  private String externalIdentifier;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_PAYMENT_SERVICE = "payment_service";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SERVICE)
  private PaymentServiceSnapshot paymentService;

  /**
   * Gets or Sets method
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    AFTERPAY("afterpay"),
    
    APPLEPAY("applepay"),
    
    BANKED("banked"),
    
    BITPAY("bitpay"),
    
    BOLETO("boleto"),
    
    CARD("card"),
    
    CLEARPAY("clearpay"),
    
    DANA("dana"),
    
    FORTUMO("fortumo"),
    
    GCASH("gcash"),
    
    GOCARDLESS("gocardless"),
    
    GOOGLEPAY("googlepay"),
    
    GRABPAY("grabpay"),
    
    KLARNA("klarna"),
    
    OVO("ovo"),
    
    PAYMAYA("paymaya"),
    
    PAYPAL("paypal"),
    
    PIX("pix"),
    
    RABBITLINEPAY("rabbitlinepay"),
    
    SCALAPAY("scalapay"),
    
    SHOPEEPAY("shopeepay"),
    
    STRIPEDD("stripedd"),
    
    TRUEMONEY("truemoney"),
    
    TRUSTLY("trustly"),
    
    ZIPPAY("zippay");

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

  public static final String SERIALIZED_NAME_RAW_RESPONSE_CODE = "raw_response_code";
  @SerializedName(SERIALIZED_NAME_RAW_RESPONSE_CODE)
  private String rawResponseCode;

  public static final String SERIALIZED_NAME_RAW_RESPONSE_DESCRIPTION = "raw_response_description";
  @SerializedName(SERIALIZED_NAME_RAW_RESPONSE_DESCRIPTION)
  private String rawResponseDescription;


  public TransactionSummary type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of this resource. Is always &#x60;transaction&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "transaction", value = "The type of this resource. Is always `transaction`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public TransactionSummary id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for this transaction.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fe26475d-ec3e-4884-9553-f7356683f7f9", value = "The unique identifier for this transaction.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public TransactionSummary status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the transaction. The status may change over time as asynchronous processing events occur.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "processing", value = "The status of the transaction. The status may change over time as asynchronous processing events occur.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public TransactionSummary intent(IntentEnum intent) {
    
    this.intent = intent;
    return this;
  }

   /**
   * The original &#x60;intent&#x60; used when the transaction was [created](#operation/authorize-new-transaction).
   * @return intent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "authorize", value = "The original `intent` used when the transaction was [created](#operation/authorize-new-transaction).")

  public IntentEnum getIntent() {
    return intent;
  }


  public void setIntent(IntentEnum intent) {
    this.intent = intent;
  }


  public TransactionSummary amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The authorized amount for this transaction. This can be more than the actual captured amount and part of this amount may be refunded.
   * minimum: 0
   * maximum: 99999999
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1299", value = "The authorized amount for this transaction. This can be more than the actual captured amount and part of this amount may be refunded.")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public TransactionSummary capturedAmount(Integer capturedAmount) {
    
    this.capturedAmount = capturedAmount;
    return this;
  }

   /**
   * The captured amount for this transaction. This can be the total or a portion of the authorized amount.
   * minimum: 0
   * maximum: 99999999
   * @return capturedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "999", value = "The captured amount for this transaction. This can be the total or a portion of the authorized amount.")

  public Integer getCapturedAmount() {
    return capturedAmount;
  }


  public void setCapturedAmount(Integer capturedAmount) {
    this.capturedAmount = capturedAmount;
  }


  public TransactionSummary refundedAmount(Integer refundedAmount) {
    
    this.refundedAmount = refundedAmount;
    return this;
  }

   /**
   * The refunded amount for this transaction. This can be the total or a portion of the captured amount.
   * minimum: 0
   * maximum: 99999999
   * @return refundedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "The refunded amount for this transaction. This can be the total or a portion of the captured amount.")

  public Integer getRefundedAmount() {
    return refundedAmount;
  }


  public void setRefundedAmount(Integer refundedAmount) {
    this.refundedAmount = refundedAmount;
  }


  public TransactionSummary currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency code for this transaction.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The currency code for this transaction.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public TransactionSummary country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The 2-letter ISO code of the country of the transaction. This is used to filter the payment services that is used to process the transaction. 
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "The 2-letter ISO code of the country of the transaction. This is used to filter the payment services that is used to process the transaction. ")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public TransactionSummary paymentMethod(PaymentMethodSnapshot paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The payment method used for this transaction.
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payment method used for this transaction.")

  public PaymentMethodSnapshot getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(PaymentMethodSnapshot paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public TransactionSummary buyer(BuyerSnapshot buyer) {
    
    this.buyer = buyer;
    return this;
  }

   /**
   * The buyer used for this transaction.
   * @return buyer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The buyer used for this transaction.")

  public BuyerSnapshot getBuyer() {
    return buyer;
  }


  public void setBuyer(BuyerSnapshot buyer) {
    this.buyer = buyer;
  }


  public TransactionSummary createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when this transaction was created in our system.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-07-16T19:23Z", value = "The date and time when this transaction was created in our system.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public TransactionSummary externalIdentifier(String externalIdentifier) {
    
    this.externalIdentifier = externalIdentifier;
    return this;
  }

   /**
   * An external identifier that can be used to match the transaction against your own records.
   * @return externalIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user-789123", value = "An external identifier that can be used to match the transaction against your own records.")

  public String getExternalIdentifier() {
    return externalIdentifier;
  }


  public void setExternalIdentifier(String externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }


  public TransactionSummary updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Defines when the transaction was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines when the transaction was last updated.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public TransactionSummary paymentService(PaymentServiceSnapshot paymentService) {
    
    this.paymentService = paymentService;
    return this;
  }

   /**
   * The payment service used for this transaction.
   * @return paymentService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payment service used for this transaction.")

  public PaymentServiceSnapshot getPaymentService() {
    return paymentService;
  }


  public void setPaymentService(PaymentServiceSnapshot paymentService) {
    this.paymentService = paymentService;
  }


  public TransactionSummary method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "card", value = "")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public TransactionSummary rawResponseCode(String rawResponseCode) {
    
    this.rawResponseCode = rawResponseCode;
    return this;
  }

   /**
   * This is the response code received from the payment service. This can be set to any value and is not standardized across different payment services.
   * @return rawResponseCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "incorrect-zip", value = "This is the response code received from the payment service. This can be set to any value and is not standardized across different payment services.")

  public String getRawResponseCode() {
    return rawResponseCode;
  }


  public void setRawResponseCode(String rawResponseCode) {
    this.rawResponseCode = rawResponseCode;
  }


  public TransactionSummary rawResponseDescription(String rawResponseDescription) {
    
    this.rawResponseDescription = rawResponseDescription;
    return this;
  }

   /**
   * This is the response description received from the payment service. This can be set to any value and is not standardized across different payment services.
   * @return rawResponseDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The card's postal code is incorrect. Check the card's postal code or use a different card.", value = "This is the response description received from the payment service. This can be set to any value and is not standardized across different payment services.")

  public String getRawResponseDescription() {
    return rawResponseDescription;
  }


  public void setRawResponseDescription(String rawResponseDescription) {
    this.rawResponseDescription = rawResponseDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSummary transactionSummary = (TransactionSummary) o;
    return Objects.equals(this.type, transactionSummary.type) &&
        Objects.equals(this.id, transactionSummary.id) &&
        Objects.equals(this.status, transactionSummary.status) &&
        Objects.equals(this.intent, transactionSummary.intent) &&
        Objects.equals(this.amount, transactionSummary.amount) &&
        Objects.equals(this.capturedAmount, transactionSummary.capturedAmount) &&
        Objects.equals(this.refundedAmount, transactionSummary.refundedAmount) &&
        Objects.equals(this.currency, transactionSummary.currency) &&
        Objects.equals(this.country, transactionSummary.country) &&
        Objects.equals(this.paymentMethod, transactionSummary.paymentMethod) &&
        Objects.equals(this.buyer, transactionSummary.buyer) &&
        Objects.equals(this.createdAt, transactionSummary.createdAt) &&
        Objects.equals(this.externalIdentifier, transactionSummary.externalIdentifier) &&
        Objects.equals(this.updatedAt, transactionSummary.updatedAt) &&
        Objects.equals(this.paymentService, transactionSummary.paymentService) &&
        Objects.equals(this.method, transactionSummary.method) &&
        Objects.equals(this.rawResponseCode, transactionSummary.rawResponseCode) &&
        Objects.equals(this.rawResponseDescription, transactionSummary.rawResponseDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, status, intent, amount, capturedAmount, refundedAmount, currency, country, paymentMethod, buyer, createdAt, externalIdentifier, updatedAt, paymentService, method, rawResponseCode, rawResponseDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSummary {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    capturedAmount: ").append(toIndentedString(capturedAmount)).append("\n");
    sb.append("    refundedAmount: ").append(toIndentedString(refundedAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    paymentService: ").append(toIndentedString(paymentService)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    rawResponseCode: ").append(toIndentedString(rawResponseCode)).append("\n");
    sb.append("    rawResponseDescription: ").append(toIndentedString(rawResponseDescription)).append("\n");
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

