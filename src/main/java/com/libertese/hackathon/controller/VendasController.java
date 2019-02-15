package com.libertese.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vendas")
public class VendasController {
	
	@GetMapping("listar")
    public String listar(){
        return "vendas/listar";
    }
	
	@GetMapping("cadastrar")
    public String cadastrar(){
        return "vendas/cadastrar";
    }

}
