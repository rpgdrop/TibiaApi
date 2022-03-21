package com.tibia.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tibia.api.dataprovider.client.TibiaDataApiClient;
import com.tibia.api.model.OnlinePlayer;
import com.tibia.api.model.PartyMembers;
import com.tibia.api.model.TibiaCaracterData;
import com.tibia.api.model.TibiaWorldData;
import com.tibia.api.service.TibiaApiService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TibiaApiServiceImpl implements TibiaApiService{

	@Autowired
	private TibiaDataApiClient tibiaClient;
	
	private ObjectMapper objectMapper = new ObjectMapper();
	
	@Override
	public PartyMembers getParty(String name) {
		
		TibiaCaracterData characterInfo = tibiaClient.getCharacterInfo(name);
		
		TibiaWorldData worldInfo = tibiaClient.getWorldInfo(characterInfo.getCharacters().getCharacter().getWorld());
		
		List<OnlinePlayer> sorcerers = new ArrayList();
		List<OnlinePlayer> druids = new ArrayList();
		List<OnlinePlayer> knights = new ArrayList();
		List<OnlinePlayer> paladins = new ArrayList();
		
		worldInfo.getWorlds().getWorld().getOnlinePlayers().stream().forEach(onlinePlayer -> {
			if(onlinePlayer.getVocation().contains("Sorcerer") && levelRange(characterInfo.getCharacters().getCharacter().getLevel(), onlinePlayer.getLevel())) {
				sorcerers.add(onlinePlayer);
			}
			
			if(onlinePlayer.getVocation().contains("Knight") && levelRange(characterInfo.getCharacters().getCharacter().getLevel(), onlinePlayer.getLevel())) {
				knights.add(onlinePlayer);
			}
			
			if(onlinePlayer.getVocation().contains("Paladin") && levelRange(characterInfo.getCharacters().getCharacter().getLevel(), onlinePlayer.getLevel())) {
				paladins.add(onlinePlayer);
			}
			
			if(onlinePlayer.getVocation().contains("Druid") && levelRange(characterInfo.getCharacters().getCharacter().getLevel(), onlinePlayer.getLevel())) {
				druids.add(onlinePlayer);
			}
		});
		
		PartyMembers pm = new PartyMembers();
		
		pm.setDruids(druids);
		pm.setKnights(knights);
		pm.setPaladins(paladins);
		pm.setSorcerers(sorcerers);
				
		return pm;
	}
	
	private Boolean levelRange(Long levelPlayer, Long levelCharcterInWorld) {
		
		if(((levelPlayer/3)*2) < levelCharcterInWorld  && ((levelPlayer/2 )*3) > levelCharcterInWorld) {
			return true;
		}		
		return false;
	}

	@Override
	public PartyMembers getPartyEspecificVocation(String name, String vocation) {
		TibiaCaracterData characterInfo = tibiaClient.getCharacterInfo(name);
		
		TibiaWorldData worldInfo = tibiaClient.getWorldInfo(characterInfo.getCharacters().getCharacter().getWorld());
		
		List<OnlinePlayer> players = new ArrayList();
		
		worldInfo.getWorlds().getWorld().getOnlinePlayers().stream().forEach(onlinePlayer -> {
			if(onlinePlayer.getVocation().contains(vocation) && levelRange(characterInfo.getCharacters().getCharacter().getLevel(), onlinePlayer.getLevel())) {
				players.add(onlinePlayer);
			}
			
		});
		
		PartyMembers pm = new PartyMembers();
		
		pm.setDruids(players);
				
		return pm;
	}

}
