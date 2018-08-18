package com.capg.capstore.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.capstore.bean.Product;
import com.capg.capstore.bean.Wishlist;
import com.capg.capstore.repo.WishlistRepo;




@Service

public class WishlistServiceImpl  implements WishlistService{

	
@Autowired
private WishlistRepo repo;

	
	@Override
	public Wishlist addToWishlist(Wishlist w) {
	
	return repo.save(w);
		
	}

	@Override
	public Iterable<Wishlist> showItems() {
		return repo.findAll();
	
	}

	@Override
	public void deleteFromWishlistById(int w_id) {
		
		
		 repo.deleteById(w_id);
		 
 
	}


	

}
