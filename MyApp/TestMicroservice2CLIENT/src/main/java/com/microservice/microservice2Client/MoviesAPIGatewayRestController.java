package com.microservice.microservice2Client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpMethod;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/movies")
public class MoviesAPIGatewayRestController {

	private final RestTemplate movieRestTemplate;

	@Autowired
	public MoviesAPIGatewayRestController(RestTemplate movieRestTemplate) {
		super();
		this.movieRestTemplate = movieRestTemplate;
	}

	//messaging using RabbitMQ - can be another messaging
/*	@Autowired
	private Source output;

	@RequestMapping(method = RequestMethod.POST)
	public void write(@RequestBody Movies movies) {
		MessageChannel channel = this.output.output();
		channel.send(MessageBuilder.withPayload(movies.getName()).build());

	}*/

	@HystrixCommand(fallbackMethod = "defaultFallback")
	@RequestMapping(method = RequestMethod.GET, value = "/name")
	public List<String> names() {
		return this.movieRestTemplate.exchange("http://movies-service/movies", HttpMethod.GET, null,
				new ParameterizedTypeReference<Resources<Movies>>() {

				}).getBody().getContent().stream().map(Movies::getName).collect(Collectors.toList());
	}
	
	private List<String> defaultFallback() {
		return new ArrayList<>();
	}
}
