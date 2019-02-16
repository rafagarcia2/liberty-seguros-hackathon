package com.libertese.hackathon.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libertese.hackathon.model.Orcamento;

public interface OrcamentoRepository  extends JpaRepository<Orcamento, Integer> {
	
	Orcamento findOrcamentoById(Integer id);

}
