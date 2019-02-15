package com.libertese.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pos-venda")
public class PosVendaController {

    @GetMapping("configuracoes")
    public String listar(){
        return "posVenda/configurarEmails";
    }

    @GetMapping("nps")
    public String nps(){
        return "posVenda/resultadoNps";
    }
}
