package com.capg.capstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.capstore.bean.Product;
import com.capg.capstore.repo.ProductRepo;

@Service
public class ProductServiceImpl  implements ProductService{

	
		@Autowired
		private ProductRepo repo;
		@Override
		public Iterable<Product> getAllProducts() {
			return repo.findAll();
			
		}
		
	@Override
	public Optional<Product> getProductById(int id) {
		return repo.findById(id);
		
	}
 
}
