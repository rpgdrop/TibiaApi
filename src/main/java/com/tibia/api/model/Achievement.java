
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
    "grade",
    "name",
    "secret"
})
@Generated("jsonschema2pojo")
public class Achievement {

    @JsonProperty("grade")
    private Integer grade;
    @JsonProperty("name")
    private String name;
    @JsonProperty("secret")
    private Boolean secret;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("grade")
    public Integer getGrade() {
        return grade;
    }

    @JsonProperty("grade")
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("secret")
    public Boolean getSecret() {
        return secret;
    }

    @JsonProperty("secret")
    public void setSecret(Boolean secret) {
        this.secret = secret;
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
