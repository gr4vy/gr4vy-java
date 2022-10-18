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
import com.gr4vy.api.model.PaymentServiceDefinitionConfiguration;
import com.gr4vy.api.model.PaymentServiceDefinitionFields;
import com.gr4vy.api.model.PaymentServiceDefinitionSupportedFeatures;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An available payment service that can be configured.
 */
@ApiModel(description = "An available payment service that can be configured.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-18T22:22:07.544896Z[Etc/UTC]")
public class PaymentServiceDefinition {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = "payment-service-definition";

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<PaymentServiceDefinitionFields> fields = null;

  public static final String SERIALIZED_NAME_SUPPORTED_CURRENCIES = "supported_currencies";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_CURRENCIES)
  private List<String> supportedCurrencies = null;

  public static final String SERIALIZED_NAME_SUPPORTED_COUNTRIES = "supported_countries";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_COUNTRIES)
  private List<String> supportedCountries = null;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_SUPPORTED_FEATURES = "supported_features";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_FEATURES)
  private PaymentServiceDefinitionSupportedFeatures supportedFeatures;

  public static final String SERIALIZED_NAME_ICON_URL = "icon_url";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private PaymentServiceDefinitionConfiguration _configuration;


  public PaymentServiceDefinition id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the payment service. This is the underlying provider followed by a dash followed by the payment method ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "stripe-card", value = "The ID of the payment service. This is the underlying provider followed by a dash followed by the payment method ID.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PaymentServiceDefinition type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;payment-service-definition&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "payment-service-definition", value = "`payment-service-definition`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PaymentServiceDefinition displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of this service.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Stripe", value = "The display name of this service.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public PaymentServiceDefinition method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public PaymentServiceDefinition fields(List<PaymentServiceDefinitionFields> fields) {
    
    this.fields = fields;
    return this;
  }

  public PaymentServiceDefinition addFieldsItem(PaymentServiceDefinitionFields fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<PaymentServiceDefinitionFields>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * A list of fields that need to be submitted when activating the payment. service.
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of fields that need to be submitted when activating the payment. service.")

  public List<PaymentServiceDefinitionFields> getFields() {
    return fields;
  }


  public void setFields(List<PaymentServiceDefinitionFields> fields) {
    this.fields = fields;
  }


  public PaymentServiceDefinition supportedCurrencies(List<String> supportedCurrencies) {
    
    this.supportedCurrencies = supportedCurrencies;
    return this;
  }

  public PaymentServiceDefinition addSupportedCurrenciesItem(String supportedCurrenciesItem) {
    if (this.supportedCurrencies == null) {
      this.supportedCurrencies = new ArrayList<String>();
    }
    this.supportedCurrencies.add(supportedCurrenciesItem);
    return this;
  }

   /**
   * A list of three-letter ISO currency codes that this service supports.
   * @return supportedCurrencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"USD\",\"GBP\",\"EUR\"]", value = "A list of three-letter ISO currency codes that this service supports.")

  public List<String> getSupportedCurrencies() {
    return supportedCurrencies;
  }


  public void setSupportedCurrencies(List<String> supportedCurrencies) {
    this.supportedCurrencies = supportedCurrencies;
  }


  public PaymentServiceDefinition supportedCountries(List<String> supportedCountries) {
    
    this.supportedCountries = supportedCountries;
    return this;
  }

  public PaymentServiceDefinition addSupportedCountriesItem(String supportedCountriesItem) {
    if (this.supportedCountries == null) {
      this.supportedCountries = new ArrayList<String>();
    }
    this.supportedCountries.add(supportedCountriesItem);
    return this;
  }

   /**
   * A list of two-letter ISO country codes that this service supports.
   * @return supportedCountries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"US\",\"GB\",\"DE\"]", value = "A list of two-letter ISO country codes that this service supports.")

  public List<String> getSupportedCountries() {
    return supportedCountries;
  }


  public void setSupportedCountries(List<String> supportedCountries) {
    this.supportedCountries = supportedCountries;
  }


  public PaymentServiceDefinition mode(String mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMode() {
    return mode;
  }


  public void setMode(String mode) {
    this.mode = mode;
  }


  public PaymentServiceDefinition supportedFeatures(PaymentServiceDefinitionSupportedFeatures supportedFeatures) {
    
    this.supportedFeatures = supportedFeatures;
    return this;
  }

   /**
   * Get supportedFeatures
   * @return supportedFeatures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentServiceDefinitionSupportedFeatures getSupportedFeatures() {
    return supportedFeatures;
  }


  public void setSupportedFeatures(PaymentServiceDefinitionSupportedFeatures supportedFeatures) {
    this.supportedFeatures = supportedFeatures;
  }


  public PaymentServiceDefinition iconUrl(String iconUrl) {
    
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * An icon to display for the payment service.
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://cdn.gr4vy.app/stripe.svg", value = "An icon to display for the payment service.")

  public String getIconUrl() {
    return iconUrl;
  }


  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }


  public PaymentServiceDefinition _configuration(PaymentServiceDefinitionConfiguration _configuration) {
    
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentServiceDefinitionConfiguration getConfiguration() {
    return _configuration;
  }


  public void setConfiguration(PaymentServiceDefinitionConfiguration _configuration) {
    this._configuration = _configuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentServiceDefinition paymentServiceDefinition = (PaymentServiceDefinition) o;
    return Objects.equals(this.id, paymentServiceDefinition.id) &&
        Objects.equals(this.type, paymentServiceDefinition.type) &&
        Objects.equals(this.displayName, paymentServiceDefinition.displayName) &&
        Objects.equals(this.method, paymentServiceDefinition.method) &&
        Objects.equals(this.fields, paymentServiceDefinition.fields) &&
        Objects.equals(this.supportedCurrencies, paymentServiceDefinition.supportedCurrencies) &&
        Objects.equals(this.supportedCountries, paymentServiceDefinition.supportedCountries) &&
        Objects.equals(this.mode, paymentServiceDefinition.mode) &&
        Objects.equals(this.supportedFeatures, paymentServiceDefinition.supportedFeatures) &&
        Objects.equals(this.iconUrl, paymentServiceDefinition.iconUrl) &&
        Objects.equals(this._configuration, paymentServiceDefinition._configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, displayName, method, fields, supportedCurrencies, supportedCountries, mode, supportedFeatures, iconUrl, _configuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentServiceDefinition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    supportedCurrencies: ").append(toIndentedString(supportedCurrencies)).append("\n");
    sb.append("    supportedCountries: ").append(toIndentedString(supportedCountries)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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

