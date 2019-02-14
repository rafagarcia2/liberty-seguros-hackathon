package com.libertese.hackathon.service;

import com.libertese.hackathon.model.User;
import com.libertese.hackathon.repository.UserRepository;
import com.libertese.hackathon.util.LiberteseUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class LiberteseUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    public LiberteseUserDetailsService() {
        super();
    }

    public UserDetails loadUserByUsername(String username) {
        User user = userRepository.findByEmailAddress(username);
        if (user == null) {
            throw new RuntimeException(username);
        }
        return new LiberteseUserDetails(user);
    }
}
