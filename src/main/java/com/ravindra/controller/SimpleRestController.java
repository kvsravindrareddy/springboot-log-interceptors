package com.ravindra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
	
	Logger logger = LoggerFactory.getLogger(SimpleRestController.class);
	
	@GetMapping(value="/hello")
	public String testendpoint()
	{
		logger.info("*************Inside testendpoint*************");
		return "Hello";
	}
}