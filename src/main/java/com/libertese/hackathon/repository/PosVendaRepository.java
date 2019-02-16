package com.libertese.hackathon.repository;


import com.libertese.hackathon.model.ConfiguracaoPosVenda;
import com.libertese.hackathon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PosVendaRepository extends JpaRepository<ConfiguracaoPosVenda, Integer> {

}