package com.libertese.hackathon.repository;

import com.libertese.hackathon.model.Caixa;
import com.libertese.hackathon.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaixaRepository extends JpaRepository<Caixa, Integer> {

    Caixa findCaixaById(Integer id);

    @Query("select c from Caixa c where c.usuario.id = ?1")
    List<Caixa> findAllByUser(int idUsuario);
}
