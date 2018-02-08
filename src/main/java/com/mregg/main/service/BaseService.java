package com.mregg.main.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
public class BaseService {
	@PersistenceContext	
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
  
}
