package com.libertese.hackathon.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.libertese.hackathon.model.*;
import com.libertese.hackathon.repository.ClientRepository;
import com.libertese.hackathon.repository.IndicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/indicacao")
@Secured("false")
public class IndicacaoController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private IndicationRepository indicationRepository;

    @GetMapping("usuario/{id}")
    public String indicacao(Model model, @PathVariable Integer id){
        model.addAttribute("idCliente", id);
        Optional<Client> client = clientRepository.findById(id);
        if(!client.isPresent()){
            return "redirect:/login";
        }
        return "posVenda/indicacao";
    }

    @PostMapping("usuario/{id}")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public ResponseEntity<Indication> cadastrarIndicacao(@RequestBody Indication indication, @PathVariable Integer id){
        Optional<Client> client = clientRepository.findById(id);
        indication.setClient(client.get());
        indication.setStatus(StatusLead.NOVO);
        indicationRepository.save(indication);
        return new ResponseEntity<Indication>(indication, HttpStatus.OK);
    }
}
