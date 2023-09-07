package com.imt.web.demo.repositories;

import com.imt.web.demo.entities.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AdresseRepository extends JpaRepository<Adresse, Long>{
}
