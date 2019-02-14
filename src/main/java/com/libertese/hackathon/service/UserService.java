package com.libertese.hackathon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.libertese.hackathon.exception.InvalidUserException;
import com.libertese.hackathon.model.User;
import com.libertese.hackathon.repository.UserRepository;

/**
 * Service do Usuario
 * @author rafael
 *
 */
@Service
@Transactional(readOnly = true)
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Transactional(readOnly = false)
	public User save(User entity) throws InvalidUserException {
		final User user = new User();
		user.setPassword(passwordEncoder.encode(entity.getPassword()));
		user.setName(entity.getName());
		user.setEmail(entity.getEmail());
		if( entity.getEmail().isEmpty() || entity.getName().isEmpty() || entity.getPassword().isEmpty()) {
			throw new InvalidUserException("Usuário inválido.");
		}

		User userTemp =  userRepository.save(user);
		//schedulerService.save(userTemp);
		return userTemp;
	}
}
