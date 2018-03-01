package com.zx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";	
		}
	@RequestMapping("/hello1")
	public String hello2() {
		return "hello world1";	
		}
}
