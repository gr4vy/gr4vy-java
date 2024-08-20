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
 * A request to refund a transaction.
 */
@ApiModel(description = "A request to refund a transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionRefundRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  /**
   * The target type to refund for. This can be used to target a gift card to refund to instead of the main payment method.
   */
  @JsonAdapter(TargetTypeEnum.Adapter.class)
  public enum TargetTypeEnum {
    PAYMENT_METHOD("payment-method"),
    
    GIFT_CARD_REDEMPTION("gift-card-redemption");

    private String value;

    TargetTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TargetTypeEnum fromValue(String value) {
      for (TargetTypeEnum b : TargetTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TargetTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TargetTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TargetTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TargetTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private TargetTypeEnum targetType = TargetTypeEnum.PAYMENT_METHOD;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private UUID targetId;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;


  public TransactionRefundRequest amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount requested to refund.  If omitted, a full refund will be requested for the main payment method.  When set, the amount must be lower than or equal to the remaining balance in the associated transaction. Negative and zero-amount refunds are not supported.
   * minimum: 1
   * maximum: 99999999
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1299", value = "The amount requested to refund.  If omitted, a full refund will be requested for the main payment method.  When set, the amount must be lower than or equal to the remaining balance in the associated transaction. Negative and zero-amount refunds are not supported.")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public TransactionRefundRequest targetType(TargetTypeEnum targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * The target type to refund for. This can be used to target a gift card to refund to instead of the main payment method.
   * @return targetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gift-card-redemption", value = "The target type to refund for. This can be used to target a gift card to refund to instead of the main payment method.")

  public TargetTypeEnum getTargetType() {
    return targetType;
  }


  public void setTargetType(TargetTypeEnum targetType) {
    this.targetType = targetType;
  }


  public TransactionRefundRequest targetId(UUID targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * The optional ID of the instrument to refund for. This is only required when the &#x60;target_type&#x60; is set to &#x60;gift-card-redemption&#x60;.
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c23ea83f-1b1c-4584-a0e8-78ef8c041949", value = "The optional ID of the instrument to refund for. This is only required when the `target_type` is set to `gift-card-redemption`.")

  public UUID getTargetId() {
    return targetId;
  }


  public void setTargetId(UUID targetId) {
    this.targetId = targetId;
  }


  public TransactionRefundRequest reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * An optional reason to attach extra context to the refund request.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Refund due to user request", value = "An optional reason to attach extra context to the refund request.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRefundRequest transactionRefundRequest = (TransactionRefundRequest) o;
    return Objects.equals(this.amount, transactionRefundRequest.amount) &&
        Objects.equals(this.targetType, transactionRefundRequest.targetType) &&
        Objects.equals(this.targetId, transactionRefundRequest.targetId) &&
        Objects.equals(this.reason, transactionRefundRequest.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, targetType, targetId, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRefundRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

