package com.shop.cafe.dto;

public class Product {
	private int prodcode,price;
	private String prodnamee, pimg;
	public int getProdcode() {
		return prodcode;
	}
	public void setProdcode(int prodcode) {
		this.prodcode = prodcode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProdnamee() {
		return prodnamee;
	}
	public void setProdnamee(String prodnamee) {
		this.prodnamee = prodnamee;
	}
	public String getPimg() {
		return pimg;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [prodcode=" + prodcode + ", price=" + price + ", prodnamee=" + prodnamee + ", pimg=" + pimg
				+ "]";
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}
	public Product(int prodcode, int price, String prodnamee, String pimg) {
		super();
		this.prodcode = prodcode;
		this.price = price;
		this.prodnamee = prodnamee;
		this.pimg = pimg;
	}
}
