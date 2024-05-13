package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	String passwd="12345";
	public String greet() {
		return "Hola, soy Cristian Aliaga";
	}
}
