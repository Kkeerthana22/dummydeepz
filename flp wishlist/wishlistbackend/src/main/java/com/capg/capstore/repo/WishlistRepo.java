package com.capg.capstore.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.capstore.bean.Wishlist;


@Repository
public interface WishlistRepo extends CrudRepository<Wishlist, Integer>{
	

}

