
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
    "character",
    "achievements",
    "deaths",
    "account_information",
    "other_characters"
})
@Generated("jsonschema2pojo")
public class Characters {

    @JsonProperty("character")
    private Character character;
    @JsonProperty("achievements")
    private List<Achievement> achievements = null;
    @JsonProperty("deaths")
    private List<Death> deaths = null;
    @JsonProperty("account_information")
    private AccountInformation accountInformation;
    @JsonProperty("other_characters")
    private List<OtherCharacter> otherCharacters = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("character")
    public Character getCharacter() {
        return character;
    }

    @JsonProperty("character")
    public void setCharacter(Character character) {
        this.character = character;
    }

    @JsonProperty("achievements")
    public List<Achievement> getAchievements() {
        return achievements;
    }

    @JsonProperty("achievements")
    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    @JsonProperty("deaths")
    public List<Death> getDeaths() {
        return deaths;
    }

    @JsonProperty("deaths")
    public void setDeaths(List<Death> deaths) {
        this.deaths = deaths;
    }

    @JsonProperty("account_information")
    public AccountInformation getAccountInformation() {
        return accountInformation;
    }

    @JsonProperty("account_information")
    public void setAccountInformation(AccountInformation accountInformation) {
        this.accountInformation = accountInformation;
    }

    @JsonProperty("other_characters")
    public List<OtherCharacter> getOtherCharacters() {
        return otherCharacters;
    }

    @JsonProperty("other_characters")
    public void setOtherCharacters(List<OtherCharacter> otherCharacters) {
        this.otherCharacters = otherCharacters;
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
