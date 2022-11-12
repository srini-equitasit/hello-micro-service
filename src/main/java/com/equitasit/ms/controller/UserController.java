package com.equitasit.ms.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import java.net.InetAddress;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

	@GetMapping("hello/{user}")
	public String hello(@PathVariable("user") String user) {

		log.info("start request ");
		String message = "";
		try {
			InetAddress ip = InetAddress.getLocalHost();
			message += " From Host : " + ip;
		} catch (UnknownHostException e) {
			log.error("error while getting the ip", e);
		}

		message = "hello " + user + " serving " + message;

		log.info("message = " + message);

		log.info("end request ");

		return message;
	}

}
