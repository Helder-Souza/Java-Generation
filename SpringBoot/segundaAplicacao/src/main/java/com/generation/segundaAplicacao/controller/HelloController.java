package com.generation.segundaAplicacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String getObj() {
		return "Enteder o funcionamento de uma aplicação Spring"
				+ "\nEntender o conceito de API Restful";
	}
}
