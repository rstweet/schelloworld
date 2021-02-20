package com.sc.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWoldController {
	@RequestMapping("/")  
	public String hello()   
	{  
	return "Hello SChello";  
	}  
}
