package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicAuthController {

	@GetMapping("/getdata")
	public String getData() {
		 return "Got the data from Secured App";
	}
}
