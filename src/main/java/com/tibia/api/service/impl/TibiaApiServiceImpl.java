package com.tibia.api.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		
		TibiaWorldData worldInfo = tibiaClient.getWorldInfo(characterInfo.getCharacter().getCharacter().getWorld());
		
		List<OnlinePlayer> sorcerers = new ArrayList();
		List<OnlinePlayer> druids = new ArrayList();
		List<OnlinePlayer> knights = new ArrayList();
		List<OnlinePlayer> paladins = new ArrayList();
		
		worldInfo.getWorld().getOnlinePlayers().stream().forEach(onlinePlayer -> {
			if(onlinePlayer.getVocation().contains("Sorcerer") && levelRange(characterInfo.getCharacter().getCharacter().getLevel(), onlinePlayer.getLevel())) {
				sorcerers.add(onlinePlayer);
			}
			
			if(onlinePlayer.getVocation().contains("Knight") && levelRange(characterInfo.getCharacter().getCharacter().getLevel(), onlinePlayer.getLevel())) {
				knights.add(onlinePlayer);
			}
			
			if(onlinePlayer.getVocation().contains("Paladin") && levelRange(characterInfo.getCharacter().getCharacter().getLevel(), onlinePlayer.getLevel())) {
				paladins.add(onlinePlayer);
			}
			
			if(onlinePlayer.getVocation().contains("Druid") && levelRange(characterInfo.getCharacter().getCharacter().getLevel(), onlinePlayer.getLevel())) {
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
		
		TibiaWorldData worldInfo = tibiaClient.getWorldInfo(characterInfo.getCharacter().getCharacter().getWorld());
		
		List<OnlinePlayer> players = new ArrayList();
		
		worldInfo.getWorld().getOnlinePlayers().stream().forEach(onlinePlayer -> {
			if(onlinePlayer.getVocation().contains(vocation) && levelRange(characterInfo.getCharacter().getCharacter().getLevel(), onlinePlayer.getLevel())) {
				players.add(onlinePlayer);
			}
			
		});
		
		PartyMembers pm = new PartyMembers();
		
		pm.setDruids(players);
		Collections.sort(pm.getDruids(), new VocationComparator());
				
		return pm;
	}

}

class VocationComparator implements java.util.Comparator<OnlinePlayer> {
    @Override
    public int compare(OnlinePlayer a, OnlinePlayer b) {
        return b.getLevel().intValue() - a.getLevel().intValue();
    }
}
