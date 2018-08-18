package com.capg.capstore.service;

import java.util.Optional;

import com.capg.capstore.bean.Product;

public interface ProductService {

	public Optional<Product> getProductById(int id);
	public Iterable<Product> getAllProducts() ;
	
	
}
