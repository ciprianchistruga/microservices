package com.microservice.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MoviesRestController {

	@Value("${message}")
	private String message;
	
	@RequestMapping("/message")
	String read(){
		return this.message;	
	}
}
