package com.libertese.hackathon.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.libertese.hackathon.model.User;
import com.libertese.hackathon.service.UserService;

@Controller
@RequestMapping("/autenticacao")
public class AutenticacaoController {

	@Autowired
	private UserService userService;
	
    @GetMapping("/login")
    public String login() {
        return "autenticacao/login";
    }

    @GetMapping("/cadastro")
    public String cadastro(){
        return "sistema/cadastro";
    }
    
    @PostMapping("/cadastro")
	public String registerAction( @Valid @ModelAttribute User entityUser, BindingResult result, RedirectAttributes redirectAttributes) {
		
		String a = "aea";
		try {
			User user = userService.save(entityUser);
			redirectAttributes.addFlashAttribute("success", "Usuario cadastrado com sucesso.");
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("error", e.getMessage());
			return "redirect:/autenticacao/cadastro";
		}

		
        return "deu_certo";
    }

}
