package com.imt.web.demo.entities;

import jakarta.persistence.*;

@Entity
public class Adresse {

    @Id
    @GeneratedValue
    private Long id;

    private String rue;

    private String ville;

    private Integer cp;

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
