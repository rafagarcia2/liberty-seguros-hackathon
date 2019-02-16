package com.libertese.hackathon.controller;

import com.libertese.hackathon.model.Caixa;
import com.libertese.hackathon.model.Client;
import com.libertese.hackathon.model.Orcamento;
import com.libertese.hackathon.model.User;
import com.libertese.hackathon.repository.CaixaRepository;
import com.libertese.hackathon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/caixa")
public class FluxoCaixaController {

    private static final String INSERT_SUCCESS = "Movimento de caixa inserido com sucesso!";

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CaixaRepository caixaRepository;

	@GetMapping("listar")
    public String index(Model model){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userRepository.findByEmail(auth.getName());

        List<Caixa> all = caixaRepository.findAllByUser(user.getId());

        model.addAttribute("caixas", all);
        return "caixa/listar";
    }

    @GetMapping("cadastrar")
    public String cadastro(Model m) {
        return "caixa/cadastrar";
    }
    
    @GetMapping("editar/{id}")
    public String editar(Model m, @PathVariable Integer id){
		Caixa caixa = caixaRepository.findCaixaById(id);
		m.addAttribute("caixa", caixa);
        return "caixa/editar";
    }

    @PostMapping("cadastrar")
    public String create (@ModelAttribute("caixa") Caixa caixa,
                          RedirectAttributes redirectAtrributes)
    {
        try {
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            User user = userRepository.findByEmail(auth.getName());

            caixa.setUsuario(user);

            caixaRepository.save(caixa);
            redirectAtrributes.addFlashAttribute("sucesso", INSERT_SUCCESS);
        }  catch (Exception e) {
            redirectAtrributes.addFlashAttribute("erro", e.getMessage());
            return "redirect:/caixa/listar";
        }
        return "redirect:/caixa/listar";
    }
    
    @PostMapping("atualizar/{id}")
	public String atualizar(Caixa caixa, @PathVariable Integer id){
		
		caixa.setId(id);
		
		caixaRepository.save(caixa);
		return "redirect:caixa/listar";
	}

    @GetMapping("deletar/{id}")
    public String deletar(@PathVariable Integer id, Model model) {
        Caixa caixa = caixaRepository.findCaixaById(id);
        caixaRepository.delete(caixa);
        return "redirect:/caixa/listar";
    }

}
