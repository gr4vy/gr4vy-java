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
import com.gr4vy.api.model.TransactionsReportSpecParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The specification of a transactions report.
 */
@ApiModel(description = "The specification of a transactions report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionsReportSpec {
  /**
   * The model (dataset) that the data used for the report is retrieved from.
   */
  @JsonAdapter(ModelEnum.Adapter.class)
  public enum ModelEnum {
    TRANSACTIONS("transactions");

    private String value;

    ModelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModelEnum fromValue(String value) {
      for (ModelEnum b : ModelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ModelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ModelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private ModelEnum model;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private TransactionsReportSpecParams params;


  public TransactionsReportSpec model(ModelEnum model) {
    
    this.model = model;
    return this;
  }

   /**
   * The model (dataset) that the data used for the report is retrieved from.
   * @return model
  **/
  @ApiModelProperty(example = "transactions", required = true, value = "The model (dataset) that the data used for the report is retrieved from.")

  public ModelEnum getModel() {
    return model;
  }


  public void setModel(ModelEnum model) {
    this.model = model;
  }


  public TransactionsReportSpec params(TransactionsReportSpecParams params) {
    
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(required = true, value = "")

  public TransactionsReportSpecParams getParams() {
    return params;
  }


  public void setParams(TransactionsReportSpecParams params) {
    this.params = params;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsReportSpec transactionsReportSpec = (TransactionsReportSpec) o;
    return Objects.equals(this.model, transactionsReportSpec.model) &&
        Objects.equals(this.params, transactionsReportSpec.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsReportSpec {\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

