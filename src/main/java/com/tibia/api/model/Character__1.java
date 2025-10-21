
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
    "account_status",
    "achievement_points",
    "comment",
    "deletion_date",
    "former_names",
    "former_worlds",
    "guild",
    "houses",
    "last_login",
    "level",
    "married_to",
    "name",
    "position",
    "residence",
    "sex",
    "title",
    "traded",
    "unlocked_titles",
    "vocation",
    "world"
})
@Generated("jsonschema2pojo")
public class Character__1 {

    @JsonProperty("account_status")
    private String accountStatus;
    @JsonProperty("achievement_points")
    private Integer achievementPoints;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("deletion_date")
    private String deletionDate;
    @JsonProperty("former_names")
    private List<String> formerNames;
    @JsonProperty("former_worlds")
    private List<String> formerWorlds;
    @JsonProperty("guild")
    private Guild guild;
    @JsonProperty("houses")
    private List<House> houses;
    @JsonProperty("last_login")
    private String lastLogin;
    @JsonProperty("level")
    private Long level;
    @JsonProperty("married_to")
    private String marriedTo;
    @JsonProperty("name")
    private String name;
    @JsonProperty("position")
    private String position;
    @JsonProperty("residence")
    private String residence;
    @JsonProperty("sex")
    private String sex;
    @JsonProperty("title")
    private String title;
    @JsonProperty("traded")
    private Boolean traded;
    @JsonProperty("unlocked_titles")
    private Integer unlockedTitles;
    @JsonProperty("vocation")
    private String vocation;
    @JsonProperty("world")
    private String world;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("account_status")
    public String getAccountStatus() {
        return accountStatus;
    }

    @JsonProperty("account_status")
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @JsonProperty("achievement_points")
    public Integer getAchievementPoints() {
        return achievementPoints;
    }

    @JsonProperty("achievement_points")
    public void setAchievementPoints(Integer achievementPoints) {
        this.achievementPoints = achievementPoints;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("deletion_date")
    public String getDeletionDate() {
        return deletionDate;
    }

    @JsonProperty("deletion_date")
    public void setDeletionDate(String deletionDate) {
        this.deletionDate = deletionDate;
    }

    @JsonProperty("former_names")
    public List<String> getFormerNames() {
        return formerNames;
    }

    @JsonProperty("former_names")
    public void setFormerNames(List<String> formerNames) {
        this.formerNames = formerNames;
    }

    @JsonProperty("former_worlds")
    public List<String> getFormerWorlds() {
        return formerWorlds;
    }

    @JsonProperty("former_worlds")
    public void setFormerWorlds(List<String> formerWorlds) {
        this.formerWorlds = formerWorlds;
    }

    @JsonProperty("guild")
    public Guild getGuild() {
        return guild;
    }

    @JsonProperty("guild")
    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    @JsonProperty("houses")
    public List<House> getHouses() {
        return houses;
    }

    @JsonProperty("houses")
    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    @JsonProperty("last_login")
    public String getLastLogin() {
        return lastLogin;
    }

    @JsonProperty("last_login")
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    @JsonProperty("level")
    public Long getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(Long level) {
        this.level = level;
    }

    @JsonProperty("married_to")
    public String getMarriedTo() {
        return marriedTo;
    }

    @JsonProperty("married_to")
    public void setMarriedTo(String marriedTo) {
        this.marriedTo = marriedTo;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    @JsonProperty("residence")
    public String getResidence() {
        return residence;
    }

    @JsonProperty("residence")
    public void setResidence(String residence) {
        this.residence = residence;
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

    @JsonProperty("traded")
    public Boolean getTraded() {
        return traded;
    }

    @JsonProperty("traded")
    public void setTraded(Boolean traded) {
        this.traded = traded;
    }

    @JsonProperty("unlocked_titles")
    public Integer getUnlockedTitles() {
        return unlockedTitles;
    }

    @JsonProperty("unlocked_titles")
    public void setUnlockedTitles(Integer unlockedTitles) {
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

    @JsonProperty("world")
    public String getWorld() {
        return world;
    }

    @JsonProperty("world")
    public void setWorld(String world) {
        this.world = world;
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
