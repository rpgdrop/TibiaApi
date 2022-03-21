
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
    "grade",
    "secret"
})
@Generated("jsonschema2pojo")
public class Achievement {

    @JsonProperty("name")
    private String name;
    @JsonProperty("grade")
    private Long grade;
    @JsonProperty("secret")
    private Boolean secret;
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

    @JsonProperty("grade")
    public Long getGrade() {
        return grade;
    }

    @JsonProperty("grade")
    public void setGrade(Long grade) {
        this.grade = grade;
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
