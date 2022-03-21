
package com.tibia.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "characters",
    "information"
})
@Generated("jsonschema2pojo")
public class TibiaCaracterData {

    @JsonProperty("characters")
    private Characters characters;
    @JsonProperty("information")
    private Information information;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("characters")
    public Characters getCharacters() {
        return characters;
    }

    @JsonProperty("characters")
    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    @JsonProperty("information")
    public Information getInformation() {
        return information;
    }

    @JsonProperty("information")
    public void setInformation(Information information) {
        this.information = information;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
