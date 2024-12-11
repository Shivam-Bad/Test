package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class MyController {
	
	@ResponseBody
	@GetMapping("/hi")
	public String sayHi() {
		return "index";
	}
	
 	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}

}
