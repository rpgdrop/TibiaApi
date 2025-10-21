
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
    "battleye_date",
    "battleye_protected",
    "creation_date",
    "game_world_type",
    "location",
    "name",
    "online_players",
    "players_online",
    "premium_only",
    "pvp_type",
    "record_date",
    "record_players",
    "status",
    "tournament_world_type",
    "transfer_type",
    "world_quest_titles"
})
@Generated("jsonschema2pojo")
public class World {

    @JsonProperty("battleye_date")
    private String battleyeDate;
    @JsonProperty("battleye_protected")
    private Boolean battleyeProtected;
    @JsonProperty("creation_date")
    private String creationDate;
    @JsonProperty("game_world_type")
    private String gameWorldType;
    @JsonProperty("location")
    private String location;
    @JsonProperty("name")
    private String name;
    @JsonProperty("online_players")
    private List<OnlinePlayer> onlinePlayers;
    @JsonProperty("players_online")
    private Integer playersOnline;
    @JsonProperty("premium_only")
    private Boolean premiumOnly;
    @JsonProperty("pvp_type")
    private String pvpType;
    @JsonProperty("record_date")
    private String recordDate;
    @JsonProperty("record_players")
    private Integer recordPlayers;
    @JsonProperty("status")
    private String status;
    @JsonProperty("tournament_world_type")
    private String tournamentWorldType;
    @JsonProperty("transfer_type")
    private String transferType;
    @JsonProperty("world_quest_titles")
    private List<String> worldQuestTitles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("battleye_date")
    public String getBattleyeDate() {
        return battleyeDate;
    }

    @JsonProperty("battleye_date")
    public void setBattleyeDate(String battleyeDate) {
        this.battleyeDate = battleyeDate;
    }

    @JsonProperty("battleye_protected")
    public Boolean getBattleyeProtected() {
        return battleyeProtected;
    }

    @JsonProperty("battleye_protected")
    public void setBattleyeProtected(Boolean battleyeProtected) {
        this.battleyeProtected = battleyeProtected;
    }

    @JsonProperty("creation_date")
    public String getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creation_date")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("game_world_type")
    public String getGameWorldType() {
        return gameWorldType;
    }

    @JsonProperty("game_world_type")
    public void setGameWorldType(String gameWorldType) {
        this.gameWorldType = gameWorldType;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("online_players")
    public List<OnlinePlayer> getOnlinePlayers() {
        return onlinePlayers;
    }

    @JsonProperty("online_players")
    public void setOnlinePlayers(List<OnlinePlayer> onlinePlayers) {
        this.onlinePlayers = onlinePlayers;
    }

    @JsonProperty("players_online")
    public Integer getPlayersOnline() {
        return playersOnline;
    }

    @JsonProperty("players_online")
    public void setPlayersOnline(Integer playersOnline) {
        this.playersOnline = playersOnline;
    }

    @JsonProperty("premium_only")
    public Boolean getPremiumOnly() {
        return premiumOnly;
    }

    @JsonProperty("premium_only")
    public void setPremiumOnly(Boolean premiumOnly) {
        this.premiumOnly = premiumOnly;
    }

    @JsonProperty("pvp_type")
    public String getPvpType() {
        return pvpType;
    }

    @JsonProperty("pvp_type")
    public void setPvpType(String pvpType) {
        this.pvpType = pvpType;
    }

    @JsonProperty("record_date")
    public String getRecordDate() {
        return recordDate;
    }

    @JsonProperty("record_date")
    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    @JsonProperty("record_players")
    public Integer getRecordPlayers() {
        return recordPlayers;
    }

    @JsonProperty("record_players")
    public void setRecordPlayers(Integer recordPlayers) {
        this.recordPlayers = recordPlayers;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("tournament_world_type")
    public String getTournamentWorldType() {
        return tournamentWorldType;
    }

    @JsonProperty("tournament_world_type")
    public void setTournamentWorldType(String tournamentWorldType) {
        this.tournamentWorldType = tournamentWorldType;
    }

    @JsonProperty("transfer_type")
    public String getTransferType() {
        return transferType;
    }

    @JsonProperty("transfer_type")
    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    @JsonProperty("world_quest_titles")
    public List<String> getWorldQuestTitles() {
        return worldQuestTitles;
    }

    @JsonProperty("world_quest_titles")
    public void setWorldQuestTitles(List<String> worldQuestTitles) {
        this.worldQuestTitles = worldQuestTitles;
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
