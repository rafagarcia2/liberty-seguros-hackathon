package com.libertese.hackathon.controller;

import com.libertese.hackathon.model.Cotacao;
import com.libertese.hackathon.model.User;
import com.libertese.hackathon.repository.ClientRepository;
import com.libertese.hackathon.repository.SeguradoraRepository;
import com.libertese.hackathon.repository.UserRepository;
import com.libertese.hackathon.service.UserService;
import com.libertese.hackathon.util.CotacaoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/cotacao")
public class CotacaoController {

    @Autowired
    private SeguradoraRepository segRp;

    @Autowired
    private ClientRepository clientRep;

    @Autowired
    private UserRepository userService;

    @GetMapping("listar")
    public String listar(Model m) {

        return "cotacao/listar";
    }

    @GetMapping("cadastrar")
    public String cadastrar(Model m) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findByEmailAddress(auth.getName());
        m.addAttribute("seguradoras", segRp.findAll());
        m.addAttribute("clientes", clientRep.findAllByUser(user.getId()));
        Cotacao c = new Cotacao(1, null, null, null, null);
        m.addAttribute("cotacao", new CotacaoForm(null, null,c,null));
        return "cotacao/cadastrar";
    }



    @PostMapping("cadastrar")
    public String salvar(CotacaoForm entity, BindingResult result, RedirectAttributes redirectAttributes) {

        //Resource resource = null;
        try {

            /**
             entity.setId(id);
             Authentication auth = SecurityContextHolder.getContext().getAuthentication();
             User user = userService.findByEmailAdress(auth.getName());
             resource = taskService.saveResource(entity, user.getScheduler());**/
            redirectAttributes.addFlashAttribute("success", "Sucesso");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", e.getMessage());
            e.printStackTrace();
        }
        return "redirect:/cotacao/cadastrar";

    }
}
