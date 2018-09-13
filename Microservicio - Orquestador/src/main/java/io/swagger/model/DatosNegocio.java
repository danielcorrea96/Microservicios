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
 * DatosNegocio
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-10T20:41:16.454Z")

public class DatosNegocio   {
  @JsonProperty("id_negocio")
  private String idNegocio = null;

  @JsonProperty("nombre_negocio")
  private String nombreNegocio = null;

  @JsonProperty("nit")
  private String nit = null;

  @JsonProperty("foto")
  private String foto = null;

  @JsonProperty("detalle")
  private String detalle = null;

  @JsonProperty("ubicacion")
  private String ubicacion = null;

  @JsonProperty("categoria")
  private String categoria = null;

  public DatosNegocio idNegocio(String idNegocio) {
    this.idNegocio = idNegocio;
    return this;
  }

  /**
   * Get idNegocio
   * @return idNegocio
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getIdNegocio() {
    return idNegocio;
  }

  public void setIdNegocio(String idNegocio) {
    this.idNegocio = idNegocio;
  }

  public DatosNegocio nombreNegocio(String nombreNegocio) {
    this.nombreNegocio = nombreNegocio;
    return this;
  }

  /**
   * Get nombreNegocio
   * @return nombreNegocio
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNombreNegocio() {
    return nombreNegocio;
  }

  public void setNombreNegocio(String nombreNegocio) {
    this.nombreNegocio = nombreNegocio;
  }

  public DatosNegocio nit(String nit) {
    this.nit = nit;
    return this;
  }

  /**
   * Get nit
   * @return nit
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNit() {
    return nit;
  }

  public void setNit(String nit) {
    this.nit = nit;
  }

  public DatosNegocio foto(String foto) {
    this.foto = foto;
    return this;
  }

  /**
   * Get foto
   * @return foto
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFoto() {
    return foto;
  }

  public void setFoto(String foto) {
    this.foto = foto;
  }

  public DatosNegocio detalle(String detalle) {
    this.detalle = detalle;
    return this;
  }

  /**
   * Get detalle
   * @return detalle
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDetalle() {
    return detalle;
  }

  public void setDetalle(String detalle) {
    this.detalle = detalle;
  }

  public DatosNegocio ubicacion(String ubicacion) {
    this.ubicacion = ubicacion;
    return this;
  }

  /**
   * Get ubicacion
   * @return ubicacion
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUbicacion() {
    return ubicacion;
  }

  public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
  }

  public DatosNegocio categoria(String categoria) {
    this.categoria = categoria;
    return this;
  }

  /**
   * Get categoria
   * @return categoria
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatosNegocio datosNegocio = (DatosNegocio) o;
    return Objects.equals(this.idNegocio, datosNegocio.idNegocio) &&
        Objects.equals(this.nombreNegocio, datosNegocio.nombreNegocio) &&
        Objects.equals(this.nit, datosNegocio.nit) &&
        Objects.equals(this.foto, datosNegocio.foto) &&
        Objects.equals(this.detalle, datosNegocio.detalle) &&
        Objects.equals(this.ubicacion, datosNegocio.ubicacion) &&
        Objects.equals(this.categoria, datosNegocio.categoria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idNegocio, nombreNegocio, nit, foto, detalle, ubicacion, categoria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatosNegocio {\n");
    
    sb.append("    idNegocio: ").append(toIndentedString(idNegocio)).append("\n");
    sb.append("    nombreNegocio: ").append(toIndentedString(nombreNegocio)).append("\n");
    sb.append("    nit: ").append(toIndentedString(nit)).append("\n");
    sb.append("    foto: ").append(toIndentedString(foto)).append("\n");
    sb.append("    detalle: ").append(toIndentedString(detalle)).append("\n");
    sb.append("    ubicacion: ").append(toIndentedString(ubicacion)).append("\n");
    sb.append("    categoria: ").append(toIndentedString(categoria)).append("\n");
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

