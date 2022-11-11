package com.equitasit.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

	@GetMapping("hello/{user}")
	public String hello(@PathVariable("user") String user) {

		return "hello " + user;
	}

}
