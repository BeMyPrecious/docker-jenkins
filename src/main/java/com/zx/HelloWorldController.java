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
	@RequestMapping("/hello3")
	public String hello3() {
		return "hello world3";	
		}
	@RequestMapping("/hello4")
	public String hello4() {
		return "hello world4";	
		}
	@RequestMapping("/hello5")
	public String hello5() {
		return "hello world5";	
		}
}
