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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The specification of a report.
 */
@ApiModel(description = "The specification of a report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-06T15:55:13.160613Z[Etc/UTC]")
public class ReportSpec {
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
  private Map<String, Object> params = new HashMap<String, Object>();


  public ReportSpec model(ModelEnum model) {
    
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


  public ReportSpec params(Map<String, Object> params) {
    
    this.params = params;
    return this;
  }

  public ReportSpec putParamsItem(String key, Object paramsItem) {
    this.params.put(key, paramsItem);
    return this;
  }

   /**
   * Parameters used to configure the report. Acceptable values for this property depend on the value specified for &#x60;model&#x60;.
   * @return params
  **/
  @ApiModelProperty(example = "{\"fields\":[\"id\",\"status\"],\"filters\":{\"status\":[\"authorization_failed\"]},\"sort\":[{\"field\":\"captured_at\",\"order\":\"desc\"}]}", required = true, value = "Parameters used to configure the report. Acceptable values for this property depend on the value specified for `model`.")

  public Map<String, Object> getParams() {
    return params;
  }


  public void setParams(Map<String, Object> params) {
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
    ReportSpec reportSpec = (ReportSpec) o;
    return Objects.equals(this.model, reportSpec.model) &&
        Objects.equals(this.params, reportSpec.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportSpec {\n");
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

