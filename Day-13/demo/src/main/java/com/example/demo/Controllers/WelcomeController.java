package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.MessageBean;

@RestController
@RequestMapping("/rest")
public class WelcomeController {
	@RequestMapping(value= "welcome", method=RequestMethod.GET)
	public String welcome() {
		return "Welcome to REST App!";
	}
	
	@RequestMapping(value="welcome/{name}")
	public String welcomeMessage(@PathVariable String name) {
		return "Welcome to the Page "+name;
	}
	
	@RequestMapping(value="wel-message")
	public MessageBean welMessage() {
		return new MessageBean("Welcome to the MessageBean");
	}
	
}

//http://localhost:8090/rest/welcome