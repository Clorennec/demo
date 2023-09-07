package com.imt.web.demo.repositories;

import com.imt.web.demo.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
