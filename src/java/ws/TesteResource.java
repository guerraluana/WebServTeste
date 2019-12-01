package ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author guerraluana
 */
@Path("teste")
public class TesteResource {

    @Context
    private UriInfo context;

    public TesteResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return "{\"pessoaFisica\" : {\n" + "\"nome\" : \"Razer\", \n" + "\"cpf\" : \"123.456.789-0\"\n" + " }\n" + "}";
     }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
