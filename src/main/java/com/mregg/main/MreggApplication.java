package com.mregg.main;
import javax.sql.DataSource;

import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.jersey.JerseyAutoConfiguration;

import com.mregg.main.jersey.Config;
import com.mregg.main.model.Customer;
import com.mregg.main.repository.CustomerRepository;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class MreggApplication {
	private static final Logger log = LoggerFactory.getLogger(MreggApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MreggApplication.class, args);
	}
	
	/*public ResourceConfig endpointConfig() {
	    ResourceConfig config = new ResourceConfig();
	    config.packages(true, Config.class.getPackage().getName()); // 'xxx', recursive
	    return config;
	}*/
	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Customer("Jack", "Bauer"));
			repository.save(new Customer("Chloe", "O'Brian"));
			repository.save(new Customer("Kim", "Bauer"));
			repository.save(new Customer("David", "Palmer"));
			repository.save(new Customer("Michelle", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			/*for (Customer bauer : repository.findByFirstName("Bauer")) {
				log.info(bauer.toString());
			}*/
			log.info("");
		};
	}

	
	
}
