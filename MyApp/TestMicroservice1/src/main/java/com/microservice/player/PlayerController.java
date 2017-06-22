package com.microservice.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

	private Movies movies;

	/*@PostConstruct
	public void init() {
		movies = new Movies();
		movies.setName("bau");
	}*/
	@Autowired MovieDAO m;

	/*@RequestMapping("/test/{name}")
	public void test(Map model, @PathVariable String name) {
		model.put("UIName", name);
	}*/
	
	@RequestMapping(method = RequestMethod.GET, value = { "/test" })
	public @ResponseBody List<Movies> movies() {
		return m.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = { "/test/{name}" })
	public @ResponseBody Movies moviesFind(@PathVariable String name) {
		return m.findByName(name);
	}
}
