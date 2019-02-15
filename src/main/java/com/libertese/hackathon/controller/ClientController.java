package com.libertese.hackathon.controller;

import com.libertese.hackathon.model.Address;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.libertese.hackathon.model.Client;


@Controller

public class ClientController {

	private static final String INSERT_SUCCESS = "Cliente inserido com sucesso!";
	
	@GetMapping("/cliente/create")
    public String cadastro(Model m) {
		//Address ad = new Address(null, null, null, null, null, null, null);
		//m.addAttribute("client", new Client(null, null, null, null, ad));
		return "cliente/create";
    }

    @GetMapping("index")
    public String index () { return "cliente/index";}
	
	@PostMapping("/cliente/create")
	public String create (@ModelAttribute("client") Client client, 
			RedirectAttributes redirectAtrributes)
	{
		try {
			//TODO tenta inserir cliente

			// mensagem de sucesso
			redirectAtrributes.addFlashAttribute("sucesso", INSERT_SUCCESS);
		}  catch (Exception e) {
			redirectAtrributes.addFlashAttribute("erro", e.getMessage());
			return "redirect:/cliente/create";
		}
		return "redirect:/cliente/create";
	}
}
