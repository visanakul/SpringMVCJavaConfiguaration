package com.mvc.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	public HelloServiceImpl() {
		System.out.println("***HelloServiceImpl***");
	}
	@Override
	public String helloMsg() {
		return "Welcome to Spring MVC Java Congifuration Demo!!!";
	}

}
