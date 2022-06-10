package com.data;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class MyRestServices extends ResourceConfig{

	public MyRestServices() {
		packages("com.data");
		packages("com.fasterxml.jackson.jaxrs.json");
	}
}

