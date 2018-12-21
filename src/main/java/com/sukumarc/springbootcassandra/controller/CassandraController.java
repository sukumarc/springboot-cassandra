package com.sukumarc.springbootcassandra.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CassandraController {
	
	@RequestMapping(value = "/hello")
	public String hello() {
		return "Hi, Sukumar";
	}

}
