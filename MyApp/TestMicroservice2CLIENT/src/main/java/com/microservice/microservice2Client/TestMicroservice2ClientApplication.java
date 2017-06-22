package com.microservice.microservice2Client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableZuulProxy
@EnableCircuitBreaker
//source class is default and already provided
//if there are more services a custom interface can be made
//source sends a message
//@EnableBinding(Source.class)
@EnableDiscoveryClient
@SpringBootApplication
public class TestMicroservice2ClientApplication {

	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TestMicroservice2ClientApplication.class, args);
	}
}
