
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
    "error",
    "http_code",
    "message"
})
@Generated("jsonschema2pojo")
public class Status {

    @JsonProperty("error")
    private Integer error;
    @JsonProperty("http_code")
    private Integer httpCode;
    @JsonProperty("message")
    private String message;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("error")
    public Integer getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Integer error) {
        this.error = error;
    }

    @JsonProperty("http_code")
    public Integer getHttpCode() {
        return httpCode;
    }

    @JsonProperty("http_code")
    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
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
