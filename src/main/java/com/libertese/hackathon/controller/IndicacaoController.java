package com.libertese.hackathon.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.libertese.hackathon.model.*;
import com.libertese.hackathon.repository.ClientRepository;
import com.libertese.hackathon.repository.IndicationLogRepository;
import com.libertese.hackathon.repository.IndicationRepository;
import com.libertese.hackathon.service.UserService;
import com.libertese.hackathon.util.IndicationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.Optional;

@Controller
@RequestMapping("/indicacao")
@Secured("false")
public class IndicacaoController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private IndicationRepository indicationRepository;

    @Autowired
    private IndicationLogRepository indicationLogRepository;

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

        Optional<Client> clients = clientRepository.findById(id);

        Client client = clients.get();
        client.setIndicacoes(clientRepository.countIndication(id));

        indication.setClient(client);
        indicationRepository.save(indication);
        clientRepository.save(client);

        return new ResponseEntity<Indication>(indication, HttpStatus.OK);
    }

    @PostMapping("{id}")
    public String atualizar(@ModelAttribute("indicationForm") IndicationForm indication, @PathVariable Integer id, RedirectAttributes redirectAttributes){
        try {
            Indication indication1 = indicationRepository.getOne(id);
            indication1.setStatus(indication.getStatus());
            IndicacaoLog log = new IndicacaoLog();
            log.setIndicacao(indication1);
            log.setLog(indication.getObservacao());
            log.setData_criacao(new Date());
            indicationRepository.save(indication1);
            indicationLogRepository.save(log);

            redirectAttributes.addFlashAttribute("success", "Sucesso");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", e.getMessage());
            e.printStackTrace();
        }

        return "redirect:/posVenda/minhas-indicacoes";
    }
}
