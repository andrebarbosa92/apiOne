package br.com.project.apione.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/clientes")
public class ClientController {

	@GetMapping("/cliente")
	public String listar() {
		return "Criando....";
	}
}
