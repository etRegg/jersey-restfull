package com.mregg.main.jersey;


import org.springframework.context.annotation.Bean;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import com.mregg.main.EndPoint.CustomerEndPoint;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.jersey.JerseyAutoConfiguration;

@ApplicationPath("/api/v1")
public class Config extends ResourceConfig {
	
	 public  Config() {
			register(CustomerEndPoint.class);
		   }
	
}