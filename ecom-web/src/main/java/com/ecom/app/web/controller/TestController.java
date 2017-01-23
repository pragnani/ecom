package com.ecom.app.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody String getHelloWorld() {
		return "Hello world";
	}
}