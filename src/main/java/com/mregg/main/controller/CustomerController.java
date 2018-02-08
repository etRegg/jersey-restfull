package com.mregg.main.controller;

import java.net.URI;
import java.util.List;
import org.springframework.stereotype.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import com.mregg.main.model.Customer;
import com.mregg.main.service.CustomerService;


@Path("/customerrest")
public class CustomerController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);	
	@Autowired
	private CustomerService  customerService;
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomer() {
		List<Customer> list = customerService.getAll(); 
		return Response.ok(list).build();
	}
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getById(@PathParam("id") Integer id) {
		Customer customer = customerService.getById(id);
		return Response.ok(customer).build();
	}
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addCustomer(Customer customer) {
                boolean isAdded = customerService.add(customer);
                if (!isAdded) {
        	   logger.info("customer ready exits.");
	           return Response.status(Status.CONFLICT).build();
                }
                return Response.created(URI.create("/api/v1/customer/"+ customer.getId())).build();
	}	
	@PUT
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)	
	public Response update(Customer customer) {
		customerService.update(customer);
		return Response.ok(customer).build();
	}
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)		
	public Response delete(@PathParam("id") Integer id) {
		customerService.delete(id);
		return Response.noContent().build();
	}	
}

