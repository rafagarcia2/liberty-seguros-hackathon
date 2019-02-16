package com.libertese.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.libertese.hackathon.model.Seguradora;
import com.libertese.hackathon.repository.SeguradoraRepository;

@Controller
@RequestMapping("/seguradora")
@Secured("false")
public class SeguradoraController {
    @Autowired
    private SeguradoraRepository seguradoraRepository;

    @PostMapping("create")
    public ResponseEntity<Seguradora> response(@RequestBody Seguradora seguradora){
        seguradoraRepository.save(seguradora);
        return new ResponseEntity<Seguradora>(seguradora, HttpStatus.OK);
    }
}
