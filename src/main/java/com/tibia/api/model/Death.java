
package com.tibia.api.model;

import java.util.LinkedHashMap;
import java.util.List;
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
    "assists",
    "killers",
    "level",
    "reason",
    "time"
})
@Generated("jsonschema2pojo")
public class Death {

    @JsonProperty("assists")
    private List<Assist> assists;
    @JsonProperty("killers")
    private List<Killer> killers;
    @JsonProperty("level")
    private Integer level;
    @JsonProperty("reason")
    private String reason;
    @JsonProperty("time")
    private String time;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("assists")
    public List<Assist> getAssists() {
        return assists;
    }

    @JsonProperty("assists")
    public void setAssists(List<Assist> assists) {
        this.assists = assists;
    }

    @JsonProperty("killers")
    public List<Killer> getKillers() {
        return killers;
    }

    @JsonProperty("killers")
    public void setKillers(List<Killer> killers) {
        this.killers = killers;
    }

    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
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
