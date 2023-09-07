package com.imt.web.demo.repositories;

import com.imt.web.demo.entities.Panier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PanierRepository extends JpaRepository<Panier, Long>{
}
