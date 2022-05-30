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
import com.gr4vy.api.model.PaymentServiceUpdateFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Request body for updating an active payment service.
 */
@ApiModel(description = "Request body for updating an active payment service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-30T12:22:53.235500Z[Etc/UTC]")
public class PaymentServiceUpdate {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<PaymentServiceUpdateFields> fields = null;

  public static final String SERIALIZED_NAME_ACCEPTED_COUNTRIES = "accepted_countries";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_COUNTRIES)
  private List<String> acceptedCountries = null;

  public static final String SERIALIZED_NAME_ACCEPTED_CURRENCIES = "accepted_currencies";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_CURRENCIES)
  private List<String> acceptedCurrencies = null;

  public static final String SERIALIZED_NAME_THREE_D_SECURE_ENABLED = "three_d_secure_enabled";
  @SerializedName(SERIALIZED_NAME_THREE_D_SECURE_ENABLED)
  private Boolean threeDSecureEnabled = false;

  public static final String SERIALIZED_NAME_ACQUIRER_BIN_VISA = "acquirer_bin_visa";
  @SerializedName(SERIALIZED_NAME_ACQUIRER_BIN_VISA)
  private String acquirerBinVisa;

  public static final String SERIALIZED_NAME_ACQUIRER_BIN_MASTERCARD = "acquirer_bin_mastercard";
  @SerializedName(SERIALIZED_NAME_ACQUIRER_BIN_MASTERCARD)
  private String acquirerBinMastercard;

  public static final String SERIALIZED_NAME_ACQUIRER_BIN_AMEX = "acquirer_bin_amex";
  @SerializedName(SERIALIZED_NAME_ACQUIRER_BIN_AMEX)
  private String acquirerBinAmex;

  public static final String SERIALIZED_NAME_ACQUIRER_BIN_DISCOVER = "acquirer_bin_discover";
  @SerializedName(SERIALIZED_NAME_ACQUIRER_BIN_DISCOVER)
  private String acquirerBinDiscover;

  public static final String SERIALIZED_NAME_ACQUIRER_MERCHANT_ID = "acquirer_merchant_id";
  @SerializedName(SERIALIZED_NAME_ACQUIRER_MERCHANT_ID)
  private String acquirerMerchantId;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_MERCHANT_COUNTRY_CODE = "merchant_country_code";
  @SerializedName(SERIALIZED_NAME_MERCHANT_COUNTRY_CODE)
  private String merchantCountryCode;

  public static final String SERIALIZED_NAME_MERCHANT_CATEGORY_CODE = "merchant_category_code";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CATEGORY_CODE)
  private String merchantCategoryCode;

  public static final String SERIALIZED_NAME_MERCHANT_URL = "merchant_url";
  @SerializedName(SERIALIZED_NAME_MERCHANT_URL)
  private String merchantUrl;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active = true;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private BigDecimal position;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_TOKENIZATION_ENABLED = "payment_method_tokenization_enabled";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_TOKENIZATION_ENABLED)
  private Boolean paymentMethodTokenizationEnabled = false;


  public PaymentServiceUpdate displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * A custom name for the payment service. This will be shown in the Admin UI.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Stripe (Main)", value = "A custom name for the payment service. This will be shown in the Admin UI.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public PaymentServiceUpdate fields(List<PaymentServiceUpdateFields> fields) {
    
    this.fields = fields;
    return this;
  }

  public PaymentServiceUpdate addFieldsItem(PaymentServiceUpdateFields fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<PaymentServiceUpdateFields>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * A list of fields, each containing a key-value pair for each field defined by the definition for this payment service e.g. for stripe-card &#x60;secret_key&#x60; is required and so must be sent within this field.
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of fields, each containing a key-value pair for each field defined by the definition for this payment service e.g. for stripe-card `secret_key` is required and so must be sent within this field.")

  public List<PaymentServiceUpdateFields> getFields() {
    return fields;
  }


  public void setFields(List<PaymentServiceUpdateFields> fields) {
    this.fields = fields;
  }


  public PaymentServiceUpdate acceptedCountries(List<String> acceptedCountries) {
    
    this.acceptedCountries = acceptedCountries;
    return this;
  }

  public PaymentServiceUpdate addAcceptedCountriesItem(String acceptedCountriesItem) {
    if (this.acceptedCountries == null) {
      this.acceptedCountries = new ArrayList<String>();
    }
    this.acceptedCountries.add(acceptedCountriesItem);
    return this;
  }

   /**
   * A list of countries that this payment service needs to support in ISO two-letter code format.
   * @return acceptedCountries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"US\",\"GB\",\"DE\"]", value = "A list of countries that this payment service needs to support in ISO two-letter code format.")

  public List<String> getAcceptedCountries() {
    return acceptedCountries;
  }


  public void setAcceptedCountries(List<String> acceptedCountries) {
    this.acceptedCountries = acceptedCountries;
  }


  public PaymentServiceUpdate acceptedCurrencies(List<String> acceptedCurrencies) {
    
    this.acceptedCurrencies = acceptedCurrencies;
    return this;
  }

  public PaymentServiceUpdate addAcceptedCurrenciesItem(String acceptedCurrenciesItem) {
    if (this.acceptedCurrencies == null) {
      this.acceptedCurrencies = new ArrayList<String>();
    }
    this.acceptedCurrencies.add(acceptedCurrenciesItem);
    return this;
  }

   /**
   * A list of currencies that this payment service needs to support in ISO 4217 three-letter code format.
   * @return acceptedCurrencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"EUR\",\"USD\",\"GBP\"]", value = "A list of currencies that this payment service needs to support in ISO 4217 three-letter code format.")

  public List<String> getAcceptedCurrencies() {
    return acceptedCurrencies;
  }


  public void setAcceptedCurrencies(List<String> acceptedCurrencies) {
    this.acceptedCurrencies = acceptedCurrencies;
  }


  public PaymentServiceUpdate threeDSecureEnabled(Boolean threeDSecureEnabled) {
    
    this.threeDSecureEnabled = threeDSecureEnabled;
    return this;
  }

   /**
   * Defines if 3-D Secure is enabled for the service (can only be enabled if the payment service definition supports the &#x60;three_d_secure_hosted&#x60; feature). This does not affect pass through 3-D Secure data.
   * @return threeDSecureEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Defines if 3-D Secure is enabled for the service (can only be enabled if the payment service definition supports the `three_d_secure_hosted` feature). This does not affect pass through 3-D Secure data.")

  public Boolean getThreeDSecureEnabled() {
    return threeDSecureEnabled;
  }


  public void setThreeDSecureEnabled(Boolean threeDSecureEnabled) {
    this.threeDSecureEnabled = threeDSecureEnabled;
  }


  public PaymentServiceUpdate acquirerBinVisa(String acquirerBinVisa) {
    
    this.acquirerBinVisa = acquirerBinVisa;
    return this;
  }

   /**
   * Acquiring institution identification code for VISA.
   * @return acquirerBinVisa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Acquiring institution identification code for VISA.")

  public String getAcquirerBinVisa() {
    return acquirerBinVisa;
  }


  public void setAcquirerBinVisa(String acquirerBinVisa) {
    this.acquirerBinVisa = acquirerBinVisa;
  }


  public PaymentServiceUpdate acquirerBinMastercard(String acquirerBinMastercard) {
    
    this.acquirerBinMastercard = acquirerBinMastercard;
    return this;
  }

   /**
   * Acquiring institution identification code for Mastercard.
   * @return acquirerBinMastercard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Acquiring institution identification code for Mastercard.")

  public String getAcquirerBinMastercard() {
    return acquirerBinMastercard;
  }


  public void setAcquirerBinMastercard(String acquirerBinMastercard) {
    this.acquirerBinMastercard = acquirerBinMastercard;
  }


  public PaymentServiceUpdate acquirerBinAmex(String acquirerBinAmex) {
    
    this.acquirerBinAmex = acquirerBinAmex;
    return this;
  }

   /**
   * Acquiring institution identification code for Amex.
   * @return acquirerBinAmex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Acquiring institution identification code for Amex.")

  public String getAcquirerBinAmex() {
    return acquirerBinAmex;
  }


  public void setAcquirerBinAmex(String acquirerBinAmex) {
    this.acquirerBinAmex = acquirerBinAmex;
  }


  public PaymentServiceUpdate acquirerBinDiscover(String acquirerBinDiscover) {
    
    this.acquirerBinDiscover = acquirerBinDiscover;
    return this;
  }

   /**
   * Acquiring institution identification code for Discover.
   * @return acquirerBinDiscover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Acquiring institution identification code for Discover.")

  public String getAcquirerBinDiscover() {
    return acquirerBinDiscover;
  }


  public void setAcquirerBinDiscover(String acquirerBinDiscover) {
    this.acquirerBinDiscover = acquirerBinDiscover;
  }


  public PaymentServiceUpdate acquirerMerchantId(String acquirerMerchantId) {
    
    this.acquirerMerchantId = acquirerMerchantId;
    return this;
  }

   /**
   * Merchant identifier used in authorisation requests (assigned by the acquirer).
   * @return acquirerMerchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant identifier used in authorisation requests (assigned by the acquirer).")

  public String getAcquirerMerchantId() {
    return acquirerMerchantId;
  }


  public void setAcquirerMerchantId(String acquirerMerchantId) {
    this.acquirerMerchantId = acquirerMerchantId;
  }


  public PaymentServiceUpdate merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Merchant name (assigned by the acquirer).
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gr4vy", value = "Merchant name (assigned by the acquirer).")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public PaymentServiceUpdate merchantCountryCode(String merchantCountryCode) {
    
    this.merchantCountryCode = merchantCountryCode;
    return this;
  }

   /**
   * ISO 3166-1 numeric three-digit country code.
   * @return merchantCountryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "840", value = "ISO 3166-1 numeric three-digit country code.")

  public String getMerchantCountryCode() {
    return merchantCountryCode;
  }


  public void setMerchantCountryCode(String merchantCountryCode) {
    this.merchantCountryCode = merchantCountryCode;
  }


  public PaymentServiceUpdate merchantCategoryCode(String merchantCategoryCode) {
    
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

   /**
   * Merchant category code that describes the business.
   * @return merchantCategoryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5045", value = "Merchant category code that describes the business.")

  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }


  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }


  public PaymentServiceUpdate merchantUrl(String merchantUrl) {
    
    this.merchantUrl = merchantUrl;
    return this;
  }

   /**
   * Fully qualified URL of 3-D Secure requestor website or customer care site.
   * @return merchantUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fully qualified URL of 3-D Secure requestor website or customer care site.")

  public String getMerchantUrl() {
    return merchantUrl;
  }


  public void setMerchantUrl(String merchantUrl) {
    this.merchantUrl = merchantUrl;
  }


  public PaymentServiceUpdate active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Defines if this service is currently active or not.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Defines if this service is currently active or not.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public PaymentServiceUpdate position(BigDecimal position) {
    
    this.position = position;
    return this;
  }

   /**
   * The numeric rank of a payment service. Payment services with a lower position value are processed first. When a payment services is inserted at a position, any payment services with the the same value or higher are shifted down a position accordingly. When left out, the payment service is inserted at the end of the list.
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The numeric rank of a payment service. Payment services with a lower position value are processed first. When a payment services is inserted at a position, any payment services with the the same value or higher are shifted down a position accordingly. When left out, the payment service is inserted at the end of the list.")

  public BigDecimal getPosition() {
    return position;
  }


  public void setPosition(BigDecimal position) {
    this.position = position;
  }


  public PaymentServiceUpdate paymentMethodTokenizationEnabled(Boolean paymentMethodTokenizationEnabled) {
    
    this.paymentMethodTokenizationEnabled = paymentMethodTokenizationEnabled;
    return this;
  }

   /**
   * Defines if tokenization is enabled for the service (can only be enabled if the payment service definition supports it).
   * @return paymentMethodTokenizationEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Defines if tokenization is enabled for the service (can only be enabled if the payment service definition supports it).")

  public Boolean getPaymentMethodTokenizationEnabled() {
    return paymentMethodTokenizationEnabled;
  }


  public void setPaymentMethodTokenizationEnabled(Boolean paymentMethodTokenizationEnabled) {
    this.paymentMethodTokenizationEnabled = paymentMethodTokenizationEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentServiceUpdate paymentServiceUpdate = (PaymentServiceUpdate) o;
    return Objects.equals(this.displayName, paymentServiceUpdate.displayName) &&
        Objects.equals(this.fields, paymentServiceUpdate.fields) &&
        Objects.equals(this.acceptedCountries, paymentServiceUpdate.acceptedCountries) &&
        Objects.equals(this.acceptedCurrencies, paymentServiceUpdate.acceptedCurrencies) &&
        Objects.equals(this.threeDSecureEnabled, paymentServiceUpdate.threeDSecureEnabled) &&
        Objects.equals(this.acquirerBinVisa, paymentServiceUpdate.acquirerBinVisa) &&
        Objects.equals(this.acquirerBinMastercard, paymentServiceUpdate.acquirerBinMastercard) &&
        Objects.equals(this.acquirerBinAmex, paymentServiceUpdate.acquirerBinAmex) &&
        Objects.equals(this.acquirerBinDiscover, paymentServiceUpdate.acquirerBinDiscover) &&
        Objects.equals(this.acquirerMerchantId, paymentServiceUpdate.acquirerMerchantId) &&
        Objects.equals(this.merchantName, paymentServiceUpdate.merchantName) &&
        Objects.equals(this.merchantCountryCode, paymentServiceUpdate.merchantCountryCode) &&
        Objects.equals(this.merchantCategoryCode, paymentServiceUpdate.merchantCategoryCode) &&
        Objects.equals(this.merchantUrl, paymentServiceUpdate.merchantUrl) &&
        Objects.equals(this.active, paymentServiceUpdate.active) &&
        Objects.equals(this.position, paymentServiceUpdate.position) &&
        Objects.equals(this.paymentMethodTokenizationEnabled, paymentServiceUpdate.paymentMethodTokenizationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, fields, acceptedCountries, acceptedCurrencies, threeDSecureEnabled, acquirerBinVisa, acquirerBinMastercard, acquirerBinAmex, acquirerBinDiscover, acquirerMerchantId, merchantName, merchantCountryCode, merchantCategoryCode, merchantUrl, active, position, paymentMethodTokenizationEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentServiceUpdate {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    acceptedCountries: ").append(toIndentedString(acceptedCountries)).append("\n");
    sb.append("    acceptedCurrencies: ").append(toIndentedString(acceptedCurrencies)).append("\n");
    sb.append("    threeDSecureEnabled: ").append(toIndentedString(threeDSecureEnabled)).append("\n");
    sb.append("    acquirerBinVisa: ").append(toIndentedString(acquirerBinVisa)).append("\n");
    sb.append("    acquirerBinMastercard: ").append(toIndentedString(acquirerBinMastercard)).append("\n");
    sb.append("    acquirerBinAmex: ").append(toIndentedString(acquirerBinAmex)).append("\n");
    sb.append("    acquirerBinDiscover: ").append(toIndentedString(acquirerBinDiscover)).append("\n");
    sb.append("    acquirerMerchantId: ").append(toIndentedString(acquirerMerchantId)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantCountryCode: ").append(toIndentedString(merchantCountryCode)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    merchantUrl: ").append(toIndentedString(merchantUrl)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    paymentMethodTokenizationEnabled: ").append(toIndentedString(paymentMethodTokenizationEnabled)).append("\n");
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

