package com.capg.capstore.controller;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.capg.capstore.bean.Product;
import com.capg.capstore.bean.Wishlist;
import com.capg.capstore.service.ProductService;
import com.capg.capstore.service.WishlistService;

@RestController
public class WishlistController {
  int count = 1;
	@Autowired
	ProductService service;
	@Autowired
	WishlistService wishlistservice;

	
	
	
	@RequestMapping("/getAllProducts")
	public Iterable<Product> getAllProducts(){
		
		return service.getAllProducts(); 
		 	 }
	
	@RequestMapping("/wishlist")
	public Wishlist addToWishlist(@RequestParam int p_id){
		
	Optional<Product> prod = service.getProductById(p_id);
	Iterable<Wishlist> list= wishlistservice.showItems();
	
	  for(Wishlist wishlist:list)
	  {
		  if(wishlist.getP_id()==p_id)
		  {
			  return  wishlistservice.addToWishlist(wishlist);
		  }
	  }
		Product pro = prod.get();
		Wishlist w = new Wishlist();
				
				w.setP_id(p_id);
				w.setP_name(pro.getP_name());
			  
				wishlistservice.addToWishlist(w);
				return  wishlistservice.addToWishlist(w);
		 	 }
	

	@RequestMapping("/showItems")
	public Iterable<Wishlist> showItems(){
		
		return wishlistservice.showItems(); 
		 	 }
	
	@RequestMapping("/delete")
	public void deleteFromWishlist(@RequestParam int w_id){
	
		 wishlistservice.deleteFromWishlistById(w_id);
		
		 
		 	 }
	
	
	
	
	
	
}
