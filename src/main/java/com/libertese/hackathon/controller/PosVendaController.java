package com.libertese.hackathon.controller;

import com.libertese.hackathon.model.ConfiguracaoPosVenda;
import com.libertese.hackathon.model.Indication;
import com.libertese.hackathon.model.User;
import com.libertese.hackathon.repository.IndicationRepository;
import com.libertese.hackathon.repository.PosVendaRepository;
import com.libertese.hackathon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/posVenda")
@Secured("false")
public class PosVendaController {

    @Autowired
    private PosVendaRepository posVendaRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private IndicationRepository indicationRepository;

    @GetMapping("configuracoes")
    public String listar(){
        return "posVenda/configurarEmails";
    }

    @GetMapping("nps")
    public String nps(){
        return "posVenda/resultadoNps";
    }

    @GetMapping("nova-indicacao")
    public String novaIndicacao() { return "posVenda/cadastrarIndicacao";  }


    @GetMapping("minhas-indicacoes")
    public String indicacoes(Model model){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userRepository.findByEmailAddress(auth.getName());

        List<Indication> indications = indicationRepository.findAllByUser(user);

        model.addAttribute("indicacoes", indications);
        return "posVenda/minhasIndicacoes";
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


    @GetMapping("create")
    public String cadastro(Model m) {
        return "posVenda/create";
    }

    @PostMapping("create")
    public String cadastrarIndicacao(@ModelAttribute("indication") Indication indication,
                                     RedirectAttributes redirectAtrributes){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userRepository.findByEmailAddress(auth.getName());

        indication.setUser(user);

        indicationRepository.save(indication);

        return "redirect:/posVenda/minhas-indicacoes";
    }

}
