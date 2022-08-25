package org.acme;

import io.quarkus.logging.Log;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/test")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {

    @POST
    public Input test(Input input) {
        Log.info("Name: " + input.getName());
        Log.info("Birthday: " + input.getBirthday());
        return input;
    }
}