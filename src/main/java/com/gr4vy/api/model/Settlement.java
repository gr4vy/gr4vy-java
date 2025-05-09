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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * A settlement record.
 */
@ApiModel(description = "A settlement record.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Settlement {
  /**
   * The type of this resource. Is always &#x60;settlement&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SETTLEMENT("settlement");

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

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT_ID = "merchant_account_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT_ID)
  private String merchantAccountId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_POSTED_AT = "posted_at";
  @SerializedName(SERIALIZED_NAME_POSTED_AT)
  private String postedAt;

  public static final String SERIALIZED_NAME_INGESTED_AT = "ingested_at";
  @SerializedName(SERIALIZED_NAME_INGESTED_AT)
  private String ingestedAt;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_EXCHANGE_RATE = "exchange_rate";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE)
  private BigDecimal exchangeRate;

  public static final String SERIALIZED_NAME_COMMISSION = "commission";
  @SerializedName(SERIALIZED_NAME_COMMISSION)
  private Integer commission;

  public static final String SERIALIZED_NAME_INTERCHANGE = "interchange";
  @SerializedName(SERIALIZED_NAME_INTERCHANGE)
  private Integer interchange;

  public static final String SERIALIZED_NAME_MARKUP = "markup";
  @SerializedName(SERIALIZED_NAME_MARKUP)
  private Integer markup;

  public static final String SERIALIZED_NAME_SCHEME_FEE = "scheme_fee";
  @SerializedName(SERIALIZED_NAME_SCHEME_FEE)
  private Integer schemeFee;

  public static final String SERIALIZED_NAME_PAYMENT_SERVICE_REPORT_ID = "payment_service_report_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SERVICE_REPORT_ID)
  private UUID paymentServiceReportId;

  public static final String SERIALIZED_NAME_PAYMENT_SERVICE_REPORT_FILE_IDS = "payment_service_report_file_ids";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SERVICE_REPORT_FILE_IDS)
  private List<UUID> paymentServiceReportFileIds = null;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private UUID transactionId;


  public Settlement type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of this resource. Is always &#x60;settlement&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "settlement", value = "The type of this resource. Is always `settlement`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Settlement id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for this settlement.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fe26475d-ec3e-4884-9553-f7356683f7f9", value = "The unique identifier for this settlement.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Settlement merchantAccountId(String merchantAccountId) {
    
    this.merchantAccountId = merchantAccountId;
    return this;
  }

   /**
   * The ID of the merchant account to which this settlement belongs to.
   * @return merchantAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "default", value = "The ID of the merchant account to which this settlement belongs to.")

  public String getMerchantAccountId() {
    return merchantAccountId;
  }


  public void setMerchantAccountId(String merchantAccountId) {
    this.merchantAccountId = merchantAccountId;
  }


  public Settlement createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when this settlement was created in our system.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2024-04-01T19:23Z", value = "The date and time when this settlement was created in our system.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Settlement updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time when this settlement was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2024-04-01T19:23Z", value = "The date and time when this settlement was last updated.")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Settlement postedAt(String postedAt) {
    
    this.postedAt = postedAt;
    return this;
  }

   /**
   * The date and time when this settlement occurred.
   * @return postedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2024-03-30T10:25Z", value = "The date and time when this settlement occurred.")

  public String getPostedAt() {
    return postedAt;
  }


  public void setPostedAt(String postedAt) {
    this.postedAt = postedAt;
  }


  public Settlement ingestedAt(String ingestedAt) {
    
    this.ingestedAt = ingestedAt;
    return this;
  }

   /**
   * The date and time when information about this settlement was ingested into our system.
   * @return ingestedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-04-01T01:01Z", value = "The date and time when information about this settlement was ingested into our system.")

  public String getIngestedAt() {
    return ingestedAt;
  }


  public void setIngestedAt(String ingestedAt) {
    this.ingestedAt = ingestedAt;
  }


  public Settlement currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency code of this settlement in ISO 4217 three-letter code format.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The currency code of this settlement in ISO 4217 three-letter code format.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Settlement amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The net amount of this settlement.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1299", value = "The net amount of this settlement.")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public Settlement exchangeRate(BigDecimal exchangeRate) {
    
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * The exchange rate used to convert amounts from the processing currency to the settlement currency.
   * @return exchangeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.95", value = "The exchange rate used to convert amounts from the processing currency to the settlement currency.")

  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }


  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }


  public Settlement commission(Integer commission) {
    
    this.commission = commission;
    return this;
  }

   /**
   * The total commission of this settlement, expressed in &#x60;currency&#x60;.
   * @return commission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "The total commission of this settlement, expressed in `currency`.")

  public Integer getCommission() {
    return commission;
  }


  public void setCommission(Integer commission) {
    this.commission = commission;
  }


  public Settlement interchange(Integer interchange) {
    
    this.interchange = interchange;
    return this;
  }

   /**
   * The interchange fee of this settlement, expressed in &#x60;currency&#x60;.
   * @return interchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "The interchange fee of this settlement, expressed in `currency`.")

  public Integer getInterchange() {
    return interchange;
  }


  public void setInterchange(Integer interchange) {
    this.interchange = interchange;
  }


  public Settlement markup(Integer markup) {
    
    this.markup = markup;
    return this;
  }

   /**
   * The markup of this settlement by the acquirer, expressed in &#x60;currency&#x60;.
   * @return markup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "The markup of this settlement by the acquirer, expressed in `currency`.")

  public Integer getMarkup() {
    return markup;
  }


  public void setMarkup(Integer markup) {
    this.markup = markup;
  }


  public Settlement schemeFee(Integer schemeFee) {
    
    this.schemeFee = schemeFee;
    return this;
  }

   /**
   * The scheme fee of this settlement, expressed in &#x60;currency&#x60;.
   * @return schemeFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "The scheme fee of this settlement, expressed in `currency`.")

  public Integer getSchemeFee() {
    return schemeFee;
  }


  public void setSchemeFee(Integer schemeFee) {
    this.schemeFee = schemeFee;
  }


  public Settlement paymentServiceReportId(UUID paymentServiceReportId) {
    
    this.paymentServiceReportId = paymentServiceReportId;
    return this;
  }

   /**
   * The ID of the payment service report containing this settlement.
   * @return paymentServiceReportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8724fd24-5489-4a5d-90fd-0604df7d3b83", value = "The ID of the payment service report containing this settlement.")

  public UUID getPaymentServiceReportId() {
    return paymentServiceReportId;
  }


  public void setPaymentServiceReportId(UUID paymentServiceReportId) {
    this.paymentServiceReportId = paymentServiceReportId;
  }


  public Settlement paymentServiceReportFileIds(List<UUID> paymentServiceReportFileIds) {
    
    this.paymentServiceReportFileIds = paymentServiceReportFileIds;
    return this;
  }

  public Settlement addPaymentServiceReportFileIdsItem(UUID paymentServiceReportFileIdsItem) {
    if (this.paymentServiceReportFileIds == null) {
      this.paymentServiceReportFileIds = new ArrayList<UUID>();
    }
    this.paymentServiceReportFileIds.add(paymentServiceReportFileIdsItem);
    return this;
  }

   /**
   * The list of payment service report file IDs that make up the payment service report containing this settlement.
   * @return paymentServiceReportFileIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"0302e601-d2c3-42b2-9825-9457145331ae\",\"7deec061-71a5-435f-beae-40f35820ca67\"]", value = "The list of payment service report file IDs that make up the payment service report containing this settlement.")

  public List<UUID> getPaymentServiceReportFileIds() {
    return paymentServiceReportFileIds;
  }


  public void setPaymentServiceReportFileIds(List<UUID> paymentServiceReportFileIds) {
    this.paymentServiceReportFileIds = paymentServiceReportFileIds;
  }


  public Settlement transactionId(UUID transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The ID of the transaction associated with this settlement.
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fe26475d-ec3e-4884-9553-f7356683f7f9", value = "The ID of the transaction associated with this settlement.")

  public UUID getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settlement settlement = (Settlement) o;
    return Objects.equals(this.type, settlement.type) &&
        Objects.equals(this.id, settlement.id) &&
        Objects.equals(this.merchantAccountId, settlement.merchantAccountId) &&
        Objects.equals(this.createdAt, settlement.createdAt) &&
        Objects.equals(this.updatedAt, settlement.updatedAt) &&
        Objects.equals(this.postedAt, settlement.postedAt) &&
        Objects.equals(this.ingestedAt, settlement.ingestedAt) &&
        Objects.equals(this.currency, settlement.currency) &&
        Objects.equals(this.amount, settlement.amount) &&
        Objects.equals(this.exchangeRate, settlement.exchangeRate) &&
        Objects.equals(this.commission, settlement.commission) &&
        Objects.equals(this.interchange, settlement.interchange) &&
        Objects.equals(this.markup, settlement.markup) &&
        Objects.equals(this.schemeFee, settlement.schemeFee) &&
        Objects.equals(this.paymentServiceReportId, settlement.paymentServiceReportId) &&
        Objects.equals(this.paymentServiceReportFileIds, settlement.paymentServiceReportFileIds) &&
        Objects.equals(this.transactionId, settlement.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, merchantAccountId, createdAt, updatedAt, postedAt, ingestedAt, currency, amount, exchangeRate, commission, interchange, markup, schemeFee, paymentServiceReportId, paymentServiceReportFileIds, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settlement {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchantAccountId: ").append(toIndentedString(merchantAccountId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    postedAt: ").append(toIndentedString(postedAt)).append("\n");
    sb.append("    ingestedAt: ").append(toIndentedString(ingestedAt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    interchange: ").append(toIndentedString(interchange)).append("\n");
    sb.append("    markup: ").append(toIndentedString(markup)).append("\n");
    sb.append("    schemeFee: ").append(toIndentedString(schemeFee)).append("\n");
    sb.append("    paymentServiceReportId: ").append(toIndentedString(paymentServiceReportId)).append("\n");
    sb.append("    paymentServiceReportFileIds: ").append(toIndentedString(paymentServiceReportFileIds)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

