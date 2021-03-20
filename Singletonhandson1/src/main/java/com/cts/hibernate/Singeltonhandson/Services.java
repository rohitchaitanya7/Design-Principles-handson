package com.cts.hibernate.Singeltonhandson;

public class Services {
	private int productid;
	private String productname;
	
	
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Services(int productid, String productname) {
		super();
		this.productid = productid;
		this.productname = productname;
	}
	
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	
	@Override
	public String toString() {
		return "Services [productid=" + productid + ", productname=" + productname + "]";
	}
	

}
