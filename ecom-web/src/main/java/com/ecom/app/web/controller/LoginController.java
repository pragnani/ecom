package com.ecom.app.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.app.web.model.User;

@RestController
public class LoginController {
	  @RequestMapping("/login")
	  public String user(User user) {
	    return "login";
	  }

	

}
