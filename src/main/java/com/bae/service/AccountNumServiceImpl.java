package com.bae.service;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

@Service
public class AccountNumServiceImpl implements AccountNumService{
	
	
	
	public String genNum() {
		
		//Generate 3 letters
		char[] chars = "abc".toCharArray();
		StringBuilder sb = new StringBuilder(3);
		Random random = new Random();
		for (int i = 0; i < 3; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String letters = sb.toString();
		
		// Generate nums
		long rand = ThreadLocalRandom.current().nextLong(100,99999);

	    String numbers = Long.toString(rand);
		
		String output = letters+numbers;
		return output;
		
	}

	
	
} 

