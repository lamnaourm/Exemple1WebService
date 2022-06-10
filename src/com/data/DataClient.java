package com.data;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/client")
public class DataClient {
	
	
	@GET
	@Path("/message1")
	@Produces(MediaType.APPLICATION_JSON)
	public String getClient1() {
		return "Nom Client ; ISMO";
	}
	
	@GET
	@Path("/message2")
	@Produces(MediaType.APPLICATION_JSON)
	public String getClient2() {
		return "Nom Client ; NTT DATA";
	}

}
