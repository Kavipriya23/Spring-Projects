package com.mphasis.shopping;

public abstract class Product {
	    private String productId;
	    private String productName;
	    private double price;

	    // Getters and setters
	    public String getProductId() {
	        return productId;
	    }

	    public void setProductId(String productId) {
	        this.productId = productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }
	    
}