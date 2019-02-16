package com.libertese.hackathon.service;

import com.libertese.hackathon.exception.InvalidConfigVendaException;
import com.libertese.hackathon.model.ConfiguracaoPosVenda;
import com.libertese.hackathon.repository.PosVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.libertese.hackathon.exception.InvalidUserException;
import com.libertese.hackathon.model.User;
import com.libertese.hackathon.repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Service das configurações
 * @author marcus
 *
 */
@Repository
@Transactional
public class PosVendaService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(ConfiguracaoPosVenda configuracaoPosVenda) {
        entityManager.persist(configuracaoPosVenda);
        return configuracaoPosVenda.getId();
    }
}
