package com.libertese.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.libertese.hackathon.model.Client;


@Controller
@RequestMapping("/cliente")
public class ClientController {

	private static final String INSERT_SUCCESS = "Cliente inserido com sucesso!";
	
	@GetMapping("create")
    public String cadastro() {
        return "cliente/create";
    }
	
	@PostMapping("create")
	public String create (@ModelAttribute("client") Client client, 
			RedirectAttributes redirectAtrributes)
	{
		try {
			//TODO tenta inserir cliente
			
			// mensagem de sucesso
			redirectAtrributes.addFlashAttribute("sucesso", INSERT_SUCCESS);
		}  catch (Exception e) {
			redirectAtrributes.addFlashAttribute("erro", e.getMessage());
		}
		return "redirect:/cliente/index";
	}
}
