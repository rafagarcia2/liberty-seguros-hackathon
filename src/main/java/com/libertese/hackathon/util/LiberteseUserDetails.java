package com.libertese.hackathon.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.libertese.hackathon.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class LiberteseUserDetails implements UserDetails {

    private static final long serialVersionUID = 1L;
    private final User user;

    public LiberteseUserDetails(User user) {
        this.user = user;
    }


    //

    public String getUsername() {
        return user.getEmail();
    }


    public String getPassword() {
        return user.getPassword();
    }



    public boolean isAccountNonExpired() {
        return true;
    }


    public boolean isAccountNonLocked() {
        return true;
    }


    public boolean isCredentialsNonExpired() {
        return true;
    }


    public boolean isEnabled() {
        return true;
    }

    //

    public User getUser() {
        return user;
    }



    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();

        list.add(new SimpleGrantedAuthority("user"));

        return list;
    }
}