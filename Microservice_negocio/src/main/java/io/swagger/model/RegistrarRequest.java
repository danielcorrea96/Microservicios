package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegistrarRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-01T20:34:13.321Z")

@DynamoDBTable(tableName="negocio")	

public class RegistrarRequest   {
  @JsonProperty("idadmin")
  private String idAdmin = null;

  @JsonProperty("idnegocio")
  private String idNegocio = null;

  @JsonProperty("nombreempresa")
  private String nombreEmpresa = null;

  @JsonProperty("tiponegocio")
  private String tipoNegocio = null;

  @JsonProperty("nit")
  private String nit = null;

  @JsonProperty("foto")
  private String foto = null;

  @JsonProperty("detalle")
  private String detalle = null;

  @JsonProperty("ubicacion")
  private String ubicacion = null;

  @JsonProperty("correo_empresa")
  private String correoEmpresa = null;

  public RegistrarRequest idAdmin(String idAdmin) {
    this.idAdmin = idAdmin;
    return this;
  }

  /**
   * Get idAdmin
   * @return idAdmin
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBHashKey
  public String getIdAdmin() {
    return idAdmin;
  }

  public void setIdAdmin(String idAdmin) {
    this.idAdmin = idAdmin;
  }

  public RegistrarRequest idNegocio(String idNegocio) {
    this.idNegocio = idNegocio;
    return this;
  }

  /**
   * Get idNegocio
   * @return idNegocio
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getIdNegocio() {
    return idNegocio;
  }

  public void setIdNegocio(String idNegocio) {
    this.idNegocio = idNegocio;
  }

  public RegistrarRequest nombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
    return this;
  }

  /**
   * Get nombreEmpresa
   * @return nombreEmpresa
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getNombreEmpresa() {
    return nombreEmpresa;
  }

  public void setNombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
  }

  public RegistrarRequest tipoNegocio(String tipoNegocio) {
    this.tipoNegocio = tipoNegocio;
    return this;
  }

  /**
   * Get tipoNegocio
   * @return tipoNegocio
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getTipoNegocio() {
    return tipoNegocio;
  }

  public void setTipoNegocio(String tipoNegocio) {
    this.tipoNegocio = tipoNegocio;
  }

  public RegistrarRequest nit(String nit) {
    this.nit = nit;
    return this;
  }

  /**
   * Get nit
   * @return nit
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getNit() {
    return nit;
  }

  public void setNit(String nit) {
    this.nit = nit;
  }

  public RegistrarRequest foto(String foto) {
    this.foto = foto;
    return this;
  }

  /**
   * Get foto
   * @return foto
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getFoto() {
    return foto;
  }

  public void setFoto(String foto) {
    this.foto = foto;
  }

  public RegistrarRequest detalle(String detalle) {
    this.detalle = detalle;
    return this;
  }

  /**
   * Get detalle
   * @return detalle
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getDetalle() {
    return detalle;
  }

  public void setDetalle(String detalle) {
    this.detalle = detalle;
  }

  public RegistrarRequest ubicacion(String ubicacion) {
    this.ubicacion = ubicacion;
    return this;
  }

  /**
   * Get ubicacion
   * @return ubicacion
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getUbicacion() {
    return ubicacion;
  }

  public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
  }

  public RegistrarRequest correoEmpresa(String correoEmpresa) {
    this.correoEmpresa = correoEmpresa;
    return this;
  }

  /**
   * Get correoEmpresa
   * @return correoEmpresa
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getCorreoEmpresa() {
    return correoEmpresa;
  }

  public void setCorreoEmpresa(String correoEmpresa) {
    this.correoEmpresa = correoEmpresa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrarRequest registrarRequest = (RegistrarRequest) o;
    return Objects.equals(this.idAdmin, registrarRequest.idAdmin) &&
        Objects.equals(this.idNegocio, registrarRequest.idNegocio) &&
        Objects.equals(this.nombreEmpresa, registrarRequest.nombreEmpresa) &&
        Objects.equals(this.tipoNegocio, registrarRequest.tipoNegocio) &&
        Objects.equals(this.nit, registrarRequest.nit) &&
        Objects.equals(this.foto, registrarRequest.foto) &&
        Objects.equals(this.detalle, registrarRequest.detalle) &&
        Objects.equals(this.ubicacion, registrarRequest.ubicacion) &&
        Objects.equals(this.correoEmpresa, registrarRequest.correoEmpresa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAdmin, idNegocio, nombreEmpresa, tipoNegocio, nit, foto, detalle, ubicacion, correoEmpresa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrarRequest {\n");
    
    sb.append("    idAdmin: ").append(toIndentedString(idAdmin)).append("\n");
    sb.append("    idNegocio: ").append(toIndentedString(idNegocio)).append("\n");
    sb.append("    nombreEmpresa: ").append(toIndentedString(nombreEmpresa)).append("\n");
    sb.append("    tipoNegocio: ").append(toIndentedString(tipoNegocio)).append("\n");
    sb.append("    nit: ").append(toIndentedString(nit)).append("\n");
    sb.append("    foto: ").append(toIndentedString(foto)).append("\n");
    sb.append("    detalle: ").append(toIndentedString(detalle)).append("\n");
    sb.append("    ubicacion: ").append(toIndentedString(ubicacion)).append("\n");
    sb.append("    correoEmpresa: ").append(toIndentedString(correoEmpresa)).append("\n");
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

