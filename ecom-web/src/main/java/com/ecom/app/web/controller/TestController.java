package com.ecom.app.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RefreshScope
@Controller
public class TestController {
	
	
	@Value("${application.env.name}")
	private String applicationEnvName;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody String getHelloWorld() {
		return "Hello world "+ applicationEnvName;
	}
}