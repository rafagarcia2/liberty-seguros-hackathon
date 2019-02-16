package com.libertese.hackathon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.libertese.hackathon.model.Indication;
import com.libertese.hackathon.model.User;

@Repository
public interface IndicationRepository extends JpaRepository<Indication, Integer> {


    @Query("select i from Indication i where i.client.usuario=?1")
    List<Indication> findAllByClient(User usuario);

    
    @Query("select i from Indication i where i.user=?1")
    List<Indication> findAllByUser(User usuario);
}
