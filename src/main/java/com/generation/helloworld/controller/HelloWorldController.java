package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloWorldController {

	@GetMapping
	public String ola() {
		return "Olá mundo! Bom dia!";
	}
	
	@GetMapping("comidas")
	public String comidasFavoritas() {
		return "Sushi \nHamburguer";
	}
	
	@GetMapping("livros")
	public String livrosFavoritos(){
		return "Eragon \nSenhor dos Aneis";
	}
	
	@GetMapping("bsm")
	public String bsms() {
		return "Competencias comportamentais:\r\n"
				+ "\r\n"
				+ "Comunicação\r\n"
				+ "Proatividade\r\n"
				+ "Orientação ao detalhe\r\n"
				+ "Trabalho em equipe\r\n"
				+ "\r\n"
				+ "Mentalidades:\r\n"
				+ "\r\n"
				+ "Responsabilidade Pessoal\r\n"
				+ "Mentalidade de Crescimento\r\n"
				+ "Orientação ao Futuro\r\n"
				+ "Persistencia";
	}
	
	@GetMapping("foco")
	public String objetivos() {
		return "Nessa semana tenho o objetivo de melhorar as seguintes habilidades:\r\n"
				+"Comunicação\r\n"
				+"Proatividade\r\n"
				+"Persistencia";
				
				
			
				
	}
}

