package com.hkjc.racingtouch.business;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hkjc.racingtouch.model.HorseEntity;

public class RaceRestService {

	private final RestTemplate restTemplate = new RestTemplate();

	public List<HorseEntity> getRaceDayData() {
		
		ResponseEntity<List<HorseEntity>> rateResponse =
		        restTemplate.exchange("http://localhost:10020/hrd/horses/all",
		                    HttpMethod.GET, null, new ParameterizedTypeReference<List<HorseEntity>>() {
		            });
		
		List<HorseEntity> races = rateResponse.getBody();
		
		return races;
	}

}