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
 * OfertasRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-16T21:27:33.592Z")

@DynamoDBTable(tableName="ofertas")
public class OfertasRequest   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("producto")
  private String producto = null;

  @JsonProperty("detalle")
  private String detalle = null;

  @JsonProperty("valor")
  private String valor = null;

  @JsonProperty("descuento")
  private String descuento = null;

  @JsonProperty("foto")
  private String foto = null;

  @JsonProperty("idnegocio")
  private String idnegocio = null;

  @JsonProperty("fechainicio")
  private String fechainicio = null;

  @JsonProperty("fechafinal")
  private String fechafinal = null;
  
  @JsonProperty("latitud")
  private String latitud = null;
  
  @JsonProperty("longitud")
  private String longitud = null;
  
  @JsonProperty("tipodeoferta")
  private String tipodeoferta = null;
  
  /**
   * Get tipodeoferta
   * @return tipodeoferta
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String gettipodeoferta() {
    return tipodeoferta;
  }
  
  	public OfertasRequest tipodeoferta(String tipodeoferta) {
	    this.tipodeoferta = tipodeoferta;
	    return this;
	  }
  

  public void settipodeoferta(String tipodeoferta) {
    this.tipodeoferta = tipodeoferta;
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
  
  	public OfertasRequest latitud(String latitud) {
	    this.latitud = latitud;
	    return this;
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
  
  public OfertasRequest longitud(String longitud) {
	    this.longitud = longitud;
	    return this;
  }

  public void setlongitud(String longitud) {
    this.longitud = longitud;
  }  

  public OfertasRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBHashKey
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OfertasRequest producto(String producto) {
    this.producto = producto;
    return this;
  }

  /**
   * Get producto
   * @return producto
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public OfertasRequest detalle(String detalle) {
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

  public OfertasRequest valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Get valor
   * @return valor
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public OfertasRequest descuento(String descuento) {
    this.descuento = descuento;
    return this;
  }

  /**
   * Get descuento
   * @return descuento
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getDescuento() {
    return descuento;
  }

  public void setDescuento(String descuento) {
    this.descuento = descuento;
  }

  public OfertasRequest foto(String foto) {
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

  public OfertasRequest idnegocio(String idnegocio) {
    this.idnegocio = idnegocio;
    return this;
  }

  /**
   * Get idnegocio
   * @return idnegocio
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getIdnegocio() {
    return idnegocio;
  }

  public void setIdnegocio(String idnegocio) {
    this.idnegocio = idnegocio;
  }

  public OfertasRequest fechainicio(String fechainicio) {
    this.fechainicio = fechainicio;
    return this;
  }

  /**
   * Get fechainicio
   * @return fechainicio
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getFechainicio() {
    return fechainicio;
  }

  public void setFechainicio(String fechainicio) {
    this.fechainicio = fechainicio;
  }

  public OfertasRequest fechafinal(String fechafinal) {
    this.fechafinal = fechafinal;
    return this;
  }

  /**
   * Get fechafinal
   * @return fechafinal
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
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
    OfertasRequest ofertasRequest = (OfertasRequest) o;
    return Objects.equals(this.id, ofertasRequest.id) &&
        Objects.equals(this.producto, ofertasRequest.producto) &&
        Objects.equals(this.detalle, ofertasRequest.detalle) &&
        Objects.equals(this.valor, ofertasRequest.valor) &&
        Objects.equals(this.descuento, ofertasRequest.descuento) &&
        Objects.equals(this.foto, ofertasRequest.foto) &&
        Objects.equals(this.idnegocio, ofertasRequest.idnegocio) &&
        Objects.equals(this.fechainicio, ofertasRequest.fechainicio) &&
        Objects.equals(this.fechafinal, ofertasRequest.fechafinal)&&
        Objects.equals(this.latitud, ofertasRequest.latitud) &&
        Objects.equals(this.longitud, ofertasRequest.longitud)&&
        Objects.equals(this.tipodeoferta, ofertasRequest.tipodeoferta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, producto, detalle, valor, descuento, foto, idnegocio, fechainicio, fechafinal,longitud, latitud, tipodeoferta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfertasRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    producto: ").append(toIndentedString(producto)).append("\n");
    sb.append("    detalle: ").append(toIndentedString(detalle)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    descuento: ").append(toIndentedString(descuento)).append("\n");
    sb.append("    foto: ").append(toIndentedString(foto)).append("\n");
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

