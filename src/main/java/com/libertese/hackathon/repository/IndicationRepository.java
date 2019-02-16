package com.libertese.hackathon.repository;

import com.libertese.hackathon.model.Client;
import com.libertese.hackathon.model.Indication;
import com.libertese.hackathon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndicationRepository extends JpaRepository<Indication, Integer> {



    @Query("select i from Indication i join fetch i.client where i.client.usuario=?1")
    List<Indication> findAllByUser(User usuario);
}
