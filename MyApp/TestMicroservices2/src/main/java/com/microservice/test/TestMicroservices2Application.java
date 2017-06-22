package com.microservice.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

//Sink recieves a message
//Can also create a custom interface
//@EnableBinding(Sink.class)
@EnableDiscoveryClient
@SpringBootApplication
public class TestMicroservices2Application {

	public static void main(String[] args) {
		SpringApplication.run(TestMicroservices2Application.class, args);
	}
}
