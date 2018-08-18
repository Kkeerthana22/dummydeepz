package com.capg.capstore.service;

import java.util.List;
import java.util.Optional;

import com.capg.capstore.bean.Product;
import com.capg.capstore.bean.Wishlist;

public interface WishlistService {
   

	
	
	public Wishlist addToWishlist(Wishlist w);
	public Iterable<Wishlist> showItems() ;
	public void deleteFromWishlistById(int w_id);

}
