package com.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/welcome")
public class WelcomeService {
	
	@GET
	public String welcome() {
		return "Welcome to the world of Jersey. Automatic deploy working. Now test test classes";
	}
	
	@GET
	@Path("/1")
	@Produces({"application/json", "application/xml"})
	public String welcome1() {
		return "Welcome1 to the world of Jersey. Automatic deploy working. Now test test classes";
	}


}
