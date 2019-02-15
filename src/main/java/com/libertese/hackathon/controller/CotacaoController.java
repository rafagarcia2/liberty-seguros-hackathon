package com.libertese.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cotacao")
public class CotacaoController {

    @GetMapping("/create")
    public String create(){
        return "cotacao/create";
    }
}
