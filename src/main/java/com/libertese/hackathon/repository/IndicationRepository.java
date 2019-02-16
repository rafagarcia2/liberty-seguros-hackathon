package com.libertese.hackathon.repository;

import com.libertese.hackathon.model.Indication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndicationRepository extends JpaRepository<Indication, Integer> {
}
