package com.mphasis.shopping1;

public class Battery extends Product {
	    private int capacity;
	    
// Parameterized constructor
	    public Battery(String productId, String productName, double price, int capacity) {
	        super(productId, productName, price);
	        this.capacity = capacity;
	    }
	    
	    // Getter and setter for capacity
	    public int getCapacity() {
	        return capacity;
	    }
	    
	    public void setCapacity(int capacity) {
	        this.capacity = capacity;
	    }
	}
