package com.imt.web.demo.services;

import com.imt.web.demo.entities.Panier;
import com.imt.web.demo.repositories.AdresseRepository;
import com.imt.web.demo.repositories.PanierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PanierService {

    @Autowired
    private PanierRepository panierRepository;

    @Autowired
    private AdresseRepository adresseRepository;

    public List<Panier> getPaniers() {
        return panierRepository.findAll();
    }

    public Optional<Panier> getPanierById(Long id) {
        return panierRepository.findById(id);
    }

    public void addPanier(Panier panier) {
        if (panier.getAdresse() == null) {
            throw new IllegalArgumentException("L'adresse ne peut pas être null");
        }
        panierRepository.save(panier);
    }


    public boolean updatePanier(Long id, Panier newPanier) {
        Optional<Panier> optionalPanier = panierRepository.findById(id);
        if (optionalPanier.isPresent()) {
            Panier existingPanier = optionalPanier.get();
            existingPanier.setListProduit(newPanier.getlistProduit());
            existingPanier.setAdresse(newPanier.getAdresse());
            if (newPanier.getAdresse() != null) {
                adresseRepository.save(newPanier.getAdresse());
            }
            panierRepository.save(existingPanier);
            return true;
        } else {
            return false;
        }
    }

    public boolean deletePanier(Long id) {
        if (panierRepository.existsById(id)) {
            panierRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
