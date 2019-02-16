package com.libertese.hackathon.controller;

import com.libertese.hackathon.model.Indication;
import com.libertese.hackathon.repository.IndicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class IndicacaoApiController {

    @Autowired
    private IndicationRepository indicationRepository;

    @GetMapping ("/api/indicacao")
    public Indication resources(@RequestParam(value="i", defaultValue="World") String id) {
        int idInd = Integer.parseInt(id);
        Indication byId = indicationRepository.findById(idInd);
        return byId;
    }
}
