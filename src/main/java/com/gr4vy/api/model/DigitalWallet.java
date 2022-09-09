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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * A digital wallet (e.g. Apple Pay) that has been registered.
 */
@ApiModel(description = "A digital wallet (e.g. Apple Pay) that has been registered.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-09T18:46:45.100086Z[Etc/UTC]")
public class DigitalWallet {
  /**
   * &#x60;digital-wallet&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DIGITAL_WALLET("digital-wallet");

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

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_MERCHANT_URL = "merchant_url";
  @SerializedName(SERIALIZED_NAME_MERCHANT_URL)
  private String merchantUrl = "null";

  public static final String SERIALIZED_NAME_DOMAIN_NAMES = "domain_names";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAMES)
  private List<String> domainNames = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public DigitalWallet type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;digital-wallet&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "digital-wallet", value = "`digital-wallet`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public DigitalWallet provider(ProviderEnum provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * The name of the digital wallet provider.
   * @return provider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "apple", value = "The name of the digital wallet provider.")

  public ProviderEnum getProvider() {
    return provider;
  }


  public void setProvider(ProviderEnum provider) {
    this.provider = provider;
  }


  public DigitalWallet id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the registered digital wallet.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8d3fe99b-1422-42e6-bbb3-932d95ae5f79", value = "The ID of the registered digital wallet.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public DigitalWallet merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * The name of the merchant the digital wallet is registered to.
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Gr4vy", value = "The name of the merchant the digital wallet is registered to.")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public DigitalWallet merchantUrl(String merchantUrl) {
    
    this.merchantUrl = merchantUrl;
    return this;
  }

   /**
   * The main URL of the merchant.
   * @return merchantUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com", value = "The main URL of the merchant.")

  public String getMerchantUrl() {
    return merchantUrl;
  }


  public void setMerchantUrl(String merchantUrl) {
    this.merchantUrl = merchantUrl;
  }


  public DigitalWallet domainNames(List<String> domainNames) {
    
    this.domainNames = domainNames;
    return this;
  }

  public DigitalWallet addDomainNamesItem(String domainNamesItem) {
    if (this.domainNames == null) {
      this.domainNames = new ArrayList<String>();
    }
    this.domainNames.add(domainNamesItem);
    return this;
  }

   /**
   * The list of domain names that a digital wallet can be used on. To use a digital wallet on a website, the domain of the site is required to be in this list.
   * @return domainNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"example.com\"]", value = "The list of domain names that a digital wallet can be used on. To use a digital wallet on a website, the domain of the site is required to be in this list.")

  public List<String> getDomainNames() {
    return domainNames;
  }


  public void setDomainNames(List<String> domainNames) {
    this.domainNames = domainNames;
  }


  public DigitalWallet createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when this digital wallet was registered.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43Z", value = "The date and time when this digital wallet was registered.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public DigitalWallet updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time when this digital wallet was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-12-12T10:53:43Z", value = "The date and time when this digital wallet was last updated.")

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
    DigitalWallet digitalWallet = (DigitalWallet) o;
    return Objects.equals(this.type, digitalWallet.type) &&
        Objects.equals(this.provider, digitalWallet.provider) &&
        Objects.equals(this.id, digitalWallet.id) &&
        Objects.equals(this.merchantName, digitalWallet.merchantName) &&
        Objects.equals(this.merchantUrl, digitalWallet.merchantUrl) &&
        Objects.equals(this.domainNames, digitalWallet.domainNames) &&
        Objects.equals(this.createdAt, digitalWallet.createdAt) &&
        Objects.equals(this.updatedAt, digitalWallet.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, provider, id, merchantName, merchantUrl, domainNames, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalWallet {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantUrl: ").append(toIndentedString(merchantUrl)).append("\n");
    sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
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

