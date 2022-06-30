package com.example.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/examples")
@Produces(MediaType.APPLICATION_JSON)
public class ExampleController {

  @GET
  public Response hello() {
    return Response.ok("hello").build();
  }
}
