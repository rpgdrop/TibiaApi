package com.tibia.api.service;

import com.tibia.api.model.PartyMembers;

public interface TibiaApiService {
	
	PartyMembers getParty(String name);

	PartyMembers getPartyEspecificVocation(String name, String vocation);

}
