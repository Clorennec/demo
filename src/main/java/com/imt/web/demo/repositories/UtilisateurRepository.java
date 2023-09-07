package com.imt.web.demo.repositories;

import com.imt.web.demo.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{
}
