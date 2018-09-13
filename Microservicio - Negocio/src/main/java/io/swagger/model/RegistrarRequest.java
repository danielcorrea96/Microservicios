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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-02T13:29:47.833Z")

@DynamoDBTable(tableName="negocio")
public class RegistrarRequest   {
  @JsonProperty("idadmin")
  private String idadmin = null;

  @JsonProperty("idnegocio")
  private String idnegocio = null;

  @JsonProperty("nombreempresa")
  private String nombreempresa = null;

  @JsonProperty("tiponegocio")
  private String tiponegocio = null;

  @JsonProperty("nit")
  private String nit = null;

  @JsonProperty("foto")
  private String foto = null;

  @JsonProperty("detalle")
  private String detalle = null;

  @JsonProperty("ubicacion")
  private String ubicacion = null;

  @JsonProperty("correoempresa")
  private String correoempresa = null;
  
  @JsonProperty("latitud")
  private String latitud = null;
  
  @JsonProperty("longitud")
  private String longitud = null;

  public RegistrarRequest idadmin(String idadmin) {
    this.idadmin = idadmin;
    return this;
  }
  
  /**
   * Get latitud
   * @return latitud
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getlatitud() {
    return latitud;
  }

  public void setlatitud(String latitud) {
    this.latitud = latitud;
  }
  
  /**
   * Get longitud
   * @return longitud
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getlongitud() {
    return longitud;
  }

  public void setlongitud(String longitud) {
    this.longitud = longitud;
  }  

  /**
   * Get idadmin
   * @return idadmin
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getIdadmin() {
    return idadmin;
  }

  public void setIdadmin(String idadmin) {
    this.idadmin = idadmin;
  }

  public RegistrarRequest idnegocio(String idnegocio) {
    this.idnegocio = idnegocio;
    return this;
  }

  /**
   * Get idnegocio
   * @return idnegocio
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  
  @DynamoDBHashKey  
  public String getIdnegocio() {
    return idnegocio;
  }

  public void setIdnegocio(String idnegocio) {
    this.idnegocio = idnegocio;
  }

  public RegistrarRequest nombreempresa(String nombreempresa) {
    this.nombreempresa = nombreempresa;
    return this;
  }

  /**
   * Get nombreempresa
   * @return nombreempresa
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getNombreempresa() {
    return nombreempresa;
  }

  public void setNombreempresa(String nombreempresa) {
    this.nombreempresa = nombreempresa;
  }

  public RegistrarRequest tiponegocio(String tiponegocio) {
    this.tiponegocio = tiponegocio;
    return this;
  }

  /**
   * Get tiponegocio
   * @return tiponegocio
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getTiponegocio() {
    return tiponegocio;
  }

  public void setTiponegocio(String tiponegocio) {
    this.tiponegocio = tiponegocio;
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

  public RegistrarRequest correoempresa(String correoempresa) {
    this.correoempresa = correoempresa;
    return this;
  }

  /**
   * Get correoempresa
   * @return correoempresa
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getCorreoempresa() {
    return correoempresa;
  }

  public void setCorreoempresa(String correoempresa) {
    this.correoempresa = correoempresa;
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
    return Objects.equals(this.idadmin, registrarRequest.idadmin) &&
        Objects.equals(this.idnegocio, registrarRequest.idnegocio) &&
        Objects.equals(this.nombreempresa, registrarRequest.nombreempresa) &&
        Objects.equals(this.tiponegocio, registrarRequest.tiponegocio) &&
        Objects.equals(this.nit, registrarRequest.nit) &&
        Objects.equals(this.foto, registrarRequest.foto) &&
        Objects.equals(this.detalle, registrarRequest.detalle) &&
        Objects.equals(this.ubicacion, registrarRequest.ubicacion) &&
        Objects.equals(this.correoempresa, registrarRequest.correoempresa)&&
        Objects.equals(this.latitud, registrarRequest.latitud) &&
        Objects.equals(this.longitud, registrarRequest.longitud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idadmin, idnegocio, nombreempresa, tiponegocio, nit, foto, detalle, ubicacion, correoempresa, longitud, latitud);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrarRequest {\n");
    
    sb.append("    idadmin: ").append(toIndentedString(idadmin)).append("\n");
    sb.append("    idnegocio: ").append(toIndentedString(idnegocio)).append("\n");
    sb.append("    nombreempresa: ").append(toIndentedString(nombreempresa)).append("\n");
    sb.append("    tiponegocio: ").append(toIndentedString(tiponegocio)).append("\n");
    sb.append("    nit: ").append(toIndentedString(nit)).append("\n");
    sb.append("    foto: ").append(toIndentedString(foto)).append("\n");
    sb.append("    detalle: ").append(toIndentedString(detalle)).append("\n");
    sb.append("    ubicacion: ").append(toIndentedString(ubicacion)).append("\n");
    sb.append("    correoempresa: ").append(toIndentedString(correoempresa)).append("\n");
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

