
package com.tibia.api.model;

import java.util.HashMap;
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
    "time",
    "level",
    "killers",
    "assists",
    "reason"
})
@Generated("jsonschema2pojo")
public class Death {

    @JsonProperty("time")
    private String time;
    @JsonProperty("level")
    private Long level;
    @JsonProperty("killers")
    private List<Killer> killers = null;
    @JsonProperty("assists")
    private List<Object> assists = null;
    @JsonProperty("reason")
    private String reason;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("level")
    public Long getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(Long level) {
        this.level = level;
    }

    @JsonProperty("killers")
    public List<Killer> getKillers() {
        return killers;
    }

    @JsonProperty("killers")
    public void setKillers(List<Killer> killers) {
        this.killers = killers;
    }

    @JsonProperty("assists")
    public List<Object> getAssists() {
        return assists;
    }

    @JsonProperty("assists")
    public void setAssists(List<Object> assists) {
        this.assists = assists;
    }

    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
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
