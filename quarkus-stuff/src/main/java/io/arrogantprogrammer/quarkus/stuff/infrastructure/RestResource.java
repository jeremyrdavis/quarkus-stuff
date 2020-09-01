package io.arrogantprogrammer.quarkus.stuff.infrastructure;

import io.arrogantprogrammer.quarkus.stuff.domain.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.UUID;
import java.util.logging.Logger;

@Path("/domain")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RestResource {

    Logger logger = Logger.getLogger(RestResource.class.getName());

    @GET
    @Path("/model")
    public Response getModel() {
        Message message = new Message(UUID.randomUUID().toString(), "Hello, World!");
        System.out.println(message.toString());
        logger.info(message.toString());
        return Response.ok().entity(message).build();
    }
    
}