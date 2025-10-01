package org.sus.infraestructure.client;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.sus.domain.cidadao.model.Cidadao;

@RegisterRestClient(baseUri = "localhost:8080/")
@Path("/cidadao")
public interface CidadaoClient {

    @GET
    @Path("/{id}")
    Cidadao buscaCidadao(@PathParam("id") Long cidadaoId);
}
