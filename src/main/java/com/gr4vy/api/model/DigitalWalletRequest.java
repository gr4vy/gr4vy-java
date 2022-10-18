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
import java.util.ArrayList;
import java.util.List;

/**
 * Merchant details used to register with a digital wallet provider.
 */
@ApiModel(description = "Merchant details used to register with a digital wallet provider.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-18T21:14:21.023172Z[Etc/UTC]")
public class DigitalWalletRequest {
  /**
   * The name of the digital wallet provider.
   */
  @JsonAdapter(ProviderEnum.Adapter.class)
  public enum ProviderEnum {
    APPLE("apple"),
    
    GOOGLE("google");

    private String value;

    ProviderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProviderEnum fromValue(String value) {
      for (ProviderEnum b : ProviderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProviderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProviderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProviderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProviderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private ProviderEnum provider;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_MERCHANT_URL = "merchant_url";
  @SerializedName(SERIALIZED_NAME_MERCHANT_URL)
  private String merchantUrl = "null";

  public static final String SERIALIZED_NAME_DOMAIN_NAMES = "domain_names";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAMES)
  private List<String> domainNames = new ArrayList<String>();

  public static final String SERIALIZED_NAME_ACCEPT_TERMS_AND_CONDITIONS = "accept_terms_and_conditions";
  @SerializedName(SERIALIZED_NAME_ACCEPT_TERMS_AND_CONDITIONS)
  private Boolean acceptTermsAndConditions;


  public DigitalWalletRequest provider(ProviderEnum provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * The name of the digital wallet provider.
   * @return provider
  **/
  @ApiModelProperty(example = "apple", required = true, value = "The name of the digital wallet provider.")

  public ProviderEnum getProvider() {
    return provider;
  }


  public void setProvider(ProviderEnum provider) {
    this.provider = provider;
  }


  public DigitalWalletRequest merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * The name of the merchant. This is used to register the merchant with a digital wallet provider and this name is not displayed to the buyer.
   * @return merchantName
  **/
  @ApiModelProperty(example = "Gr4vy", required = true, value = "The name of the merchant. This is used to register the merchant with a digital wallet provider and this name is not displayed to the buyer.")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public DigitalWalletRequest merchantUrl(String merchantUrl) {
    
    this.merchantUrl = merchantUrl;
    return this;
  }

   /**
   * The main URL of the merchant. This is used to register the merchant with a digital wallet provider and this URL is not displayed to the buyer.
   * @return merchantUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com", value = "The main URL of the merchant. This is used to register the merchant with a digital wallet provider and this URL is not displayed to the buyer.")

  public String getMerchantUrl() {
    return merchantUrl;
  }


  public void setMerchantUrl(String merchantUrl) {
    this.merchantUrl = merchantUrl;
  }


  public DigitalWalletRequest domainNames(List<String> domainNames) {
    
    this.domainNames = domainNames;
    return this;
  }

  public DigitalWalletRequest addDomainNamesItem(String domainNamesItem) {
    this.domainNames.add(domainNamesItem);
    return this;
  }

   /**
   * The list of domain names that a digital wallet can be used on. To use a digital wallet on a website, the domain of the site is required to be in this list.
   * @return domainNames
  **/
  @ApiModelProperty(example = "[\"example.com\"]", required = true, value = "The list of domain names that a digital wallet can be used on. To use a digital wallet on a website, the domain of the site is required to be in this list.")

  public List<String> getDomainNames() {
    return domainNames;
  }


  public void setDomainNames(List<String> domainNames) {
    this.domainNames = domainNames;
  }


  public DigitalWalletRequest acceptTermsAndConditions(Boolean acceptTermsAndConditions) {
    
    this.acceptTermsAndConditions = acceptTermsAndConditions;
    return this;
  }

   /**
   * The explicit acceptance of the digital wallet provider&#39;s terms and conditions by the merchant. Needs to be &#x60;true&#x60; to register a new digital wallet.
   * @return acceptTermsAndConditions
  **/
  @ApiModelProperty(example = "true", required = true, value = "The explicit acceptance of the digital wallet provider's terms and conditions by the merchant. Needs to be `true` to register a new digital wallet.")

  public Boolean getAcceptTermsAndConditions() {
    return acceptTermsAndConditions;
  }


  public void setAcceptTermsAndConditions(Boolean acceptTermsAndConditions) {
    this.acceptTermsAndConditions = acceptTermsAndConditions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalWalletRequest digitalWalletRequest = (DigitalWalletRequest) o;
    return Objects.equals(this.provider, digitalWalletRequest.provider) &&
        Objects.equals(this.merchantName, digitalWalletRequest.merchantName) &&
        Objects.equals(this.merchantUrl, digitalWalletRequest.merchantUrl) &&
        Objects.equals(this.domainNames, digitalWalletRequest.domainNames) &&
        Objects.equals(this.acceptTermsAndConditions, digitalWalletRequest.acceptTermsAndConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, merchantName, merchantUrl, domainNames, acceptTermsAndConditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalWalletRequest {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantUrl: ").append(toIndentedString(merchantUrl)).append("\n");
    sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
    sb.append("    acceptTermsAndConditions: ").append(toIndentedString(acceptTermsAndConditions)).append("\n");
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

