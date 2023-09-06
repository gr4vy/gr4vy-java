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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-06T15:11:33.631354Z[Etc/UTC]")
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

  /**
   * The ID of the payment method that this services handles.
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
    
    CHECKOUT_SESSION("checkout-session"),
    
    CLEARPAY("clearpay"),
    
    DANA("dana"),
    
    DCB("dcb"),
    
    EPS("eps"),
    
    FORTUMO("fortumo"),
    
    GCASH("gcash"),
    
    GIROPAY("giropay"),
    
    GOCARDLESS("gocardless"),
    
    GOOGLEPAY("googlepay"),
    
    GOPAY("gopay"),
    
    GRABPAY("grabpay"),
    
    IDEAL("ideal"),
    
    ID("id"),
    
    KAKAOPAY("kakaopay"),
    
    KLARNA("klarna"),
    
    LAYBUY("laybuy"),
    
    LINEPAY("linepay"),
    
    LINKAJA("linkaja"),
    
    MAYBANKQRPAY("maybankqrpay"),
    
    MULTIBANCO("multibanco"),
    
    ONEY_3X("oney_3x"),
    
    ONEY_4X("oney_4x"),
    
    ONEY_6X("oney_6x"),
    
    ONEY_10X("oney_10x"),
    
    ONEY_12X("oney_12x"),
    
    OVO("ovo"),
    
    OXXO("oxxo"),
    
    PAYMAYA("paymaya"),
    
    PAYPAL("paypal"),
    
    PAYPALPAYLATER("paypalpaylater"),
    
    PIX("pix"),
    
    RABBITLINEPAY("rabbitlinepay"),
    
    RAZORPAY("razorpay"),
    
    SCALAPAY("scalapay"),
    
    SEPA("sepa"),
    
    SHOPEEPAY("shopeepay"),
    
    SINGTELDASH("singteldash"),
    
    SOFORT("sofort"),
    
    STRIPEDD("stripedd"),
    
    THAIQR("thaiqr"),
    
    TOUCHNGO("touchngo"),
    
    TRUEMONEY("truemoney"),
    
    TRUSTLY("trustly"),
    
    VENMO("venmo"),
    
    WAAVE("waave"),
    
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

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<PaymentServiceDefinitionFields> fields = null;

  public static final String SERIALIZED_NAME_SUPPORTED_CURRENCIES = "supported_currencies";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_CURRENCIES)
  private List<String> supportedCurrencies = null;

  public static final String SERIALIZED_NAME_SUPPORTED_COUNTRIES = "supported_countries";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_COUNTRIES)
  private List<String> supportedCountries = null;

  /**
   * The mode of this payment service.
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    CARD("card"),
    
    REDIRECT("redirect"),
    
    APPLEPAY("applepay"),
    
    GOOGLEPAY("googlepay");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private ModeEnum mode;

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


  public PaymentServiceDefinition method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * The ID of the payment method that this services handles.
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "card", value = "The ID of the payment method that this services handles.")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
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


  public PaymentServiceDefinition mode(ModeEnum mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * The mode of this payment service.
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "card", value = "The mode of this payment service.")

  public ModeEnum getMode() {
    return mode;
  }


  public void setMode(ModeEnum mode) {
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

