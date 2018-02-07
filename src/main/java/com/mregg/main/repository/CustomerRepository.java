package com.mregg.main.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mregg.main.model.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}