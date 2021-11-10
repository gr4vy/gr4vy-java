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
import org.threeten.bp.OffsetDateTime;

/**
 * An active, configured payment service.
 */
@ApiModel(description = "An active, configured payment service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-10T11:15:12.826734Z[Etc/UTC]")
public class PaymentService {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  /**
   * The type of this resource.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PAYMENT_SERVICE("payment-service");

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

  public static final String SERIALIZED_NAME_PAYMENT_SERVICE_DEFINITION_ID = "payment_service_definition_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SERVICE_DEFINITION_ID)
  private String paymentServiceDefinitionId;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  /**
   * The current status of this service. This will start off as pending, move to created, and might eventually move to an error status if and when the credentials are no longer valid. 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("pending"),
    
    CREATED("created"),
    
    FAILED("failed");

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

  public static final String SERIALIZED_NAME_ACCEPTED_CURRENCIES = "accepted_currencies";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_CURRENCIES)
  private List<String> acceptedCurrencies = null;

  public static final String SERIALIZED_NAME_ACCEPTED_COUNTRIES = "accepted_countries";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_COUNTRIES)
  private List<String> acceptedCountries = null;

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

  /**
   * Defines if the credentials are intended for the service&#39;s live API or sandbox/test API.
   */
  @JsonAdapter(CredentialsModeEnum.Adapter.class)
  public enum CredentialsModeEnum {
    SANDBOX("sandbox"),
    
    LIVE("live");

    private String value;

    CredentialsModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CredentialsModeEnum fromValue(String value) {
      for (CredentialsModeEnum b : CredentialsModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CredentialsModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CredentialsModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CredentialsModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CredentialsModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CREDENTIALS_MODE = "credentials_mode";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS_MODE)
  private CredentialsModeEnum credentialsMode = CredentialsModeEnum.LIVE;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active = true;

  /**
   * Gets or Sets environments
   */
  @JsonAdapter(EnvironmentsEnum.Adapter.class)
  public enum EnvironmentsEnum {
    DEVELOPMENT("development"),
    
    STAGING("staging"),
    
    PRODUCTION("production");

    private String value;

    EnvironmentsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnvironmentsEnum fromValue(String value) {
      for (EnvironmentsEnum b : EnvironmentsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnvironmentsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvironmentsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvironmentsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnvironmentsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENVIRONMENTS = "environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private List<EnvironmentsEnum> environments = null;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private BigDecimal position;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public PaymentService id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of this payment service.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "faaad066-30b4-4997-a438-242b0752d7e1", value = "The ID of this payment service.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public PaymentService type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of this resource.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "payment-service", value = "The type of this resource.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PaymentService paymentServiceDefinitionId(String paymentServiceDefinitionId) {
    
    this.paymentServiceDefinitionId = paymentServiceDefinitionId;
    return this;
  }

   /**
   * The ID of the payment service definition used to create this service. 
   * @return paymentServiceDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "stripe-card", value = "The ID of the payment service definition used to create this service. ")

  public String getPaymentServiceDefinitionId() {
    return paymentServiceDefinitionId;
  }


  public void setPaymentServiceDefinitionId(String paymentServiceDefinitionId) {
    this.paymentServiceDefinitionId = paymentServiceDefinitionId;
  }


  public PaymentService method(String method) {
    
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


  public PaymentService displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The custom name set for this service.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Stripe (Main)", value = "The custom name set for this service.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public PaymentService status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The current status of this service. This will start off as pending, move to created, and might eventually move to an error status if and when the credentials are no longer valid. 
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current status of this service. This will start off as pending, move to created, and might eventually move to an error status if and when the credentials are no longer valid. ")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public PaymentService acceptedCurrencies(List<String> acceptedCurrencies) {
    
    this.acceptedCurrencies = acceptedCurrencies;
    return this;
  }

  public PaymentService addAcceptedCurrenciesItem(String acceptedCurrenciesItem) {
    if (this.acceptedCurrencies == null) {
      this.acceptedCurrencies = new ArrayList<String>();
    }
    this.acceptedCurrencies.add(acceptedCurrenciesItem);
    return this;
  }

   /**
   * A list of currencies for which this service is enabled, in ISO 4217 three-letter code format.
   * @return acceptedCurrencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"EUR\"]", value = "A list of currencies for which this service is enabled, in ISO 4217 three-letter code format.")

  public List<String> getAcceptedCurrencies() {
    return acceptedCurrencies;
  }


  public void setAcceptedCurrencies(List<String> acceptedCurrencies) {
    this.acceptedCurrencies = acceptedCurrencies;
  }


  public PaymentService acceptedCountries(List<String> acceptedCountries) {
    
    this.acceptedCountries = acceptedCountries;
    return this;
  }

  public PaymentService addAcceptedCountriesItem(String acceptedCountriesItem) {
    if (this.acceptedCountries == null) {
      this.acceptedCountries = new ArrayList<String>();
    }
    this.acceptedCountries.add(acceptedCountriesItem);
    return this;
  }

   /**
   * A list of countries for which this service is enabled, in ISO two-letter code format.
   * @return acceptedCountries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"DE\"]", value = "A list of countries for which this service is enabled, in ISO two-letter code format.")

  public List<String> getAcceptedCountries() {
    return acceptedCountries;
  }


  public void setAcceptedCountries(List<String> acceptedCountries) {
    this.acceptedCountries = acceptedCountries;
  }


  public PaymentService threeDSecureEnabled(Boolean threeDSecureEnabled) {
    
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


  public PaymentService acquirerBinVisa(String acquirerBinVisa) {
    
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


  public PaymentService acquirerBinMastercard(String acquirerBinMastercard) {
    
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


  public PaymentService acquirerBinAmex(String acquirerBinAmex) {
    
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


  public PaymentService acquirerBinDiscover(String acquirerBinDiscover) {
    
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


  public PaymentService acquirerMerchantId(String acquirerMerchantId) {
    
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


  public PaymentService merchantName(String merchantName) {
    
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


  public PaymentService merchantCountryCode(String merchantCountryCode) {
    
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


  public PaymentService merchantCategoryCode(String merchantCategoryCode) {
    
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


  public PaymentService merchantUrl(String merchantUrl) {
    
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


  public PaymentService credentialsMode(CredentialsModeEnum credentialsMode) {
    
    this.credentialsMode = credentialsMode;
    return this;
  }

   /**
   * Defines if the credentials are intended for the service&#39;s live API or sandbox/test API.
   * @return credentialsMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "live", value = "Defines if the credentials are intended for the service's live API or sandbox/test API.")

  public CredentialsModeEnum getCredentialsMode() {
    return credentialsMode;
  }


  public void setCredentialsMode(CredentialsModeEnum credentialsMode) {
    this.credentialsMode = credentialsMode;
  }


  public PaymentService active(Boolean active) {
    
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


  public PaymentService environments(List<EnvironmentsEnum> environments) {
    
    this.environments = environments;
    return this;
  }

  public PaymentService addEnvironmentsItem(EnvironmentsEnum environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<EnvironmentsEnum>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

   /**
   * Determines the Gr4vy environments in which this service should be available. This can be used in combination with the &#x60;environment&#x60; parameters in the payment method and transaction APIs to route transactions through this service.
   * @return environments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"production\"]", value = "Determines the Gr4vy environments in which this service should be available. This can be used in combination with the `environment` parameters in the payment method and transaction APIs to route transactions through this service.")

  public List<EnvironmentsEnum> getEnvironments() {
    return environments;
  }


  public void setEnvironments(List<EnvironmentsEnum> environments) {
    this.environments = environments;
  }


  public PaymentService position(BigDecimal position) {
    
    this.position = position;
    return this;
  }

   /**
   * The numeric rank of a payment service. Payment services with a lower position value are processed first.
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The numeric rank of a payment service. Payment services with a lower position value are processed first.")

  public BigDecimal getPosition() {
    return position;
  }


  public void setPosition(BigDecimal position) {
    this.position = position;
  }


  public PaymentService createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when this service was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43Z", value = "The date and time when this service was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PaymentService updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time when this service was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43Z", value = "The date and time when this service was last updated.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentService paymentService = (PaymentService) o;
    return Objects.equals(this.id, paymentService.id) &&
        Objects.equals(this.type, paymentService.type) &&
        Objects.equals(this.paymentServiceDefinitionId, paymentService.paymentServiceDefinitionId) &&
        Objects.equals(this.method, paymentService.method) &&
        Objects.equals(this.displayName, paymentService.displayName) &&
        Objects.equals(this.status, paymentService.status) &&
        Objects.equals(this.acceptedCurrencies, paymentService.acceptedCurrencies) &&
        Objects.equals(this.acceptedCountries, paymentService.acceptedCountries) &&
        Objects.equals(this.threeDSecureEnabled, paymentService.threeDSecureEnabled) &&
        Objects.equals(this.acquirerBinVisa, paymentService.acquirerBinVisa) &&
        Objects.equals(this.acquirerBinMastercard, paymentService.acquirerBinMastercard) &&
        Objects.equals(this.acquirerBinAmex, paymentService.acquirerBinAmex) &&
        Objects.equals(this.acquirerBinDiscover, paymentService.acquirerBinDiscover) &&
        Objects.equals(this.acquirerMerchantId, paymentService.acquirerMerchantId) &&
        Objects.equals(this.merchantName, paymentService.merchantName) &&
        Objects.equals(this.merchantCountryCode, paymentService.merchantCountryCode) &&
        Objects.equals(this.merchantCategoryCode, paymentService.merchantCategoryCode) &&
        Objects.equals(this.merchantUrl, paymentService.merchantUrl) &&
        Objects.equals(this.credentialsMode, paymentService.credentialsMode) &&
        Objects.equals(this.active, paymentService.active) &&
        Objects.equals(this.environments, paymentService.environments) &&
        Objects.equals(this.position, paymentService.position) &&
        Objects.equals(this.createdAt, paymentService.createdAt) &&
        Objects.equals(this.updatedAt, paymentService.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, paymentServiceDefinitionId, method, displayName, status, acceptedCurrencies, acceptedCountries, threeDSecureEnabled, acquirerBinVisa, acquirerBinMastercard, acquirerBinAmex, acquirerBinDiscover, acquirerMerchantId, merchantName, merchantCountryCode, merchantCategoryCode, merchantUrl, credentialsMode, active, environments, position, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentService {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    paymentServiceDefinitionId: ").append(toIndentedString(paymentServiceDefinitionId)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    acceptedCurrencies: ").append(toIndentedString(acceptedCurrencies)).append("\n");
    sb.append("    acceptedCountries: ").append(toIndentedString(acceptedCountries)).append("\n");
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
    sb.append("    credentialsMode: ").append(toIndentedString(credentialsMode)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
