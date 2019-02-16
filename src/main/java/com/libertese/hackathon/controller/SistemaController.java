package com.libertese.hackathon.controller;

import com.libertese.hackathon.model.Seguradora;
import com.libertese.hackathon.model.SeguradoraDTO;
import com.libertese.hackathon.model.SeguradoraLogin;
import com.libertese.hackathon.repository.SeguradoraLoginRepository;
import com.libertese.hackathon.repository.SeguradoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/sistema")
public class SistemaController {
    @Autowired
    private SeguradoraRepository seguradoraRepository;

    @Autowired
    private SeguradoraLoginRepository seguradoraLoginRepository;

    @GetMapping("/dashboard")
    public String cadastro(Model model){
        int qntdSeguradoras = (int) seguradoraRepository.count();
        model.addAttribute("qntdSeguradoras", qntdSeguradoras);
        return "sistema/dashboard";
    }

    @GetMapping("/simulacao-de-seguro")
    public String simulacao(Model model){
        List<Seguradora> seguradoras = seguradoraRepository.findAll();
        model.addAttribute("seguradoras", seguradoras);
        return "sistema/simulacao";
    }

    @PostMapping("/cadastrar-seguradora")
    public ResponseEntity<SeguradoraLogin> response(@RequestBody SeguradoraDTO seguradoraDTO){
        SeguradoraLogin seguradoraLogin = new SeguradoraLogin();
        Optional<Seguradora> seguradora = seguradoraRepository.findById(seguradoraDTO.getIdSeguradora());
        seguradoraLogin.setSeguradora(seguradora.get());
        seguradoraLogin.setEmail(seguradoraDTO.getEmail());
        seguradoraLogin.setSenha(seguradoraDTO.getSenha());
        seguradoraLoginRepository.save(seguradoraLogin);
        return new ResponseEntity<SeguradoraLogin>(seguradoraLogin, HttpStatus.OK);
    }


}
