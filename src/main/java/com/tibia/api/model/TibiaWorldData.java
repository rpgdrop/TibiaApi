
package com.tibia.api.model;

import java.util.LinkedHashMap;
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
    "information",
    "world"
})
@Generated("jsonschema2pojo")
public class TibiaWorldData {

    @JsonProperty("information")
    private Information information;
    @JsonProperty("world")
    private World world;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("information")
    public Information getInformation() {
        return information;
    }

    @JsonProperty("information")
    public void setInformation(Information information) {
        this.information = information;
    }

    @JsonProperty("world")
    public World getWorld() {
        return world;
    }

    @JsonProperty("world")
    public void setWorld(World world) {
        this.world = world;
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
