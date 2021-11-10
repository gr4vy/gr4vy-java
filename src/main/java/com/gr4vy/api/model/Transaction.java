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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-10T11:15:12.826734Z[Etc/UTC]")
public class Transaction {
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
   * The status of the transaction. The status may change over time as asynchronous  processing events occur.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PROCESSING("processing"),
    
    PROCESSING_FAILED("processing_failed"),
    
    CAPTURE_SUCCEEDED("capture_succeeded"),
    
    CAPTURE_PENDING("capture_pending"),
    
    CAPTURE_DECLINED("capture_declined"),
    
    CAPTURE_FAILED("capture_failed"),
    
    AUTHORIZATION_SUCCEEDED("authorization_succeeded"),
    
    AUTHORIZATION_PENDING("authorization_pending"),
    
    AUTHORIZATION_DECLINED("authorization_declined"),
    
    AUTHORIZATION_FAILED("authorization_failed"),
    
    AUTHORIZATION_EXPIRED("authorization_expired"),
    
    AUTHORIZATION_VOIDED("authorization_voided"),
    
    REFUND_SUCCEEDED("refund_succeeded"),
    
    REFUND_PENDING("refund_pending"),
    
    REFUND_DECLINED("refund_declined"),
    
    REFUND_FAILED("refund_failed"),
    
    BUYER_APPROVAL_SUCCEEDED("buyer_approval_succeeded"),
    
    BUYER_APPROVAL_PENDING("buyer_approval_pending"),
    
    BUYER_APPROVAL_DECLINED("buyer_approval_declined"),
    
    BUYER_APPROVAL_FAILED("buyer_approval_failed"),
    
    BUYER_APPROVAL_TIMEDOUT("buyer_approval_timedout");

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
   * The environment this transaction has been created in.
   */
  @JsonAdapter(EnvironmentEnum.Adapter.class)
  public enum EnvironmentEnum {
    DEVELOPMENT("development"),
    
    STAGING("staging"),
    
    PRODUCTION("production");

    private String value;

    EnvironmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnvironmentEnum fromValue(String value) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnvironmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvironmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvironmentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnvironmentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private EnvironmentEnum environment = EnvironmentEnum.PRODUCTION;


  public Transaction type(TypeEnum type) {
    
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


  public Transaction id(UUID id) {
    
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


  public Transaction status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the transaction. The status may change over time as asynchronous  processing events occur.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "processing", value = "The status of the transaction. The status may change over time as asynchronous  processing events occur.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Transaction amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The authorized amount for this transaction. This can be different than the actual captured amount and part of this amount may be refunded.
   * minimum: 0
   * maximum: 99999999
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1299", value = "The authorized amount for this transaction. This can be different than the actual captured amount and part of this amount may be refunded.")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public Transaction capturedAmount(Integer capturedAmount) {
    
    this.capturedAmount = capturedAmount;
    return this;
  }

   /**
   * The captured amount for this transaction. This can be a part and in some cases even more than the authorized amount.
   * minimum: 0
   * maximum: 99999999
   * @return capturedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "999", value = "The captured amount for this transaction. This can be a part and in some cases even more than the authorized amount.")

  public Integer getCapturedAmount() {
    return capturedAmount;
  }


  public void setCapturedAmount(Integer capturedAmount) {
    this.capturedAmount = capturedAmount;
  }


  public Transaction refundedAmount(Integer refundedAmount) {
    
    this.refundedAmount = refundedAmount;
    return this;
  }

   /**
   * The refunded amount for this transaction. This can be a part or all of the captured amount.
   * minimum: 0
   * maximum: 99999999
   * @return refundedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "The refunded amount for this transaction. This can be a part or all of the captured amount.")

  public Integer getRefundedAmount() {
    return refundedAmount;
  }


  public void setRefundedAmount(Integer refundedAmount) {
    this.refundedAmount = refundedAmount;
  }


  public Transaction currency(String currency) {
    
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


  public Transaction paymentMethod(PaymentMethodSnapshot paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentMethodSnapshot getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(PaymentMethodSnapshot paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public Transaction buyer(BuyerSnapshot buyer) {
    
    this.buyer = buyer;
    return this;
  }

   /**
   * Get buyer
   * @return buyer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BuyerSnapshot getBuyer() {
    return buyer;
  }


  public void setBuyer(BuyerSnapshot buyer) {
    this.buyer = buyer;
  }


  public Transaction createdAt(OffsetDateTime createdAt) {
    
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


  public Transaction externalIdentifier(String externalIdentifier) {
    
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


  public Transaction updatedAt(OffsetDateTime updatedAt) {
    
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


  public Transaction paymentService(PaymentServiceSnapshot paymentService) {
    
    this.paymentService = paymentService;
    return this;
  }

   /**
   * Get paymentService
   * @return paymentService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentServiceSnapshot getPaymentService() {
    return paymentService;
  }


  public void setPaymentService(PaymentServiceSnapshot paymentService) {
    this.paymentService = paymentService;
  }


  public Transaction environment(EnvironmentEnum environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * The environment this transaction has been created in.
   * @return environment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "production", value = "The environment this transaction has been created in.")

  public EnvironmentEnum getEnvironment() {
    return environment;
  }


  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.type, transaction.type) &&
        Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.status, transaction.status) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.capturedAmount, transaction.capturedAmount) &&
        Objects.equals(this.refundedAmount, transaction.refundedAmount) &&
        Objects.equals(this.currency, transaction.currency) &&
        Objects.equals(this.paymentMethod, transaction.paymentMethod) &&
        Objects.equals(this.buyer, transaction.buyer) &&
        Objects.equals(this.createdAt, transaction.createdAt) &&
        Objects.equals(this.externalIdentifier, transaction.externalIdentifier) &&
        Objects.equals(this.updatedAt, transaction.updatedAt) &&
        Objects.equals(this.paymentService, transaction.paymentService) &&
        Objects.equals(this.environment, transaction.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, status, amount, capturedAmount, refundedAmount, currency, paymentMethod, buyer, createdAt, externalIdentifier, updatedAt, paymentService, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    capturedAmount: ").append(toIndentedString(capturedAmount)).append("\n");
    sb.append("    refundedAmount: ").append(toIndentedString(refundedAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    paymentService: ").append(toIndentedString(paymentService)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

