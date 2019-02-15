package com.libertese.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/caixa")
public class FluxoCaixaController {
	
	@GetMapping("listar")
    public String listar(){
        return "caixa/listar";
    }
	
	@GetMapping("cadastrar")
    public String cadastrar(){
        return "caixa/cadastrar";
    }

}
