package com.libertese.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/autenticacao")
public class AutenticacaoController {

    @GetMapping("/login")
    public String login() {
        return "autenticacao/login";
    }

    @GetMapping("/cadastro")
    public String cadastro(){
        return "autenticacao/cadastro";
    }

}
