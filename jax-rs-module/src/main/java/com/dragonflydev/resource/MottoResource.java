package com.dragonflydev.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by dragonfly on 2023-09-03
 */
@Path("motto")
@Produces(MediaType.APPLICATION_JSON)
public interface MottoResource {

    @Path("/")
    @GET
    Response getMotto();

    @Path("/anthem")
    @GET
    Response getAnthemName();
}
