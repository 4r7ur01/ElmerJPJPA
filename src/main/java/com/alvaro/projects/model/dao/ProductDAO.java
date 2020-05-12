package com.alvaro.projects.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.alvaro.projects.model.entity.Product;

public interface ProductDAO extends CrudRepository<Product, Integer>{

}
