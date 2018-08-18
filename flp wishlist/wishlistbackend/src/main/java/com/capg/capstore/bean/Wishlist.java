
package com.capg.capstore.bean;



import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="Wishlist")
public class Wishlist {
	
	@Id
	@Column(name="w_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private int w_id;
	 private int p_id;
   	 private String p_name;
	
	public Wishlist(int w_id, int p_id, String p_name) {
		super();
		this.w_id = w_id;
		this.p_id = p_id;
		this.p_name = p_name;
	}

	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getW_id() {
		return w_id;
	}
	public void setW_id(int w_id) {
		this.w_id = w_id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	
		
		
	}
	
	
