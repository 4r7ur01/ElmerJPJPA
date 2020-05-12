package com.alvaro.projects.model.services;

import java.util.List;

import com.alvaro.projects.model.entity.Product;

public interface IProductService {
	
	List<Product> findAll();
	
}
