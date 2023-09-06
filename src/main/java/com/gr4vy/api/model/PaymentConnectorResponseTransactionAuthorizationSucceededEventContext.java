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
 * Additional context for this event.
 */
@ApiModel(description = "Additional context for this event.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-06T16:38:13.632050Z[Etc/UTC]")
public class PaymentConnectorResponseTransactionAuthorizationSucceededEventContext {
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

  /**
   * The new status code for the transaction. This is always set to &#x60;authorization_succeeded&#x60;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    AUTHORIZATION_SUCCEEDED("authorization_succeeded");

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
   * The type of instrument used for this transaction.
   */
  @JsonAdapter(InstrumentTypeEnum.Adapter.class)
  public enum InstrumentTypeEnum {
    PAN("pan"),
    
    CARD_TOKEN("card_token"),
    
    REDIRECT("redirect"),
    
    REDIRECT_TOKEN("redirect_token"),
    
    GOOGLEPAY("googlepay"),
    
    APPLEPAY("applepay"),
    
    NETWORK_TOKEN("network_token");

    private String value;

    InstrumentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InstrumentTypeEnum fromValue(String value) {
      for (InstrumentTypeEnum b : InstrumentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InstrumentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstrumentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InstrumentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InstrumentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INSTRUMENT_TYPE = "instrument_type";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_TYPE)
  private InstrumentTypeEnum instrumentType;

  public static final String SERIALIZED_NAME_RETRY_RULE = "retry_rule";
  @SerializedName(SERIALIZED_NAME_RETRY_RULE)
  private String retryRule;

  public static final String SERIALIZED_NAME_RAW_RESPONSE_CODE = "raw_response_code";
  @SerializedName(SERIALIZED_NAME_RAW_RESPONSE_CODE)
  private String rawResponseCode;

  public static final String SERIALIZED_NAME_RAW_RESPONSE_DESCRIPTION = "raw_response_description";
  @SerializedName(SERIALIZED_NAME_RAW_RESPONSE_DESCRIPTION)
  private String rawResponseDescription;

  /**
   * The response code received from the payment service for the Address Verification Check (AVS). This code is mapped to a standardized Gr4vy AVS response code.  - &#x60;no_match&#x60; - neither address or postal code match - &#x60;match&#x60; - both address and postal code match - &#x60;partial_match_address&#x60; - address matches but postal code does not - &#x60;partial_match_postcode&#x60; - postal code matches but address does not - &#x60;unavailable &#x60; - AVS is unavailable for card/country  The value of this field can be &#x60;null&#x60; if the payment service did not provide a response.
   */
  @JsonAdapter(AvsResponseCodeEnum.Adapter.class)
  public enum AvsResponseCodeEnum {
    NO_MATCH("no_match"),
    
    MATCH("match"),
    
    PARTIAL_MATCH_ADDRESS("partial_match_address"),
    
    PARTIAL_MATCH_POSTCODE("partial_match_postcode"),
    
    UNAVAILABLE("unavailable");

    private String value;

    AvsResponseCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AvsResponseCodeEnum fromValue(String value) {
      for (AvsResponseCodeEnum b : AvsResponseCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AvsResponseCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AvsResponseCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AvsResponseCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AvsResponseCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AVS_RESPONSE_CODE = "avs_response_code";
  @SerializedName(SERIALIZED_NAME_AVS_RESPONSE_CODE)
  private AvsResponseCodeEnum avsResponseCode;

  /**
   * The response code received from the payment service for the Card Verification Value (CVV). This code is mapped to a standardized Gr4vy CVV response code.  - &#x60;no_match&#x60; - the CVV does not match the expected value - &#x60;match&#x60; - the CVV matches the expected value - &#x60;unavailable &#x60; - CVV check unavailable for card our country - &#x60;not_provided &#x60; - CVV not provided  The value of this field can be &#x60;null&#x60; if the payment service did not provide a response.
   */
  @JsonAdapter(CvvResponseCodeEnum.Adapter.class)
  public enum CvvResponseCodeEnum {
    NO_MATCH("no_match"),
    
    MATCH("match"),
    
    UNAVAILABLE("unavailable");

    private String value;

    CvvResponseCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CvvResponseCodeEnum fromValue(String value) {
      for (CvvResponseCodeEnum b : CvvResponseCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CvvResponseCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CvvResponseCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CvvResponseCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CvvResponseCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CVV_RESPONSE_CODE = "cvv_response_code";
  @SerializedName(SERIALIZED_NAME_CVV_RESPONSE_CODE)
  private CvvResponseCodeEnum cvvResponseCode;


  public PaymentConnectorResponseTransactionAuthorizationSucceededEventContext paymentServiceId(UUID paymentServiceId) {
    
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


  public PaymentConnectorResponseTransactionAuthorizationSucceededEventContext paymentServiceDisplayName(String paymentServiceDisplayName) {
    
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


  public PaymentConnectorResponseTransactionAuthorizationSucceededEventContext paymentServiceDefinitionId(String paymentServiceDefinitionId) {
    
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


  public PaymentConnectorResponseTransactionAuthorizationSucceededEventContext paymentServiceTransactionId(String paymentServiceTransactionId) {
    
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


  public PaymentConnectorResponseTransactionAuthorizationSucceededEventContext status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The new status code for the transaction. This is always set to &#x60;authorization_succeeded&#x60;.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "authorization_succeeded", value = "The new status code for the transaction. This is always set to `authorization_succeeded`.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public PaymentConnectorResponseTransactionAuthorizationSucceededEventContext instrumentType(InstrumentTypeEnum instrumentType) {
    
    this.instrumentType = instrumentType;
    return this;
  }

   /**
   * The type of instrument used for this transaction.
   * @return instrumentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pan", value = "The type of instrument used for this transaction.")

  public InstrumentTypeEnum getInstrumentType() {
    return instrumentType;
  }


  public void setInstrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
  }


  public PaymentConnectorResponseTransactionAuthorizationSucceededEventContext retryRule(String retryRule) {
    
    this.retryRule = retryRule;
    return this;
  }

   /**
   * This will always be &#x60;null&#x60; because the transaction succeeded.
   * @return retryRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This will always be `null` because the transaction succeeded.")

  public String getRetryRule() {
    return retryRule;
  }


  public void setRetryRule(String retryRule) {
    this.retryRule = retryRule;
  }


  public PaymentConnectorResponseTransactionAuthorizationSucceededEventContext rawResponseCode(String rawResponseCode) {
    
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


  public PaymentConnectorResponseTransactionAuthorizationSucceededEventContext rawResponseDescription(String rawResponseDescription) {
    
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


  public PaymentConnectorResponseTransactionAuthorizationSucceededEventContext avsResponseCode(AvsResponseCodeEnum avsResponseCode) {
    
    this.avsResponseCode = avsResponseCode;
    return this;
  }

   /**
   * The response code received from the payment service for the Address Verification Check (AVS). This code is mapped to a standardized Gr4vy AVS response code.  - &#x60;no_match&#x60; - neither address or postal code match - &#x60;match&#x60; - both address and postal code match - &#x60;partial_match_address&#x60; - address matches but postal code does not - &#x60;partial_match_postcode&#x60; - postal code matches but address does not - &#x60;unavailable &#x60; - AVS is unavailable for card/country  The value of this field can be &#x60;null&#x60; if the payment service did not provide a response.
   * @return avsResponseCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "partial_match_address", value = "The response code received from the payment service for the Address Verification Check (AVS). This code is mapped to a standardized Gr4vy AVS response code.  - `no_match` - neither address or postal code match - `match` - both address and postal code match - `partial_match_address` - address matches but postal code does not - `partial_match_postcode` - postal code matches but address does not - `unavailable ` - AVS is unavailable for card/country  The value of this field can be `null` if the payment service did not provide a response.")

  public AvsResponseCodeEnum getAvsResponseCode() {
    return avsResponseCode;
  }


  public void setAvsResponseCode(AvsResponseCodeEnum avsResponseCode) {
    this.avsResponseCode = avsResponseCode;
  }


  public PaymentConnectorResponseTransactionAuthorizationSucceededEventContext cvvResponseCode(CvvResponseCodeEnum cvvResponseCode) {
    
    this.cvvResponseCode = cvvResponseCode;
    return this;
  }

   /**
   * The response code received from the payment service for the Card Verification Value (CVV). This code is mapped to a standardized Gr4vy CVV response code.  - &#x60;no_match&#x60; - the CVV does not match the expected value - &#x60;match&#x60; - the CVV matches the expected value - &#x60;unavailable &#x60; - CVV check unavailable for card our country - &#x60;not_provided &#x60; - CVV not provided  The value of this field can be &#x60;null&#x60; if the payment service did not provide a response.
   * @return cvvResponseCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "match", value = "The response code received from the payment service for the Card Verification Value (CVV). This code is mapped to a standardized Gr4vy CVV response code.  - `no_match` - the CVV does not match the expected value - `match` - the CVV matches the expected value - `unavailable ` - CVV check unavailable for card our country - `not_provided ` - CVV not provided  The value of this field can be `null` if the payment service did not provide a response.")

  public CvvResponseCodeEnum getCvvResponseCode() {
    return cvvResponseCode;
  }


  public void setCvvResponseCode(CvvResponseCodeEnum cvvResponseCode) {
    this.cvvResponseCode = cvvResponseCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentConnectorResponseTransactionAuthorizationSucceededEventContext paymentConnectorResponseTransactionAuthorizationSucceededEventContext = (PaymentConnectorResponseTransactionAuthorizationSucceededEventContext) o;
    return Objects.equals(this.paymentServiceId, paymentConnectorResponseTransactionAuthorizationSucceededEventContext.paymentServiceId) &&
        Objects.equals(this.paymentServiceDisplayName, paymentConnectorResponseTransactionAuthorizationSucceededEventContext.paymentServiceDisplayName) &&
        Objects.equals(this.paymentServiceDefinitionId, paymentConnectorResponseTransactionAuthorizationSucceededEventContext.paymentServiceDefinitionId) &&
        Objects.equals(this.paymentServiceTransactionId, paymentConnectorResponseTransactionAuthorizationSucceededEventContext.paymentServiceTransactionId) &&
        Objects.equals(this.status, paymentConnectorResponseTransactionAuthorizationSucceededEventContext.status) &&
        Objects.equals(this.instrumentType, paymentConnectorResponseTransactionAuthorizationSucceededEventContext.instrumentType) &&
        Objects.equals(this.retryRule, paymentConnectorResponseTransactionAuthorizationSucceededEventContext.retryRule) &&
        Objects.equals(this.rawResponseCode, paymentConnectorResponseTransactionAuthorizationSucceededEventContext.rawResponseCode) &&
        Objects.equals(this.rawResponseDescription, paymentConnectorResponseTransactionAuthorizationSucceededEventContext.rawResponseDescription) &&
        Objects.equals(this.avsResponseCode, paymentConnectorResponseTransactionAuthorizationSucceededEventContext.avsResponseCode) &&
        Objects.equals(this.cvvResponseCode, paymentConnectorResponseTransactionAuthorizationSucceededEventContext.cvvResponseCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentServiceId, paymentServiceDisplayName, paymentServiceDefinitionId, paymentServiceTransactionId, status, instrumentType, retryRule, rawResponseCode, rawResponseDescription, avsResponseCode, cvvResponseCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentConnectorResponseTransactionAuthorizationSucceededEventContext {\n");
    sb.append("    paymentServiceId: ").append(toIndentedString(paymentServiceId)).append("\n");
    sb.append("    paymentServiceDisplayName: ").append(toIndentedString(paymentServiceDisplayName)).append("\n");
    sb.append("    paymentServiceDefinitionId: ").append(toIndentedString(paymentServiceDefinitionId)).append("\n");
    sb.append("    paymentServiceTransactionId: ").append(toIndentedString(paymentServiceTransactionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    retryRule: ").append(toIndentedString(retryRule)).append("\n");
    sb.append("    rawResponseCode: ").append(toIndentedString(rawResponseCode)).append("\n");
    sb.append("    rawResponseDescription: ").append(toIndentedString(rawResponseDescription)).append("\n");
    sb.append("    avsResponseCode: ").append(toIndentedString(avsResponseCode)).append("\n");
    sb.append("    cvvResponseCode: ").append(toIndentedString(cvvResponseCode)).append("\n");
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

