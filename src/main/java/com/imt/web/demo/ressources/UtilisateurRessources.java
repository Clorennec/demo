package com.imt.web.demo.ressources;


import com.imt.web.demo.entities.Utilisateur;
import com.imt.web.demo.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import java.util.List;
import java.util.Optional;

@Path("utilisateurs")
public class UtilisateurRessources {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @GET
    @Produces(value = "application/json")
    public List<Utilisateur> getUtilisateur(){
        return utilisateurRepository.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces(value = "application/json")
    public Optional<Utilisateur> getUtilisateur(@NotNull @PathParam("id") Long id){return utilisateurRepository.findById(id);}

    @POST
    @Consumes(value = "application/json")
    public void createUtilisateur(@NotNull @RequestBody Utilisateur adresse){utilisateurRepository.save(adresse);}

    @DELETE
    @Consumes(value = "application/json")
    @Path("/{id}")
    public void deleteUtilisateur(@NotNull @PathParam("id") Long id){utilisateurRepository.deleteById(id);}
}