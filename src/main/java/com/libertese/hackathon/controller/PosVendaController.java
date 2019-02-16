package com.libertese.hackathon.controller;

import com.libertese.hackathon.model.ConfiguracaoPosVenda;
import com.libertese.hackathon.repository.PosVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/posVenda")
@Secured("false")
public class PosVendaController {

    @Autowired
    private PosVendaRepository posVendaRepository;

    @GetMapping("configuracoes")
    public String listar(){
        return "posVenda/configurarEmails";
    }

    @GetMapping("nps")
    public String nps(){
        return "posVenda/resultadoNps";
    }

    @GetMapping("obter-configuracoes")
    @ResponseBody
    public List<ConfiguracaoPosVenda> configuracoesList(){
        List<ConfiguracaoPosVenda> configuracaoPosVendas = posVendaRepository.findAll();
        return  configuracaoPosVendas;
    }

    @PostMapping("nova-configuracao")
    public ResponseEntity<ConfiguracaoPosVenda> response(@RequestBody ConfiguracaoPosVenda configuracaoPosVenda){
        posVendaRepository.save(configuracaoPosVenda);
        return new ResponseEntity<ConfiguracaoPosVenda>(configuracaoPosVenda, HttpStatus.OK);
    }

}
