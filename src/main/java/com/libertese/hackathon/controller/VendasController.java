package com.libertese.hackathon.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.libertese.hackathon.model.Orcamento;
import com.libertese.hackathon.repository.OrcamentoRepository;

@Controller
@RequestMapping("/vendas")
public class VendasController {
	
	@Autowired
	private OrcamentoRepository orcamentoRepository;
	
	@GetMapping("listar")
    public String listar(Model m){
		List<Orcamento> orcamentos = orcamentoRepository.findAll();
		m.addAttribute("orcamentos", orcamentos);
        return "vendas/listar";
    }
	
	@GetMapping("cadastrar")
    public String cadastrar(Model m){
        return "vendas/cadastrar";
    }
	
	@GetMapping("editar/{id}")
    public String editar(Model m, @PathVariable Integer id){
		Orcamento orcamento = orcamentoRepository.findOrcamentoById(id);
		m.addAttribute("orcamento", orcamento);
        return "vendas/editar";
    }
	
	@PostMapping("cadastrar")
	public String salvar(Orcamento orcamento){
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/YYY");

		String dateString = format.format( new Date()   );
		orcamento.setData_criacao(dateString);
		orcamentoRepository.save(orcamento);
		return "redirect:/vendas/listar";
	}
	
	@PostMapping("atualizar/{id}")
	public String atualizar(Orcamento orcamento, @PathVariable Integer id){
		
		orcamento.setId(id);
		
		orcamentoRepository.save(orcamento);
		return "redirect:vendas/listar";
	}

}
