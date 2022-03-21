
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
    "sex",
    "title",
    "unlocked_titles",
    "vocation",
    "level",
    "achievement_points",
    "world",
    "residence",
    "guild",
    "last_login",
    "account_status"
})
@Generated("jsonschema2pojo")
public class Character {

    @JsonProperty("name")
    private String name;
    @JsonProperty("sex")
    private String sex;
    @JsonProperty("title")
    private String title;
    @JsonProperty("unlocked_titles")
    private Long unlockedTitles;
    @JsonProperty("vocation")
    private String vocation;
    @JsonProperty("level")
    private Long level;
    @JsonProperty("achievement_points")
    private Long achievementPoints;
    @JsonProperty("world")
    private String world;
    @JsonProperty("residence")
    private String residence;
    @JsonProperty("guild")
    private Guild guild;
    @JsonProperty("last_login")
    private String lastLogin;
    @JsonProperty("account_status")
    private String accountStatus;
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

    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    @JsonProperty("sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("unlocked_titles")
    public Long getUnlockedTitles() {
        return unlockedTitles;
    }

    @JsonProperty("unlocked_titles")
    public void setUnlockedTitles(Long unlockedTitles) {
        this.unlockedTitles = unlockedTitles;
    }

    @JsonProperty("vocation")
    public String getVocation() {
        return vocation;
    }

    @JsonProperty("vocation")
    public void setVocation(String vocation) {
        this.vocation = vocation;
    }

    @JsonProperty("level")
    public Long getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(Long level) {
        this.level = level;
    }

    @JsonProperty("achievement_points")
    public Long getAchievementPoints() {
        return achievementPoints;
    }

    @JsonProperty("achievement_points")
    public void setAchievementPoints(Long achievementPoints) {
        this.achievementPoints = achievementPoints;
    }

    @JsonProperty("world")
    public String getWorld() {
        return world;
    }

    @JsonProperty("world")
    public void setWorld(String world) {
        this.world = world;
    }

    @JsonProperty("residence")
    public String getResidence() {
        return residence;
    }

    @JsonProperty("residence")
    public void setResidence(String residence) {
        this.residence = residence;
    }

    @JsonProperty("guild")
    public Guild getGuild() {
        return guild;
    }

    @JsonProperty("guild")
    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    @JsonProperty("last_login")
    public String getLastLogin() {
        return lastLogin;
    }

    @JsonProperty("last_login")
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    @JsonProperty("account_status")
    public String getAccountStatus() {
        return accountStatus;
    }

    @JsonProperty("account_status")
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
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
