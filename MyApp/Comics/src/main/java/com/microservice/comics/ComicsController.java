package com.microservice.comics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.http.MediaType;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping(value="/comics/method")
@MessageEndpoint
public class ComicsController {
	
	@Autowired
	ComicsRepository comics;
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Comics> getComicsByName(@PathVariable String name){
		return comics.findByComicname(name);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST,
			produces=MediaType.APPLICATION_JSON_VALUE)
	@ServiceActivator(inputChannel=Sink.INPUT)
	public void addComic(@RequestBody Comics c){
		System.out.println("message recieved" + c.getComicname());
		comics.save(c);
		//return c;
	}
}
