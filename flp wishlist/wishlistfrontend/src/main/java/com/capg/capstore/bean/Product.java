package com.capg.capstore.bean;




public class Product {
	
	  private int p_id;
	
	  private String p_name;
	
	  private String p_model;
	  
	  private double p_price;

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

	public String getP_model() {
		return p_model;
	}

	public void setP_model(String p_model) {
		this.p_model = p_model;
	}

	public double getP_price() {
		return p_price;
	}

	public void setP_price(double p_price) {
		this.p_price = p_price;
	}

	public Product(int p_id, String p_name, String p_model, double p_price) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_model = p_model;
		this.p_price = p_price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	  
}