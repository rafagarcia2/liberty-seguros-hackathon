package com.libertese.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/posVenda")
public class PosVendaController {

    @GetMapping ("indicacao")
    public String cadastrarIndicacao ()
    {   return "posVenda/indicacao"; }

}
