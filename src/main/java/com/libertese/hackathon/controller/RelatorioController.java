package com.libertese.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/relatorio")
public class RelatorioController {
	
	@GetMapping("segurado")
    public String listar(){
        return "relatorios/segurado";
    }
	
	@GetMapping("seguros")
    public String seguros(){
        return "relatorios/seguros";
    }

	@GetMapping("financeiro")
    public String financeiro(){
        return "relatorios/financeiro";
    }
	
	@GetMapping("vendas")
    public String vendas(){
        return "relatorios/vendas";
    }

}
