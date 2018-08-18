package com.capg.capstore.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.capstore.bean.Product;
@Repository
public interface ProductRepo  extends CrudRepository<Product, Integer>{

}
