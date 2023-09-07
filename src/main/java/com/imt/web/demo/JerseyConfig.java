package com.imt.web.demo;

import com.imt.web.demo.config.CORSFilter;
import com.imt.web.demo.ressources.*;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.ws.rs.ApplicationPath;

@Component
@ApplicationPath("demo")
@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        register(ProduitResource.class);
        register(AdresseRessources.class);
        register(PanierRessource.class);
        register(UtilisateurRessources.class);
        register(CORSFilter.class);
    }
}
