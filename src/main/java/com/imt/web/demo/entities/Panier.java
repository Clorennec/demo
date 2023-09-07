package com.imt.web.demo.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Panier {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Produit> listProduit;

    @OneToOne(cascade = CascadeType.ALL)
    private Adresse adresse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {this.id = id;}

    public List<Produit> getlistProduit() {
        return listProduit;
    }

    public void setListProduit(List<Produit> listProduit) {this.listProduit = listProduit;}

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {this.adresse = adresse;}
}
