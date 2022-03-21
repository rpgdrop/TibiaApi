package com.tibia.api.dataprovider.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tibia.api.model.TibiaCaracterData;
import com.tibia.api.model.TibiaWorldData;

@FeignClient(name = "${client.tibiadata.name}", url = "${client.tibiadata.host}")	
public interface TibiaDataApiClient {
	
	@GetMapping("${client.tibiadata.endpoint.character}")
	public TibiaCaracterData getCharacterInfo(@PathVariable String caracterName);
	
	@GetMapping("${client.tibiadata.endpoint.world}")
	public TibiaWorldData getWorldInfo(@PathVariable String world);

}