package com.imt.web.demo.ressources;

import com.imt.web.demo.entities.Panier;
import com.imt.web.demo.services.PanierService;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@Path("/paniers")
public class PanierRessource {

    @Autowired
    PanierService panierService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPaniers() {
        List<Panier> paniers = panierService.getPaniers();
        return Response.ok(paniers).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPanier(@PathParam("id") Long id) {
        Optional<Panier> panier = panierService.getPanierById(id);
        if (panier != null) {
            return Response.ok(panier).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addPanier(Panier panier) {
        System.out.println("avant panierService.addPanier(panier);");
        panierService.addPanier(panier);
        System.out.println("après panierService.addPanier(panier);");
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updatePanier(@PathParam("id") Long id, Panier panier) {
        if (panierService.updatePanier(id, panier)) {
            return Response.ok().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deletePanier(@PathParam("id") Long id) {
        if (panierService.deletePanier(id)) {
            return Response.ok().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
