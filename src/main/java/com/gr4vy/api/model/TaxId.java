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
 * The tax ID information associated to a buyer.
 */
@ApiModel(description = "The tax ID information associated to a buyer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-10T11:15:12.826734Z[Etc/UTC]")
public class TaxId {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The kind of tax ID.
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    AE_TRN("ae.trn"),
    
    AU_ABN("au.abn"),
    
    BR_CNPJ("br.cnpj"),
    
    BR_CPF("br.cpf"),
    
    CA_BN("ca.bn"),
    
    CA_GST_HST("ca.gst_hst"),
    
    CA_PST_BC("ca.pst_bc"),
    
    CA_PST_MB("ca.pst_mb"),
    
    CA_PST_SK("ca.pst_sk"),
    
    CA_QST("ca.qst"),
    
    CH_VAT("ch.vat"),
    
    CL_TIN("cl.tin"),
    
    ES_CIF("es.cif"),
    
    EU_VAT("eu.vat"),
    
    GB_VAT("gb.vat"),
    
    HK_BR("hk.br"),
    
    ID_NPWP("id.npwp"),
    
    IN_GST("in.gst"),
    
    JP_CN("jp.cn"),
    
    JP_RN("jp.rn"),
    
    KR_BRN("kr.brn"),
    
    LI_UID("li.uid"),
    
    MX_RFC("mx.rfc"),
    
    MY_FRP("my.frp"),
    
    MY_ITN("my.itn"),
    
    MY_SST("my.sst"),
    
    NO_VAT("no.vat"),
    
    NZ_GST("nz.gst"),
    
    RU_INN("ru.inn"),
    
    RU_KPP("ru.kpp"),
    
    SA_VAT("sa.vat"),
    
    SG_GST("sg.gst"),
    
    SG_UEN("sg.uen"),
    
    TH_VAT("th.vat"),
    
    TW_VAT("tw.vat"),
    
    US_EIN("us.ein"),
    
    ZA_VAT("za.vat");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KindEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private KindEnum kind;


  public TaxId id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The tax ID for the buyer.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345678931", value = "The tax ID for the buyer.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TaxId kind(KindEnum kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * The kind of tax ID.
   * @return kind
  **/
  @ApiModelProperty(example = "gb.vat", required = true, value = "The kind of tax ID.")

  public KindEnum getKind() {
    return kind;
  }


  public void setKind(KindEnum kind) {
    this.kind = kind;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxId taxId = (TaxId) o;
    return Objects.equals(this.id, taxId.id) &&
        Objects.equals(this.kind, taxId.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxId {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
