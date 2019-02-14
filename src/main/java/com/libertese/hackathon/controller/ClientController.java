package com.libertese.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/cliente")
public class ClientController {

	private static final String INSERT_SUCCESS = "Cliente inserido com sucesso!";
	
	@GetMapping("create")
    public String cadastro() {
        return "cliente/create";
    }
}
