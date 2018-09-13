package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RegistrarRequest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JsonApiBodyRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-24T20:36:36.275Z")

public class JsonApiBodyRequest   {
  @JsonProperty("negocios")
  @Valid
  private List<RegistrarRequest> negocios;

  public JsonApiBodyRequest negocios(List<RegistrarRequest> negocios) {
    this.negocios = negocios;
    return this;
  }

  public JsonApiBodyRequest addNegociosItem(RegistrarRequest negociosItem) {
    this.negocios.add(negociosItem);
    return this;
  }

  /**
   * Get negocios
   * @return negocios
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<RegistrarRequest> getNegocios() {
    return negocios;
  }

  public void setNegocios(List<RegistrarRequest> negocios) {
    this.negocios = negocios;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonApiBodyRequest jsonApiBodyRequest = (JsonApiBodyRequest) o;
    return Objects.equals(this.negocios, jsonApiBodyRequest.negocios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negocios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiBodyRequest {\n");
    
    sb.append("    negocios: ").append(toIndentedString(negocios)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

