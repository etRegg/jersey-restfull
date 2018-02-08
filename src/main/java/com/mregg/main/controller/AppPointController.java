package com.mregg.main.controller;

import java.net.URI;
import java.util.List;
import org.springframework.stereotype.*;

import javax.ws.rs.ApplicationPath;
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
import com.mregg.main.repository.CustomerRepository;
import com.mregg.main.service.CustomerService;


@ApplicationPath("/")
public class AppPointController {
		
}

