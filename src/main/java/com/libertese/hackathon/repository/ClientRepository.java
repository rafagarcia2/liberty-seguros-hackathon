package com.libertese.hackathon.repository;

import com.libertese.hackathon.model.Client;
import com.libertese.hackathon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client findClientByCode(Integer code);

    @Query("select c from Client c where c.usuario.id = ?1")
    List<Client> findAllByUser(int idUsuario);

}
