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
import com.gr4vy.api.model.PaymentOptionContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An available payment option for a locale.
 */
@ApiModel(description = "An available payment option for a locale.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentOption {
  /**
   * &#x60;payment-option&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PAYMENT_OPTION("payment-option");

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

  /**
   * The type of payment method that is available.
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
    
    EPS("eps"),
    
    EVERYDAYPAY("everydaypay"),
    
    GCASH("gcash"),
    
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
    
    MULTIBANCO("multibanco"),
    
    MULTIPAGO("multipago"),
    
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
    
    VIPPS("vipps"),
    
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

  public static final String SERIALIZED_NAME_ICON_URL = "icon_url";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl;

  /**
   * The mode to use with this payment option.
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    CARD("card"),
    
    REDIRECT("redirect"),
    
    APPLEPAY("applepay"),
    
    GOOGLEPAY("googlepay"),
    
    CLICK_TO_PAY("click-to-pay"),
    
    CHECKOUT_SESSION("checkout-session");

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

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_CAN_STORE_PAYMENT_METHOD = "can_store_payment_method";
  @SerializedName(SERIALIZED_NAME_CAN_STORE_PAYMENT_METHOD)
  private Boolean canStorePaymentMethod;

  public static final String SERIALIZED_NAME_CAN_DELAY_CAPTURE = "can_delay_capture";
  @SerializedName(SERIALIZED_NAME_CAN_DELAY_CAPTURE)
  private Boolean canDelayCapture;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private PaymentOptionContext context;


  public PaymentOption type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;payment-option&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "payment-option", value = "`payment-option`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PaymentOption method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * The type of payment method that is available.
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "card", value = "The type of payment method that is available.")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public PaymentOption iconUrl(String iconUrl) {
    
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * An icon to display for the payment option.
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://cdn.gr4vy.app/card.svg", value = "An icon to display for the payment option.")

  public String getIconUrl() {
    return iconUrl;
  }


  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }


  public PaymentOption mode(ModeEnum mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * The mode to use with this payment option.
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "card", value = "The mode to use with this payment option.")

  public ModeEnum getMode() {
    return mode;
  }


  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  public PaymentOption label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * A label that describes this payment option. This label is returned in the language defined by the &#x60;locale&#x60; query parameter. The label can be used to display a list of payment options to the buyer in their language.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Pay by Card", value = "A label that describes this payment option. This label is returned in the language defined by the `locale` query parameter. The label can be used to display a list of payment options to the buyer in their language.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public PaymentOption canStorePaymentMethod(Boolean canStorePaymentMethod) {
    
    this.canStorePaymentMethod = canStorePaymentMethod;
    return this;
  }

   /**
   * A flag to indicate if storing the payment method is supported.
   * @return canStorePaymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag to indicate if storing the payment method is supported.")

  public Boolean getCanStorePaymentMethod() {
    return canStorePaymentMethod;
  }


  public void setCanStorePaymentMethod(Boolean canStorePaymentMethod) {
    this.canStorePaymentMethod = canStorePaymentMethod;
  }


  public PaymentOption canDelayCapture(Boolean canDelayCapture) {
    
    this.canDelayCapture = canDelayCapture;
    return this;
  }

   /**
   * A flag to indicate if delayed capture is supported.
   * @return canDelayCapture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag to indicate if delayed capture is supported.")

  public Boolean getCanDelayCapture() {
    return canDelayCapture;
  }


  public void setCanDelayCapture(Boolean canDelayCapture) {
    this.canDelayCapture = canDelayCapture;
  }


  public PaymentOption context(PaymentOptionContext context) {
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentOptionContext getContext() {
    return context;
  }


  public void setContext(PaymentOptionContext context) {
    this.context = context;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentOption paymentOption = (PaymentOption) o;
    return Objects.equals(this.type, paymentOption.type) &&
        Objects.equals(this.method, paymentOption.method) &&
        Objects.equals(this.iconUrl, paymentOption.iconUrl) &&
        Objects.equals(this.mode, paymentOption.mode) &&
        Objects.equals(this.label, paymentOption.label) &&
        Objects.equals(this.canStorePaymentMethod, paymentOption.canStorePaymentMethod) &&
        Objects.equals(this.canDelayCapture, paymentOption.canDelayCapture) &&
        Objects.equals(this.context, paymentOption.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, method, iconUrl, mode, label, canStorePaymentMethod, canDelayCapture, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentOption {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    canStorePaymentMethod: ").append(toIndentedString(canStorePaymentMethod)).append("\n");
    sb.append("    canDelayCapture: ").append(toIndentedString(canDelayCapture)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

