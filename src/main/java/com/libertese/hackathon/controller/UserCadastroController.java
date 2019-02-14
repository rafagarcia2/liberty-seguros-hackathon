package com.libertese.hackathon.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserCadastroController {

	@GetMapping("/autenticacao/cadastro")
    public String cadastro() {
        return "autenticacao/cadastro";
    }
	
}
