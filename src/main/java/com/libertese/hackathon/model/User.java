package com.libertese.hackathon.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author mayra
 *
 */
@Entity
@Table(name = "users")
public class User implements Serializable{

    /**
     * Serial version uid (default)
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phone")
    private String phone;

    @Column(name="cpf")
    private String cpf;

    @Column(name="admin")
    private boolean admin;


    /**
     * Get the id
     * @return the id
     */
    public Integer getId() {
        return id;
    }


    /**
     * Update the id
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * Get the name
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * Update the name
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Get the email
     * @return the email
     */
    public String getEmail() {
        return email;
    }


    /**
     * Update the email
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Get the password
     * @return the password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Update the password
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}