package com.imt.web.demo.entities;


import jakarta.persistence.*;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String nom;

    @Column
    private String prenom;

    @Column
    private String mail;

    @Column
    private String pwd;

    @Column
    private Long solde;

    public Integer id() {
        return id;
    }

    public Utilisateur setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public Utilisateur setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public Utilisateur setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public String getpwd() {
        return pwd;
    }

    public Utilisateur setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    public Long getSolde() {
        return solde;
    }

    public Utilisateur setSolde(Long solde) {
        this.solde = solde;
        return this;
    }
}
