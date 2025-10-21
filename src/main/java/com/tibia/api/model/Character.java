
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
    "account_badges",
    "account_information",
    "achievements",
    "character",
    "deaths",
    "deaths_truncated",
    "other_characters"
})
@Generated("jsonschema2pojo")
public class Character {

    @JsonProperty("account_badges")
    private List<AccountBadge> accountBadges;
    @JsonProperty("account_information")
    private AccountInformation accountInformation;
    @JsonProperty("achievements")
    private List<Achievement> achievements;
    @JsonProperty("character")
    private Character__1 character;
    @JsonProperty("deaths")
    private List<Death> deaths;
    @JsonProperty("deaths_truncated")
    private Boolean deathsTruncated;
    @JsonProperty("other_characters")
    private List<OtherCharacter> otherCharacters;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("account_badges")
    public List<AccountBadge> getAccountBadges() {
        return accountBadges;
    }

    @JsonProperty("account_badges")
    public void setAccountBadges(List<AccountBadge> accountBadges) {
        this.accountBadges = accountBadges;
    }

    @JsonProperty("account_information")
    public AccountInformation getAccountInformation() {
        return accountInformation;
    }

    @JsonProperty("account_information")
    public void setAccountInformation(AccountInformation accountInformation) {
        this.accountInformation = accountInformation;
    }

    @JsonProperty("achievements")
    public List<Achievement> getAchievements() {
        return achievements;
    }

    @JsonProperty("achievements")
    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    @JsonProperty("character")
    public Character__1 getCharacter() {
        return character;
    }

    @JsonProperty("character")
    public void setCharacter(Character__1 character) {
        this.character = character;
    }

    @JsonProperty("deaths")
    public List<Death> getDeaths() {
        return deaths;
    }

    @JsonProperty("deaths")
    public void setDeaths(List<Death> deaths) {
        this.deaths = deaths;
    }

    @JsonProperty("deaths_truncated")
    public Boolean getDeathsTruncated() {
        return deathsTruncated;
    }

    @JsonProperty("deaths_truncated")
    public void setDeathsTruncated(Boolean deathsTruncated) {
        this.deathsTruncated = deathsTruncated;
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
