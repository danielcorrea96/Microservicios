package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JsonApiBodyResponseSuccess
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-16T21:27:33.592Z")

public class JsonApiBodyResponseSuccess   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("producto")
  private String producto = null;

  @JsonProperty("idnegocio")
  private String idnegocio = null;

  @JsonProperty("fechainicio")
  private String fechainicio = null;

  @JsonProperty("fechafinal")
  private String fechafinal = null;

  public JsonApiBodyResponseSuccess id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public JsonApiBodyResponseSuccess producto(String producto) {
    this.producto = producto;
    return this;
  }

  /**
   * Get producto
   * @return producto
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public JsonApiBodyResponseSuccess idnegocio(String idnegocio) {
    this.idnegocio = idnegocio;
    return this;
  }

  /**
   * Get idnegocio
   * @return idnegocio
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getIdnegocio() {
    return idnegocio;
  }

  public void setIdnegocio(String idnegocio) {
    this.idnegocio = idnegocio;
  }

  public JsonApiBodyResponseSuccess fechainicio(String fechainicio) {
    this.fechainicio = fechainicio;
    return this;
  }

  /**
   * Get fechainicio
   * @return fechainicio
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFechainicio() {
    return fechainicio;
  }

  public void setFechainicio(String fechainicio) {
    this.fechainicio = fechainicio;
  }

  public JsonApiBodyResponseSuccess fechafinal(String fechafinal) {
    this.fechafinal = fechafinal;
    return this;
  }

  /**
   * Get fechafinal
   * @return fechafinal
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFechafinal() {
    return fechafinal;
  }

  public void setFechafinal(String fechafinal) {
    this.fechafinal = fechafinal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonApiBodyResponseSuccess jsonApiBodyResponseSuccess = (JsonApiBodyResponseSuccess) o;
    return Objects.equals(this.id, jsonApiBodyResponseSuccess.id) &&
        Objects.equals(this.producto, jsonApiBodyResponseSuccess.producto) &&
        Objects.equals(this.idnegocio, jsonApiBodyResponseSuccess.idnegocio) &&
        Objects.equals(this.fechainicio, jsonApiBodyResponseSuccess.fechainicio) &&
        Objects.equals(this.fechafinal, jsonApiBodyResponseSuccess.fechafinal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, producto, idnegocio, fechainicio, fechafinal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiBodyResponseSuccess {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    producto: ").append(toIndentedString(producto)).append("\n");
    sb.append("    idnegocio: ").append(toIndentedString(idnegocio)).append("\n");
    sb.append("    fechainicio: ").append(toIndentedString(fechainicio)).append("\n");
    sb.append("    fechafinal: ").append(toIndentedString(fechafinal)).append("\n");
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

