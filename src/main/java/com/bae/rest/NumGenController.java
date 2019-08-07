package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.AccountNumService;

@RestController
public class NumGenController {
	
	@Autowired
	public AccountNumService service;
	
	@GetMapping("/getAccountNumber") 
	public String getNumber() {
		return service.genNum();
	}
	
	
}

