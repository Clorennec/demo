package com.imt.web.demo.ressources;

import com.imt.web.demo.entities.Adresse;
import com.imt.web.demo.repositories.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import java.util.List;

@Path("adresses")
public class AdresseRessources {

    @Autowired
    private AdresseRepository adresseRepository;

    @GET
    @Produces(value = "application/json")
    public List<Adresse> getAdresse(){
        return adresseRepository.findAll();
    }

    @POST
    @Consumes(value = "application/json")
    public void createAdresse(@NotNull @RequestBody Adresse adresse){adresseRepository.save(adresse);}

    @DELETE
    @Consumes(value = "application/json")
    @Path("/{id}")
    public void deleteAdresse(@NotNull @PathParam("id") Long id){adresseRepository.deleteById(id);}
}