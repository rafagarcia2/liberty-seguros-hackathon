package com.libertese.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sistema")
public class SistemaController {
    @GetMapping("/dashboard")
    public String cadastro(){
        return "sistema/dashboard";
    }
}
