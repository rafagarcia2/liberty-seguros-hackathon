package com.libertese.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cotacao")
public class CotacaoController {

	@GetMapping("listar")
    public String listar(){
        return "cotacao/listar";
    }

	@GetMapping("cadastrar")
    public String cadastrar(){
        return "cotacao/cadastrar";
    }

}
