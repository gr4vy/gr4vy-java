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
import com.gr4vy.api.model.GiftCardServiceFields;
import com.gr4vy.api.model.MerchantProfileSummary;
import com.gr4vy.api.model.PaymentServiceReportingFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * An active, configured payment service.
 */
@ApiModel(description = "An active, configured payment service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentService {
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

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ACCEPTED_COUNTRIES = "accepted_countries";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_COUNTRIES)
  private List<String> acceptedCountries = null;

  public static final String SERIALIZED_NAME_ACCEPTED_CURRENCIES = "accepted_currencies";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_CURRENCIES)
  private List<String> acceptedCurrencies = null;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active = true;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<GiftCardServiceFields> fields = null;

  public static final String SERIALIZED_NAME_REPORTING_FIELDS = "reporting_fields";
  @SerializedName(SERIALIZED_NAME_REPORTING_FIELDS)
  private List<PaymentServiceReportingFields> reportingFields = null;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT_ID = "merchant_account_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT_ID)
  private String merchantAccountId;

  public static final String SERIALIZED_NAME_MERCHANT_PROFILE = "merchant_profile";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PROFILE)
  private MerchantProfileSummary merchantProfile;

  /**
   * The payment method that this service handles.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    AFTERPAY("afterpay"),
    
    ALIPAY("alipay"),
    
    ALIPAYHK("alipayhk"),
    
    APPLEPAY("applepay"),
    
    BACS("bacs"),
    
    BANCONTACT("bancontact"),
    
    BANKED("banked"),
    
    BECS("becs"),
    
    BITPAY("bitpay"),
    
    BOLETO("boleto"),
    
    BOOST("boost"),
    
    CARD("card"),
    
    CASHAPP("cashapp"),
    
    CHASEORBITAL("chaseorbital"),
    
    CHECKOUT_SESSION("checkout-session"),
    
    CLEARPAY("clearpay"),
    
    CLICK_TO_PAY("click-to-pay"),
    
    DANA("dana"),
    
    DCB("dcb"),
    
    DLOCAL("dlocal"),
    
    EBANX("ebanx"),
    
    EFECTY("efecty"),
    
    EPS("eps"),
    
    EVERYDAYPAY("everydaypay"),
    
    GCASH("gcash"),
    
    GIFT_CARD("gift-card"),
    
    GIROPAY("giropay"),
    
    GIVINGBLOCK("givingblock"),
    
    GOCARDLESS("gocardless"),
    
    GOOGLEPAY("googlepay"),
    
    GOOGLEPAY_PAN_ONLY("googlepay_pan_only"),
    
    GOPAY("gopay"),
    
    GRABPAY("grabpay"),
    
    ID("id"),
    
    IDEAL("ideal"),
    
    KAKAOPAY("kakaopay"),
    
    KCP("kcp"),
    
    KLARNA("klarna"),
    
    LAYBUY("laybuy"),
    
    LINEPAY("linepay"),
    
    LINKAJA("linkaja"),
    
    MAYBANKQRPAY("maybankqrpay"),
    
    MERCADOPAGO("mercadopago"),
    
    MULTIBANCO("multibanco"),
    
    MULTIPAGO("multipago"),
    
    NETBANKING("netbanking"),
    
    NETWORK_TOKEN("network-token"),
    
    ONEY_3X("oney_3x"),
    
    ONEY_4X("oney_4x"),
    
    ONEY_6X("oney_6x"),
    
    ONEY_10X("oney_10x"),
    
    ONEY_12X("oney_12x"),
    
    OVO("ovo"),
    
    OXXO("oxxo"),
    
    PAYID("payid"),
    
    PAYMAYA("paymaya"),
    
    PAYPAL("paypal"),
    
    PAYPALPAYLATER("paypalpaylater"),
    
    PAYTO("payto"),
    
    VENMO("venmo"),
    
    PIX("pix"),
    
    PSE("pse"),
    
    RABBITLINEPAY("rabbitlinepay"),
    
    RAZORPAY("razorpay"),
    
    SCALAPAY("scalapay"),
    
    SEPA("sepa"),
    
    SHOPEEPAY("shopeepay"),
    
    SINGTELDASH("singteldash"),
    
    SMARTPAY("smartpay"),
    
    SOFORT("sofort"),
    
    SPEI("spei"),
    
    STRIPEDD("stripedd"),
    
    THAIQR("thaiqr"),
    
    TOUCHNGO("touchngo"),
    
    TRUEMONEY("truemoney"),
    
    TRUSTLY("trustly"),
    
    TRUSTLYEUROPE("trustlyeurope"),
    
    UPI("upi"),
    
    VIPPS("vipps"),
    
    WAAVE("waave"),
    
    WEBPAY("webpay"),
    
    WECHAT("wechat"),
    
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

  public static final String SERIALIZED_NAME_NETWORK_TOKENS_ENABLED = "network_tokens_enabled";
  @SerializedName(SERIALIZED_NAME_NETWORK_TOKENS_ENABLED)
  private Boolean networkTokensEnabled;

  public static final String SERIALIZED_NAME_OPEN_LOOP = "open_loop";
  @SerializedName(SERIALIZED_NAME_OPEN_LOOP)
  private Boolean openLoop;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_TOKENIZATION_ENABLED = "payment_method_tokenization_enabled";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_TOKENIZATION_ENABLED)
  private Boolean paymentMethodTokenizationEnabled = false;

  public static final String SERIALIZED_NAME_PAYMENT_SERVICE_DEFINITION_ID = "payment_service_definition_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SERVICE_DEFINITION_ID)
  private String paymentServiceDefinitionId;

  public static final String SERIALIZED_NAME_SETTLEMENT_REPORTING_ENABLED = "settlement_reporting_enabled";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_REPORTING_ENABLED)
  private Boolean settlementReportingEnabled;

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

  public static final String SERIALIZED_NAME_THREE_D_SECURE_ENABLED = "three_d_secure_enabled";
  @SerializedName(SERIALIZED_NAME_THREE_D_SECURE_ENABLED)
  private Boolean threeDSecureEnabled = false;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_WEBHOOK_URL = "webhook_url";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_URL)
  private String webhookUrl;


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


  public PaymentService createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when this service was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43Z", value = "The date and time when this service was created.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
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


  public PaymentService fields(List<GiftCardServiceFields> fields) {
    
    this.fields = fields;
    return this;
  }

  public PaymentService addFieldsItem(GiftCardServiceFields fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<GiftCardServiceFields>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * A list of fields, each containing a key-value pair for each field configured for this payment service. Fields marked as &#x60;secret&#x60; (see Payment Service Definition) are not returned.
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of fields, each containing a key-value pair for each field configured for this payment service. Fields marked as `secret` (see Payment Service Definition) are not returned.")

  public List<GiftCardServiceFields> getFields() {
    return fields;
  }


  public void setFields(List<GiftCardServiceFields> fields) {
    this.fields = fields;
  }


  public PaymentService reportingFields(List<PaymentServiceReportingFields> reportingFields) {
    
    this.reportingFields = reportingFields;
    return this;
  }

  public PaymentService addReportingFieldsItem(PaymentServiceReportingFields reportingFieldsItem) {
    if (this.reportingFields == null) {
      this.reportingFields = new ArrayList<PaymentServiceReportingFields>();
    }
    this.reportingFields.add(reportingFieldsItem);
    return this;
  }

   /**
   * A list of fields, each containing a key-value pair for each field configured for reporting for this payment service. Fields marked as &#x60;secret&#x60; (see Payment Service Definition) are not returned.
   * @return reportingFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of fields, each containing a key-value pair for each field configured for reporting for this payment service. Fields marked as `secret` (see Payment Service Definition) are not returned.")

  public List<PaymentServiceReportingFields> getReportingFields() {
    return reportingFields;
  }


  public void setReportingFields(List<PaymentServiceReportingFields> reportingFields) {
    this.reportingFields = reportingFields;
  }


  public PaymentService merchantAccountId(String merchantAccountId) {
    
    this.merchantAccountId = merchantAccountId;
    return this;
  }

   /**
   * The unique ID for a merchant account.
   * @return merchantAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "default", value = "The unique ID for a merchant account.")

  public String getMerchantAccountId() {
    return merchantAccountId;
  }


  public void setMerchantAccountId(String merchantAccountId) {
    this.merchantAccountId = merchantAccountId;
  }


  public PaymentService merchantProfile(MerchantProfileSummary merchantProfile) {
    
    this.merchantProfile = merchantProfile;
    return this;
  }

   /**
   * An object containing a key for each supported card scheme (Amex, Discover, Mastercard and Visa), and for each key an object with the merchant profile for this service and the corresponding scheme.
   * @return merchantProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An object containing a key for each supported card scheme (Amex, Discover, Mastercard and Visa), and for each key an object with the merchant profile for this service and the corresponding scheme.")

  public MerchantProfileSummary getMerchantProfile() {
    return merchantProfile;
  }


  public void setMerchantProfile(MerchantProfileSummary merchantProfile) {
    this.merchantProfile = merchantProfile;
  }


  public PaymentService method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * The payment method that this service handles.
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "card", value = "The payment method that this service handles.")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public PaymentService networkTokensEnabled(Boolean networkTokensEnabled) {
    
    this.networkTokensEnabled = networkTokensEnabled;
    return this;
  }

   /**
   * Defines if network tokens are enabled for the service. This feature can only be enabled if the payment service is set as &#x60;open_loop&#x60; and the PSP is set up to accept network tokens.
   * @return networkTokensEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Defines if network tokens are enabled for the service. This feature can only be enabled if the payment service is set as `open_loop` and the PSP is set up to accept network tokens.")

  public Boolean getNetworkTokensEnabled() {
    return networkTokensEnabled;
  }


  public void setNetworkTokensEnabled(Boolean networkTokensEnabled) {
    this.networkTokensEnabled = networkTokensEnabled;
  }


  public PaymentService openLoop(Boolean openLoop) {
    
    this.openLoop = openLoop;
    return this;
  }

   /**
   * Defines if the service works as an open-loop service. This feature can only be enabled if the PSP is set up to accept previous scheme transaction IDs.
   * @return openLoop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Defines if the service works as an open-loop service. This feature can only be enabled if the PSP is set up to accept previous scheme transaction IDs.")

  public Boolean getOpenLoop() {
    return openLoop;
  }


  public void setOpenLoop(Boolean openLoop) {
    this.openLoop = openLoop;
  }


  public PaymentService paymentMethodTokenizationEnabled(Boolean paymentMethodTokenizationEnabled) {
    
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


  public PaymentService settlementReportingEnabled(Boolean settlementReportingEnabled) {
    
    this.settlementReportingEnabled = settlementReportingEnabled;
    return this;
  }

   /**
   * Defines if settlement reporting is enabled for the service. This feature can only be enabled if the payment service definition supports the &#x60;settlement_reporting&#x60; feature.
   * @return settlementReportingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Defines if settlement reporting is enabled for the service. This feature can only be enabled if the payment service definition supports the `settlement_reporting` feature.")

  public Boolean getSettlementReportingEnabled() {
    return settlementReportingEnabled;
  }


  public void setSettlementReportingEnabled(Boolean settlementReportingEnabled) {
    this.settlementReportingEnabled = settlementReportingEnabled;
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


  public PaymentService threeDSecureEnabled(Boolean threeDSecureEnabled) {
    
    this.threeDSecureEnabled = threeDSecureEnabled;
    return this;
  }

   /**
   * Defines if 3-D Secure is enabled for the service. This feature can only be enabled if the payment service definition supports the &#x60;three_d_secure_hosted&#x60; feature. This does not affect pass through 3-D Secure data.
   * @return threeDSecureEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Defines if 3-D Secure is enabled for the service. This feature can only be enabled if the payment service definition supports the `three_d_secure_hosted` feature. This does not affect pass through 3-D Secure data.")

  public Boolean getThreeDSecureEnabled() {
    return threeDSecureEnabled;
  }


  public void setThreeDSecureEnabled(Boolean threeDSecureEnabled) {
    this.threeDSecureEnabled = threeDSecureEnabled;
  }


  public PaymentService updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time when this service was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43Z", value = "The date and time when this service was last updated.")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public PaymentService webhookUrl(String webhookUrl) {
    
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * The URL that needs to be configured with this payment service as the receiving endpoint for webhooks from the service to Gr4vy. Currently, Gr4vy does not yet automatically register webhooks on setup, and therefore webhooks need to be registered manually by the merchant.
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.example.app.gr4vy.com/i/ViYUjDkUSoiQ0ColeigGwnN0...", value = "The URL that needs to be configured with this payment service as the receiving endpoint for webhooks from the service to Gr4vy. Currently, Gr4vy does not yet automatically register webhooks on setup, and therefore webhooks need to be registered manually by the merchant.")

  public String getWebhookUrl() {
    return webhookUrl;
  }


  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
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
    return Objects.equals(this.type, paymentService.type) &&
        Objects.equals(this.id, paymentService.id) &&
        Objects.equals(this.acceptedCountries, paymentService.acceptedCountries) &&
        Objects.equals(this.acceptedCurrencies, paymentService.acceptedCurrencies) &&
        Objects.equals(this.active, paymentService.active) &&
        Objects.equals(this.createdAt, paymentService.createdAt) &&
        Objects.equals(this.displayName, paymentService.displayName) &&
        Objects.equals(this.fields, paymentService.fields) &&
        Objects.equals(this.reportingFields, paymentService.reportingFields) &&
        Objects.equals(this.merchantAccountId, paymentService.merchantAccountId) &&
        Objects.equals(this.merchantProfile, paymentService.merchantProfile) &&
        Objects.equals(this.method, paymentService.method) &&
        Objects.equals(this.networkTokensEnabled, paymentService.networkTokensEnabled) &&
        Objects.equals(this.openLoop, paymentService.openLoop) &&
        Objects.equals(this.paymentMethodTokenizationEnabled, paymentService.paymentMethodTokenizationEnabled) &&
        Objects.equals(this.paymentServiceDefinitionId, paymentService.paymentServiceDefinitionId) &&
        Objects.equals(this.settlementReportingEnabled, paymentService.settlementReportingEnabled) &&
        Objects.equals(this.status, paymentService.status) &&
        Objects.equals(this.threeDSecureEnabled, paymentService.threeDSecureEnabled) &&
        Objects.equals(this.updatedAt, paymentService.updatedAt) &&
        Objects.equals(this.webhookUrl, paymentService.webhookUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, acceptedCountries, acceptedCurrencies, active, createdAt, displayName, fields, reportingFields, merchantAccountId, merchantProfile, method, networkTokensEnabled, openLoop, paymentMethodTokenizationEnabled, paymentServiceDefinitionId, settlementReportingEnabled, status, threeDSecureEnabled, updatedAt, webhookUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentService {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    acceptedCountries: ").append(toIndentedString(acceptedCountries)).append("\n");
    sb.append("    acceptedCurrencies: ").append(toIndentedString(acceptedCurrencies)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    reportingFields: ").append(toIndentedString(reportingFields)).append("\n");
    sb.append("    merchantAccountId: ").append(toIndentedString(merchantAccountId)).append("\n");
    sb.append("    merchantProfile: ").append(toIndentedString(merchantProfile)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    networkTokensEnabled: ").append(toIndentedString(networkTokensEnabled)).append("\n");
    sb.append("    openLoop: ").append(toIndentedString(openLoop)).append("\n");
    sb.append("    paymentMethodTokenizationEnabled: ").append(toIndentedString(paymentMethodTokenizationEnabled)).append("\n");
    sb.append("    paymentServiceDefinitionId: ").append(toIndentedString(paymentServiceDefinitionId)).append("\n");
    sb.append("    settlementReportingEnabled: ").append(toIndentedString(settlementReportingEnabled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    threeDSecureEnabled: ").append(toIndentedString(threeDSecureEnabled)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
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

