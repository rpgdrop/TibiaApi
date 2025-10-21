
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
    "houseid",
    "name",
    "paid",
    "town"
})
@Generated("jsonschema2pojo")
public class House {

    @JsonProperty("houseid")
    private Integer houseid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("paid")
    private String paid;
    @JsonProperty("town")
    private String town;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("houseid")
    public Integer getHouseid() {
        return houseid;
    }

    @JsonProperty("houseid")
    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("paid")
    public String getPaid() {
        return paid;
    }

    @JsonProperty("paid")
    public void setPaid(String paid) {
        this.paid = paid;
    }

    @JsonProperty("town")
    public String getTown() {
        return town;
    }

    @JsonProperty("town")
    public void setTown(String town) {
        this.town = town;
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
