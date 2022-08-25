package org.acme;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GeneralException implements ExceptionMapper<Exception> {

    @Override
    @Produces(MediaType.APPLICATION_JSON)
    public Response toResponse(Exception e) {

        String msg = "";
        if (e instanceof Exception) {
//            messageError.setMessage(e.getMessage());
            msg = e.getMessage();
            return Response.status(Response.Status.BAD_REQUEST).entity(msg).build();
        }

        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(msg).build();
    }
}
