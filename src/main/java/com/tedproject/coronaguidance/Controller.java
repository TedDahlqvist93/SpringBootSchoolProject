package com.tedproject.coronaguidance;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller

public class Controller {
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/whatis")
	public String whatis() {
		return "whatis";
	}
	@RequestMapping("/prevention")
	public String prevention() {
		return "prevention";
	}
	@RequestMapping("/symptoms")
	public String symptoms() {
		return "symptoms";
	}
	@RequestMapping("/memes")
	public String memes() {
		return "memes";
	}

}
