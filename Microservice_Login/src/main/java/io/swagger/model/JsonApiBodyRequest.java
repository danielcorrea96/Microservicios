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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-06T15:43:13.859Z")

public class JsonApiBodyRequest   {
  @JsonProperty("persona")
  @Valid
  private List<RegistrarRequest> persona;

  public JsonApiBodyRequest persona(List<RegistrarRequest> persona) {
    this.persona = persona;
    return this;
  }

  public JsonApiBodyRequest addPersonaItem(RegistrarRequest personaItem) {
    if (this.persona == null) {
      this.persona = new ArrayList<RegistrarRequest>();
    }
    this.persona.add(personaItem);
    return this;
  }

  /**
   * Get persona
   * @return persona
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RegistrarRequest> getPersona() {
    return persona;
  }

  public void setPersona(List<RegistrarRequest> persona) {
    this.persona = persona;
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
    return Objects.equals(this.persona, jsonApiBodyRequest.persona);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persona);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiBodyRequest {\n");
    
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
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

