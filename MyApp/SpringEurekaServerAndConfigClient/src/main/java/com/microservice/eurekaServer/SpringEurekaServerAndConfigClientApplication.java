package com.microservice.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaServerAndConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServerAndConfigClientApplication.class, args);
	}
}
