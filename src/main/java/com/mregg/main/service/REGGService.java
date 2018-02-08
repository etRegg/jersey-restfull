package com.mregg.main.service;

import java.util.List;



public interface REGGService<t> {
	List<t> getAllLimit(int base,int gap);
     List<t> getAll();
     t getById(int d);
     boolean add(t o);
     void update(t i);
     void delete(int id);
} 