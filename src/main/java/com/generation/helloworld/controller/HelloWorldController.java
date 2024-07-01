package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController{

	@GetMapping ("/hello-wolrd")
	public String helloworld() {
		return "Hello World";
	}
	@GetMapping ("/lista-bdsm") 
	public String listaBdsm() {
		return "orientação ao futuro, responsabilidade pessoal, mentalidade de crescimento, persistencia, trabalho em equipe, orientação ao detalhe, proatividade, comunicação";
	}
	@GetMapping ("/objetivos")
	public String objeivos() {
		return "Focar em oritação ao detalhe, Praticar, Estudar ";
	}
	
}