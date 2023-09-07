package com.imt.web.demo.entities;



import jakarta.persistence.*;

@Entity
public class Produit {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String titre;

    @Column
    private Long prix;

    @Column
    private String categories;

    @Column
    private String description;


    private String allergenes;

    private String urlImage;
    @Column
    public Integer getId() {
        return id;
    }

    public Produit setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitre() {
        return titre;
    }

    public Produit setTitre(String titre) {
        this.titre = titre;
        return this;
    }

    public Long getPrix() {
        return prix;
    }

    public Produit setPrix(Long prix) {
        this.prix = prix;
        return this;
    }

    public String getCategories() {
        return categories;
    }

    public Produit setCategories(String categories) {
        this.categories = categories;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Produit setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getAllergenes() {
        return allergenes;
    }

    public Produit setAllergenes(String allergenes) {
        this.allergenes = allergenes;
        return this;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
