package com.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/users")
public class SampleService {
	
@GET
@Path("/")
public String getName()
{
	return "Hello";
}
@GET
@Path("/user1")
@Produces("application/json")
public User getUser()
{
	User user = new User("asrith",1,1000);
	return user;
}
}
