package com.mregg.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mregg.main.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
 
    public Customer findByFirstName(String name);

	public Customer findById(int id);
 
}