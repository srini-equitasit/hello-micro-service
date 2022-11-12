package com.equitasit.ms.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equitasit.ms.model.RespData;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

	@GetMapping("hello/{user}")
	public RespData hello(@PathVariable("user") String user) {
		RespData respData = new RespData();
		log.info("start request ");

		try {
			InetAddress ip = InetAddress.getLocalHost();

			respData.setIpAddr(ip.toString());

		} catch (UnknownHostException e) {
			log.error("error while getting the ip", e);
		}

		respData.setMsg("hello " + user);
		respData.setDate(new Date());

		log.info("respData = " + respData);

		log.info("end request ");

		return respData;
	}

}
