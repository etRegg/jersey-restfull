package com.mregg.main.service;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mregg.main.model.*;

@Service
public  class CustomerService extends BaseService  implements  REGGService<Customer> {

	@Override
	public List<Customer> getAllLimit(int base, int gap) {
		// TODO Auto-generated method stub
		return new ArrayList<Customer>();
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return new ArrayList<Customer>();
	}

	@Override
	public Customer getById(int d) {
		// TODO Auto-generated method stub
		return new Customer("hola","hola");
	}

	@Override
	public boolean add(Customer o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update(Customer i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	

	
	
} 