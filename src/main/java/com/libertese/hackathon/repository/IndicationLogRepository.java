package com.libertese.hackathon.repository;

import com.libertese.hackathon.model.IndicacaoLog;
import com.libertese.hackathon.model.Indication;
import com.libertese.hackathon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndicationLogRepository extends JpaRepository<IndicacaoLog, Integer> {

    @Query("select i from IndicacaoLog i where i.id = ?1")
    IndicacaoLog findById(int id);

}
