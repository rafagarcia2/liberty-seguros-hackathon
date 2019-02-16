package com.libertese.hackathon.controller;

import com.libertese.hackathon.repository.SeguradoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cotacao")
public class CotacaoController {

    @Autowired
    private SeguradoraRepository segRp;

	@GetMapping("listar")
    public String listar(Model m){

        return "cotacao/listar";
    }

	@GetMapping("cadastrar")
    public String cadastrar(Model m){
        m.addAttribute("seguradoras", segRp.findAll());
        return "cotacao/cadastrar";
    }

}
