package com.capg.capstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.capg.capstore.bean.Product;
import com.capg.capstore.bean.Wishlist;
@RestController
public class WishlistFrontcontroller {

@RequestMapping("/index")
public ModelAndView getAllProducts() {
	RestTemplate rt= new RestTemplate();
	Iterable<Product>  p =rt.getForObject("http://localhost:9095/getAllProducts", ArrayList.class);
	return new ModelAndView("index","product",p);
}
	
@RequestMapping("/wishlist/{p_id}")
public ModelAndView getaddToWishlist(@PathVariable int p_id) {
	RestTemplate rt= new RestTemplate();
 Wishlist s = rt.getForObject("http://localhost:9095/wishlist?p_id="+p_id, Wishlist.class);
	return new ModelAndView("wishlist","wish",s);
 
}
@RequestMapping("/wishlistitem")
public ModelAndView showItems() {
	RestTemplate rt= new RestTemplate();
	Iterable<Product>  i = rt.getForObject("http://localhost:9095/showItems", ArrayList.class);
	return new ModelAndView("wishlistitem","item",i);
}
@RequestMapping("/delete/{w_id}")
public String deleteFromWishlist(@PathVariable int w_id) {
	RestTemplate rt= new RestTemplate();
 Wishlist d = rt.getForObject("http://localhost:9095/delete?w_id="+w_id, Wishlist.class);
	return "deleted";
}
 @RequestMapping("/addtocart")
 public String getdata() {
	 RestTemplate rt= new RestTemplate();
	 return "item added tocart";
 }
}


