package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {

	
  public static Logger logger=	LoggerFactory.getLogger("MyController");
  
  	@GetMapping("/message")
	public String Message() {
		
		
		logger.info("Message  helloHaihelloHaihelloHai ");
		return "helloHai!!!!!!";
	}
}
