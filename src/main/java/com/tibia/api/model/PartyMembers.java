package com.tibia.api.model;

import java.util.List;

import lombok.Data;

@Data
public class PartyMembers {

	private List<OnlinePlayer> sorcerers;
	private List<OnlinePlayer> druids;
	private List<OnlinePlayer> knights;
	private List<OnlinePlayer> paladins;
}
