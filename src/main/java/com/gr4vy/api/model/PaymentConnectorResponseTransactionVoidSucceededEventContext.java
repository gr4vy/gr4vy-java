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
import org.threeten.bp.OffsetDateTime;

/**
 * Additional context for this event.
 */
@ApiModel(description = "Additional context for this event.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T13:56:38.178267Z[Etc/UTC]")
public class PaymentConnectorResponseTransactionVoidSucceededEventContext {
  public static final String SERIALIZED_NAME_PAYMENT_SERVICE_ID = "payment_service_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SERVICE_ID)
  private UUID paymentServiceId;

  public static final String SERIALIZED_NAME_PAYMENT_SERVICE_DISPLAY_NAME = "payment_service_display_name";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SERVICE_DISPLAY_NAME)
  private String paymentServiceDisplayName;

  public static final String SERIALIZED_NAME_PAYMENT_SERVICE_DEFINITION_ID = "payment_service_definition_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SERVICE_DEFINITION_ID)
  private String paymentServiceDefinitionId;

  public static final String SERIALIZED_NAME_PAYMENT_SERVICE_TRANSACTION_ID = "payment_service_transaction_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SERVICE_TRANSACTION_ID)
  private String paymentServiceTransactionId;

  public static final String SERIALIZED_NAME_VOIDED_AT = "voided_at";
  @SerializedName(SERIALIZED_NAME_VOIDED_AT)
  private OffsetDateTime voidedAt;


  public PaymentConnectorResponseTransactionVoidSucceededEventContext paymentServiceId(UUID paymentServiceId) {
    
    this.paymentServiceId = paymentServiceId;
    return this;
  }

   /**
   * The unique ID of the payment service used.
   * @return paymentServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the payment service used.")

  public UUID getPaymentServiceId() {
    return paymentServiceId;
  }


  public void setPaymentServiceId(UUID paymentServiceId) {
    this.paymentServiceId = paymentServiceId;
  }


  public PaymentConnectorResponseTransactionVoidSucceededEventContext paymentServiceDisplayName(String paymentServiceDisplayName) {
    
    this.paymentServiceDisplayName = paymentServiceDisplayName;
    return this;
  }

   /**
   * The display name of the payment service used.
   * @return paymentServiceDisplayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the payment service used.")

  public String getPaymentServiceDisplayName() {
    return paymentServiceDisplayName;
  }


  public void setPaymentServiceDisplayName(String paymentServiceDisplayName) {
    this.paymentServiceDisplayName = paymentServiceDisplayName;
  }


  public PaymentConnectorResponseTransactionVoidSucceededEventContext paymentServiceDefinitionId(String paymentServiceDefinitionId) {
    
    this.paymentServiceDefinitionId = paymentServiceDefinitionId;
    return this;
  }

   /**
   * The payment service definition used.
   * @return paymentServiceDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payment service definition used.")

  public String getPaymentServiceDefinitionId() {
    return paymentServiceDefinitionId;
  }


  public void setPaymentServiceDefinitionId(String paymentServiceDefinitionId) {
    this.paymentServiceDefinitionId = paymentServiceDefinitionId;
  }


  public PaymentConnectorResponseTransactionVoidSucceededEventContext paymentServiceTransactionId(String paymentServiceTransactionId) {
    
    this.paymentServiceTransactionId = paymentServiceTransactionId;
    return this;
  }

   /**
   * The external ID of the transaction as set by the payment service.
   * @return paymentServiceTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "transaction-1234", value = "The external ID of the transaction as set by the payment service.")

  public String getPaymentServiceTransactionId() {
    return paymentServiceTransactionId;
  }


  public void setPaymentServiceTransactionId(String paymentServiceTransactionId) {
    this.paymentServiceTransactionId = paymentServiceTransactionId;
  }


  public PaymentConnectorResponseTransactionVoidSucceededEventContext voidedAt(OffsetDateTime voidedAt) {
    
    this.voidedAt = voidedAt;
    return this;
  }

   /**
   * The date and time when this transaction was voided.
   * @return voidedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-07-16T19:23Z", value = "The date and time when this transaction was voided.")

  public OffsetDateTime getVoidedAt() {
    return voidedAt;
  }


  public void setVoidedAt(OffsetDateTime voidedAt) {
    this.voidedAt = voidedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentConnectorResponseTransactionVoidSucceededEventContext paymentConnectorResponseTransactionVoidSucceededEventContext = (PaymentConnectorResponseTransactionVoidSucceededEventContext) o;
    return Objects.equals(this.paymentServiceId, paymentConnectorResponseTransactionVoidSucceededEventContext.paymentServiceId) &&
        Objects.equals(this.paymentServiceDisplayName, paymentConnectorResponseTransactionVoidSucceededEventContext.paymentServiceDisplayName) &&
        Objects.equals(this.paymentServiceDefinitionId, paymentConnectorResponseTransactionVoidSucceededEventContext.paymentServiceDefinitionId) &&
        Objects.equals(this.paymentServiceTransactionId, paymentConnectorResponseTransactionVoidSucceededEventContext.paymentServiceTransactionId) &&
        Objects.equals(this.voidedAt, paymentConnectorResponseTransactionVoidSucceededEventContext.voidedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentServiceId, paymentServiceDisplayName, paymentServiceDefinitionId, paymentServiceTransactionId, voidedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentConnectorResponseTransactionVoidSucceededEventContext {\n");
    sb.append("    paymentServiceId: ").append(toIndentedString(paymentServiceId)).append("\n");
    sb.append("    paymentServiceDisplayName: ").append(toIndentedString(paymentServiceDisplayName)).append("\n");
    sb.append("    paymentServiceDefinitionId: ").append(toIndentedString(paymentServiceDefinitionId)).append("\n");
    sb.append("    paymentServiceTransactionId: ").append(toIndentedString(paymentServiceTransactionId)).append("\n");
    sb.append("    voidedAt: ").append(toIndentedString(voidedAt)).append("\n");
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
