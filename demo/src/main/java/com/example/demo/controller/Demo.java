package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	
	@GetMapping("/")
	public String index() {
		return "try to give username in url " ;
	}
	@GetMapping("/{username}")
	public String  getName(@PathVariable("username") String name) {
		return "usernmae : " + name ;
	}

}
