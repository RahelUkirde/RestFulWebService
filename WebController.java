package com.web.service.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class WebController 
{
	@GetMapping("/web")
	public Webservice getWeb()
	{
		return new Webservice("Rahel", 60);
		
	}

}
