package com.alvaro.projects.model.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvaro.projects.model.dao.ProductDAO;
import com.alvaro.projects.model.entity.Product;
import com.alvaro.projects.model.services.IProductService;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	private ProductDAO productDAO;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return (List<Product>) productDAO.findAll();
	}
	
	
	
}
