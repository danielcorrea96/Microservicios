package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OfertasRequest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JsonApiBodyRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-16T21:27:33.592Z")

public class JsonApiBodyRequest   {
  @JsonProperty("ofertas")
  @Valid
  private List<OfertasRequest> ofertas;

  public JsonApiBodyRequest ofertas(List<OfertasRequest> ofertas) {
    this.ofertas = ofertas;
    return this;
  }

  public JsonApiBodyRequest addOfertasItem(OfertasRequest ofertasItem) {
    this.ofertas.add(ofertasItem);
    return this;
  }

  /**
   * Get ofertas
   * @return ofertas
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<OfertasRequest> getOfertas() {
    return ofertas;
  }

  public void setOfertas(List<OfertasRequest> ofertas) {
    this.ofertas = ofertas;
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
    return Objects.equals(this.ofertas, jsonApiBodyRequest.ofertas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ofertas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiBodyRequest {\n");
    
    sb.append("    ofertas: ").append(toIndentedString(ofertas)).append("\n");
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

