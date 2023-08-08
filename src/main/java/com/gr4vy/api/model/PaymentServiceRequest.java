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
import com.gr4vy.api.model.MerchantProfile;
import com.gr4vy.api.model.PaymentServiceRequestFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Request body for activating a payment service.
 */
@ApiModel(description = "Request body for activating a payment service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T13:56:38.178267Z[Etc/UTC]")
public class PaymentServiceRequest {
  public static final String SERIALIZED_NAME_PAYMENT_SERVICE_DEFINITION_ID = "payment_service_definition_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SERVICE_DEFINITION_ID)
  private String paymentServiceDefinitionId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<PaymentServiceRequestFields> fields = new ArrayList<PaymentServiceRequestFields>();

  public static final String SERIALIZED_NAME_ACCEPTED_COUNTRIES = "accepted_countries";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_COUNTRIES)
  private List<String> acceptedCountries = new ArrayList<String>();

  public static final String SERIALIZED_NAME_ACCEPTED_CURRENCIES = "accepted_currencies";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_CURRENCIES)
  private List<String> acceptedCurrencies = new ArrayList<String>();

  public static final String SERIALIZED_NAME_THREE_D_SECURE_ENABLED = "three_d_secure_enabled";
  @SerializedName(SERIALIZED_NAME_THREE_D_SECURE_ENABLED)
  private Boolean threeDSecureEnabled = false;

  public static final String SERIALIZED_NAME_MERCHANT_PROFILE = "merchant_profile";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PROFILE)
  private MerchantProfile merchantProfile;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active = true;

  public static final String SERIALIZED_NAME_OPEN_LOOP = "open_loop";
  @SerializedName(SERIALIZED_NAME_OPEN_LOOP)
  private Boolean openLoop;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_TOKENIZATION_ENABLED = "payment_method_tokenization_enabled";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_TOKENIZATION_ENABLED)
  private Boolean paymentMethodTokenizationEnabled = false;

  public static final String SERIALIZED_NAME_NETWORK_TOKENS_ENABLED = "network_tokens_enabled";
  @SerializedName(SERIALIZED_NAME_NETWORK_TOKENS_ENABLED)
  private Boolean networkTokensEnabled;


  public PaymentServiceRequest paymentServiceDefinitionId(String paymentServiceDefinitionId) {
    
    this.paymentServiceDefinitionId = paymentServiceDefinitionId;
    return this;
  }

   /**
   * The ID of the payment service to use.
   * @return paymentServiceDefinitionId
  **/
  @ApiModelProperty(example = "stripe-card", required = true, value = "The ID of the payment service to use.")

  public String getPaymentServiceDefinitionId() {
    return paymentServiceDefinitionId;
  }


  public void setPaymentServiceDefinitionId(String paymentServiceDefinitionId) {
    this.paymentServiceDefinitionId = paymentServiceDefinitionId;
  }


  public PaymentServiceRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * A custom name for the payment service. This will be shown in the Admin UI.
   * @return displayName
  **/
  @ApiModelProperty(example = "Stripe (Main)", required = true, value = "A custom name for the payment service. This will be shown in the Admin UI.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public PaymentServiceRequest fields(List<PaymentServiceRequestFields> fields) {
    
    this.fields = fields;
    return this;
  }

  public PaymentServiceRequest addFieldsItem(PaymentServiceRequestFields fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * A list of fields, each containing a key-value pair for each field defined by the definition for this payment service e.g. for stripe-card &#x60;secret_key&#x60; is required and so must be sent within this field.
   * @return fields
  **/
  @ApiModelProperty(required = true, value = "A list of fields, each containing a key-value pair for each field defined by the definition for this payment service e.g. for stripe-card `secret_key` is required and so must be sent within this field.")

  public List<PaymentServiceRequestFields> getFields() {
    return fields;
  }


  public void setFields(List<PaymentServiceRequestFields> fields) {
    this.fields = fields;
  }


  public PaymentServiceRequest acceptedCountries(List<String> acceptedCountries) {
    
    this.acceptedCountries = acceptedCountries;
    return this;
  }

  public PaymentServiceRequest addAcceptedCountriesItem(String acceptedCountriesItem) {
    this.acceptedCountries.add(acceptedCountriesItem);
    return this;
  }

   /**
   * A list of countries that this payment service needs to support in ISO two-letter code format.
   * @return acceptedCountries
  **/
  @ApiModelProperty(example = "[\"US\",\"GB\",\"DE\"]", required = true, value = "A list of countries that this payment service needs to support in ISO two-letter code format.")

  public List<String> getAcceptedCountries() {
    return acceptedCountries;
  }


  public void setAcceptedCountries(List<String> acceptedCountries) {
    this.acceptedCountries = acceptedCountries;
  }


  public PaymentServiceRequest acceptedCurrencies(List<String> acceptedCurrencies) {
    
    this.acceptedCurrencies = acceptedCurrencies;
    return this;
  }

  public PaymentServiceRequest addAcceptedCurrenciesItem(String acceptedCurrenciesItem) {
    this.acceptedCurrencies.add(acceptedCurrenciesItem);
    return this;
  }

   /**
   * A list of currencies that this payment service needs to support in ISO 4217 three-letter code format.
   * @return acceptedCurrencies
  **/
  @ApiModelProperty(example = "[\"EUR\",\"USD\",\"GBP\"]", required = true, value = "A list of currencies that this payment service needs to support in ISO 4217 three-letter code format.")

  public List<String> getAcceptedCurrencies() {
    return acceptedCurrencies;
  }


  public void setAcceptedCurrencies(List<String> acceptedCurrencies) {
    this.acceptedCurrencies = acceptedCurrencies;
  }


  public PaymentServiceRequest threeDSecureEnabled(Boolean threeDSecureEnabled) {
    
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


  public PaymentServiceRequest merchantProfile(MerchantProfile merchantProfile) {
    
    this.merchantProfile = merchantProfile;
    return this;
  }

   /**
   * Configuration for each supported card scheme.
   * @return merchantProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Configuration for each supported card scheme.")

  public MerchantProfile getMerchantProfile() {
    return merchantProfile;
  }


  public void setMerchantProfile(MerchantProfile merchantProfile) {
    this.merchantProfile = merchantProfile;
  }


  public PaymentServiceRequest active(Boolean active) {
    
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


  public PaymentServiceRequest openLoop(Boolean openLoop) {
    
    this.openLoop = openLoop;
    return this;
  }

   /**
   * Defines if the service works as an open-loop service. This feature can only be enabled if the PSP is set up to accept previous scheme transaction IDs.  If this value is not provided or is set to &#x60;null&#x60;, it will be set to the value of &#x60;open_loop&#x60; in the payment service definition.  If &#x60;open_loop_toggle&#x60; is &#x60;false&#x60; in the payment service definition, &#x60;open_loop&#x60; should either not be provided or set to &#x60;null&#x60;, or it will fail with a validation error.
   * @return openLoop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Defines if the service works as an open-loop service. This feature can only be enabled if the PSP is set up to accept previous scheme transaction IDs.  If this value is not provided or is set to `null`, it will be set to the value of `open_loop` in the payment service definition.  If `open_loop_toggle` is `false` in the payment service definition, `open_loop` should either not be provided or set to `null`, or it will fail with a validation error.")

  public Boolean getOpenLoop() {
    return openLoop;
  }


  public void setOpenLoop(Boolean openLoop) {
    this.openLoop = openLoop;
  }


  public PaymentServiceRequest paymentMethodTokenizationEnabled(Boolean paymentMethodTokenizationEnabled) {
    
    this.paymentMethodTokenizationEnabled = paymentMethodTokenizationEnabled;
    return this;
  }

   /**
   * Defines if tokenization is enabled for the service. This feature can only be enabled if the payment service is NOT set as &#x60;open_loop&#x60; and the PSP is set up to tokenize.
   * @return paymentMethodTokenizationEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Defines if tokenization is enabled for the service. This feature can only be enabled if the payment service is NOT set as `open_loop` and the PSP is set up to tokenize.")

  public Boolean getPaymentMethodTokenizationEnabled() {
    return paymentMethodTokenizationEnabled;
  }


  public void setPaymentMethodTokenizationEnabled(Boolean paymentMethodTokenizationEnabled) {
    this.paymentMethodTokenizationEnabled = paymentMethodTokenizationEnabled;
  }


  public PaymentServiceRequest networkTokensEnabled(Boolean networkTokensEnabled) {
    
    this.networkTokensEnabled = networkTokensEnabled;
    return this;
  }

   /**
   * Defines if network tokens are enabled for the service. This feature can only be enabled if the payment service is set as &#x60;open_loop&#x60; and the PSP is set up to accept network tokens.  If this value is not provided or is set to &#x60;null&#x60;, it will be set to the value of &#x60;network_tokens_default&#x60; in the payment service definition.  If &#x60;network_tokens_toggle&#x60; is &#x60;false&#x60; in the payment service definition, &#x60;network_tokens_enabled&#x60; should either not be provided or set to &#x60;null&#x60;, or it will fail with a validation error.
   * @return networkTokensEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Defines if network tokens are enabled for the service. This feature can only be enabled if the payment service is set as `open_loop` and the PSP is set up to accept network tokens.  If this value is not provided or is set to `null`, it will be set to the value of `network_tokens_default` in the payment service definition.  If `network_tokens_toggle` is `false` in the payment service definition, `network_tokens_enabled` should either not be provided or set to `null`, or it will fail with a validation error.")

  public Boolean getNetworkTokensEnabled() {
    return networkTokensEnabled;
  }


  public void setNetworkTokensEnabled(Boolean networkTokensEnabled) {
    this.networkTokensEnabled = networkTokensEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentServiceRequest paymentServiceRequest = (PaymentServiceRequest) o;
    return Objects.equals(this.paymentServiceDefinitionId, paymentServiceRequest.paymentServiceDefinitionId) &&
        Objects.equals(this.displayName, paymentServiceRequest.displayName) &&
        Objects.equals(this.fields, paymentServiceRequest.fields) &&
        Objects.equals(this.acceptedCountries, paymentServiceRequest.acceptedCountries) &&
        Objects.equals(this.acceptedCurrencies, paymentServiceRequest.acceptedCurrencies) &&
        Objects.equals(this.threeDSecureEnabled, paymentServiceRequest.threeDSecureEnabled) &&
        Objects.equals(this.merchantProfile, paymentServiceRequest.merchantProfile) &&
        Objects.equals(this.active, paymentServiceRequest.active) &&
        Objects.equals(this.openLoop, paymentServiceRequest.openLoop) &&
        Objects.equals(this.paymentMethodTokenizationEnabled, paymentServiceRequest.paymentMethodTokenizationEnabled) &&
        Objects.equals(this.networkTokensEnabled, paymentServiceRequest.networkTokensEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentServiceDefinitionId, displayName, fields, acceptedCountries, acceptedCurrencies, threeDSecureEnabled, merchantProfile, active, openLoop, paymentMethodTokenizationEnabled, networkTokensEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentServiceRequest {\n");
    sb.append("    paymentServiceDefinitionId: ").append(toIndentedString(paymentServiceDefinitionId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    acceptedCountries: ").append(toIndentedString(acceptedCountries)).append("\n");
    sb.append("    acceptedCurrencies: ").append(toIndentedString(acceptedCurrencies)).append("\n");
    sb.append("    threeDSecureEnabled: ").append(toIndentedString(threeDSecureEnabled)).append("\n");
    sb.append("    merchantProfile: ").append(toIndentedString(merchantProfile)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    openLoop: ").append(toIndentedString(openLoop)).append("\n");
    sb.append("    paymentMethodTokenizationEnabled: ").append(toIndentedString(paymentMethodTokenizationEnabled)).append("\n");
    sb.append("    networkTokensEnabled: ").append(toIndentedString(networkTokensEnabled)).append("\n");
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

