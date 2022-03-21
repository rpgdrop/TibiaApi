package com.tibia.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tibia.api.model.PartyMembers;
import com.tibia.api.service.TibiaApiService;

@Controller
public class TibiaApiResource {
	
	
	
	@Autowired
	private TibiaApiService service;
	
	@GetMapping("/party-finder/{name}")
	public ResponseEntity<PartyMembers> partyFinder(@PathVariable String name) {
		
		return ResponseEntity.ok().body(service.getParty(name));
	}
	
	@GetMapping("/party-finder/{name}/{vocation}")
	public ResponseEntity<PartyMembers> partyFinder(@PathVariable String name, @PathVariable String vocation) {
		
		return ResponseEntity.ok().body(service.getPartyEspecificVocation(name,vocation));
	}

}
