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

/**
 * Redirect payment method details to use in a transaction.
 */
@ApiModel(description = "Redirect payment method details to use in a transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionRedirectRequest {
  /**
   * The method to use, this can be any of the methods that support redirect requests.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    AFTERPAY("afterpay"),
    
    ALIPAY("alipay"),
    
    ALIPAYHK("alipayhk"),
    
    BACS("bacs"),
    
    BANCONTACT("bancontact"),
    
    BANKED("banked"),
    
    BECS("becs"),
    
    BITPAY("bitpay"),
    
    BOLETO("boleto"),
    
    BOOST("boost"),
    
    CASHAPP("cashapp"),
    
    CHASEORBITAL("chaseorbital"),
    
    CHECKOUT_SESSION("checkout-session"),
    
    CLEARPAY("clearpay"),
    
    DANA("dana"),
    
    DCB("dcb"),
    
    DLOCAL("dlocal"),
    
    EBANX("ebanx"),
    
    EFECTY("efecty"),
    
    EPS("eps"),
    
    EVERYDAYPAY("everydaypay"),
    
    GCASH("gcash"),
    
    GEM("gem"),
    
    GEMDS("gemds"),
    
    GIFT_CARD("gift-card"),
    
    GIROPAY("giropay"),
    
    GIVINGBLOCK("givingblock"),
    
    GOCARDLESS("gocardless"),
    
    GOPAY("gopay"),
    
    GRABPAY("grabpay"),
    
    IDEAL("ideal"),
    
    KAKAOPAY("kakaopay"),
    
    KCP("kcp"),
    
    KLARNA("klarna"),
    
    LATITUDE("latitude"),
    
    LATITUDEDS("latitudeds"),
    
    LAYBUY("laybuy"),
    
    LINEPAY("linepay"),
    
    LINKAJA("linkaja"),
    
    MAYBANKQRPAY("maybankqrpay"),
    
    MERCADOPAGO("mercadopago"),
    
    MULTIBANCO("multibanco"),
    
    MULTIPAGO("multipago"),
    
    NETBANKING("netbanking"),
    
    NETWORK_TOKEN("network-token"),
    
    ONEY_10X("oney_10x"),
    
    ONEY_12X("oney_12x"),
    
    ONEY_3X("oney_3x"),
    
    ONEY_4X("oney_4x"),
    
    ONEY_6X("oney_6x"),
    
    OVO("ovo"),
    
    OXXO("oxxo"),
    
    PAYID("payid"),
    
    PAYMAYA("paymaya"),
    
    PAYPAL("paypal"),
    
    PAYPALPAYLATER("paypalpaylater"),
    
    PAYTO("payto"),
    
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
    
    VENMO("venmo"),
    
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

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirect_url";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_EXTERNAL_IDENTIFIER = "external_identifier";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDENTIFIER)
  private String externalIdentifier;


  public TransactionRedirectRequest method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * The method to use, this can be any of the methods that support redirect requests.
   * @return method
  **/
  @ApiModelProperty(example = "paypal", required = true, value = "The method to use, this can be any of the methods that support redirect requests.")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public TransactionRedirectRequest redirectUrl(String redirectUrl) {
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * The redirect URL to redirect a buyer to after they have authorized their transaction.
   * @return redirectUrl
  **/
  @ApiModelProperty(example = "https://example.com/callback", required = true, value = "The redirect URL to redirect a buyer to after they have authorized their transaction.")

  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  public TransactionRedirectRequest currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The ISO-4217 currency code to use this payment method for. This is used to select the payment service to use.
   * @return currency
  **/
  @ApiModelProperty(example = "USD", required = true, value = "The ISO-4217 currency code to use this payment method for. This is used to select the payment service to use.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public TransactionRedirectRequest country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The 2-letter ISO code of the country to use this payment method for. This is used to select the payment service to use.
   * @return country
  **/
  @ApiModelProperty(example = "US", required = true, value = "The 2-letter ISO code of the country to use this payment method for. This is used to select the payment service to use.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public TransactionRedirectRequest externalIdentifier(String externalIdentifier) {
    
    this.externalIdentifier = externalIdentifier;
    return this;
  }

   /**
   * An external identifier that can be used to match the account against your own records. This can only be set if the &#x60;store&#x60; flag is set to &#x60;true&#x60;.
   * @return externalIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "account-23423423", value = "An external identifier that can be used to match the account against your own records. This can only be set if the `store` flag is set to `true`.")

  public String getExternalIdentifier() {
    return externalIdentifier;
  }


  public void setExternalIdentifier(String externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRedirectRequest transactionRedirectRequest = (TransactionRedirectRequest) o;
    return Objects.equals(this.method, transactionRedirectRequest.method) &&
        Objects.equals(this.redirectUrl, transactionRedirectRequest.redirectUrl) &&
        Objects.equals(this.currency, transactionRedirectRequest.currency) &&
        Objects.equals(this.country, transactionRedirectRequest.country) &&
        Objects.equals(this.externalIdentifier, transactionRedirectRequest.externalIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, redirectUrl, currency, country, externalIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRedirectRequest {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
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

