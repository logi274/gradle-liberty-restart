package com.example;

import java.util.HashMap;
import java.util.Map;

import javax.inject.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloResource {
	
	@Inject
	private MessageEjb ejb;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> getProperties() throws Exception {
    	Map<String, String> result = new HashMap<>();
    	result.put("message", ejb.getMessage());
        return result;
    }

}