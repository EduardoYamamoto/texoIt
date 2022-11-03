package com.test.texoIt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.texoIt.dto.AwardsIntervalDTO;
import com.test.texoIt.service.AwardsIntervalService;

@RestController
@RequestMapping(value = "/awardsInterval")
public class AwardsIntervalController {

	@Autowired
	private AwardsIntervalService awardsIntervalService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE) 
	public ResponseEntity<AwardsIntervalDTO> getAwardsInterval() {
		return new ResponseEntity<AwardsIntervalDTO>(awardsIntervalService.getAwardsInterval(), HttpStatus.OK);
	}
	
}
