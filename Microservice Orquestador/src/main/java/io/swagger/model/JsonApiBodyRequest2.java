package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RegistrarRequest2;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JsonApiBodyRequest2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-24T20:36:36.275Z")

public class JsonApiBodyRequest2   {
  @JsonProperty("persona")
  @Valid
  private List<RegistrarRequest2> persona;

  public JsonApiBodyRequest2 persona(List<RegistrarRequest2> persona) {
    this.persona = persona;
    return this;
  }

  public JsonApiBodyRequest2 addPersonaItem(RegistrarRequest2 personaItem) {
    this.persona.add(personaItem);
    return this;
  }

  /**
   * Get persona
   * @return persona
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<RegistrarRequest2> getPersona() {
    return persona;
  }

  public void setPersona(List<RegistrarRequest2> persona) {
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
    JsonApiBodyRequest2 jsonApiBodyRequest2 = (JsonApiBodyRequest2) o;
    return Objects.equals(this.persona, jsonApiBodyRequest2.persona);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persona);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiBodyRequest2 {\n");
    
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

