package com.libertese.hackathon.controller;

import com.libertese.hackathon.model.Client;
import com.libertese.hackathon.model.User;
import com.libertese.hackathon.repository.ClientRepository;
import com.libertese.hackathon.repository.UserRepository;
import com.libertese.hackathon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.awt.print.Pageable;
import java.util.List;


@Controller
@RequestMapping("/cliente")
public class ClientController {

	private static final String INSERT_SUCCESS = "Cliente inserido com sucesso!";

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ClientRepository clientRepository;

	@GetMapping("/create")
    public String cadastro(Model m) {
		return "cliente/create";
    }

    @GetMapping("index")
    public String index () {
		return "cliente/index";
	}

	@PostMapping("/create")
	public String create (@ModelAttribute("client") Client client,
			RedirectAttributes redirectAtrributes)
	{
		try {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			User user = userRepository.findByEmail(auth.getName());

			client.setUsuario(user);

			clientRepository.save(client);
			redirectAtrributes.addFlashAttribute("sucesso", INSERT_SUCCESS);
		}  catch (Exception e) {
			redirectAtrributes.addFlashAttribute("erro", e.getMessage());
			return "redirect:/cliente/create";
		}
		return "redirect:/cliente/listar";
	}

	@GetMapping("listar")
	public String index(Model model) {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userRepository.findByEmail(auth.getName());

		List<Client> all = clientRepository.findAllByUser(user.getId());

		model.addAttribute("clients", all);
		return "cliente/index";
	}

	@GetMapping("editar/{id}")
	public String editar(@PathVariable Integer id, Model model) {
		Client client = clientRepository.findClientByCode(id);
		model.addAttribute("cliente", client);
		return "cliente/edit";
	}

	@GetMapping("deletar/{id}")
	public String deletar(@PathVariable Integer id, Model model) {
		Client client = clientRepository.findClientByCode(id);
		clientRepository.delete(client);
		return "redirect:/cliente/listar";
	}

	@PostMapping("atualizar/{id}")
	public String atualizar(@PathVariable Integer id, Client client) {
		client.setCode(id);

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userRepository.findByEmail(auth.getName());

		client.setUsuario(user);
		clientRepository.save(client);
		return "redirect:/cliente/listar";
	}


}
