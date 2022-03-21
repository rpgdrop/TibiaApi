
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
    "player",
    "traded",
    "summon"
})
@Generated("jsonschema2pojo")
public class Killer {

    @JsonProperty("name")
    private String name;
    @JsonProperty("player")
    private Boolean player;
    @JsonProperty("traded")
    private Boolean traded;
    @JsonProperty("summon")
    private String summon;
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

    @JsonProperty("player")
    public Boolean getPlayer() {
        return player;
    }

    @JsonProperty("player")
    public void setPlayer(Boolean player) {
        this.player = player;
    }

    @JsonProperty("traded")
    public Boolean getTraded() {
        return traded;
    }

    @JsonProperty("traded")
    public void setTraded(Boolean traded) {
        this.traded = traded;
    }

    @JsonProperty("summon")
    public String getSummon() {
        return summon;
    }

    @JsonProperty("summon")
    public void setSummon(String summon) {
        this.summon = summon;
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
