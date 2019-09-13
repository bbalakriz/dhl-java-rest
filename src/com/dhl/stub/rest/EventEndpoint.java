package com.dhl.stub.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/api")
@Produces({ "application/json" })
public class EventEndpoint {

	@GET
	@Produces("application/json")
	public Response getAllTransactions() {
		return Response.ok(Status.OK).build();
	}

}
