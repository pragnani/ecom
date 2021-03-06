package com.ecom.app.services.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

	@Value("${application.env.name}")
	private String applicationEnvName;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHelloWorld() {
		return "Hello world  "+applicationEnvName;
	}
}
