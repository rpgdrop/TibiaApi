
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
    "name",
    "world",
    "status",
    "deleted",
    "main",
    "traded"
})
@Generated("jsonschema2pojo")
public class OtherCharacter {

    @JsonProperty("name")
    private String name;
    @JsonProperty("world")
    private String world;
    @JsonProperty("status")
    private String status;
    @JsonProperty("deleted")
    private Boolean deleted;
    @JsonProperty("main")
    private Boolean main;
    @JsonProperty("traded")
    private Boolean traded;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("world")
    public String getWorld() {
        return world;
    }

    @JsonProperty("world")
    public void setWorld(String world) {
        this.world = world;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @JsonProperty("main")
    public Boolean getMain() {
        return main;
    }

    @JsonProperty("main")
    public void setMain(Boolean main) {
        this.main = main;
    }

    @JsonProperty("traded")
    public Boolean getTraded() {
        return traded;
    }

    @JsonProperty("traded")
    public void setTraded(Boolean traded) {
        this.traded = traded;
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
