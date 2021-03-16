package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String getHello() {
		return "Olá, mundo!!!";
	}
	
	@GetMapping("/hab-men")
	public String getHabMen() {
		return "Persistência e atenção aos detalhes";
	}
	
}
