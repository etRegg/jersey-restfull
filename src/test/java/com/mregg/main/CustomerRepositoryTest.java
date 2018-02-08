package com.mregg.main;




import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.test.context.junit4.SpringRunner;

import com.mregg.main.model.*;
import com.mregg.main.repository.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Configure.class)
@EnableJpaRepositories(basePackages = { "com.mregg.main.repository" })
public class CustomerRepositoryTest {

	private static final Logger log = LoggerFactory.getLogger(CustomerRepositoryTest.class);

	@PersistenceContext	
	private EntityManager entityManager;

 
    @Autowired
    private CustomerRepository customerRepository;
 
    // write test cases here
    @Test
    public void whenFindByName_thenReturnCustomer() {
        //before
    	List<Customer> l1=this.entityManager.createQuery( "from Customer", Customer.class ).getResultList();
    	log.info(l1.toString());
    	Assert.assertEquals(l1.size(), 0);
    	// given
        Customer  alex = new Customer("alex","papas");
        customerRepository.save(alex);
        // when
       Customer found = customerRepository.findById(alex.getId());
     
        // then
       Assert.assertEquals(found.toString(),alex.toString());
    
    //after 
        List<Customer> l2=this.entityManager.createQuery( "from Customer", Customer.class ).getResultList();
        Assert.assertEquals(l2.size(),1);
    }
    
 
}