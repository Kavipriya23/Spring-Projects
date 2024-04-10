package com.mphasis.shopping1;

public class Disc extends Product {
		private String format;

// Parameterized constructor
        public Disc(String productId, String productName, double price, String format) {
            super(productId, productName, price);
            this.format = format;
        }
        
		// Getter and setter for format
		public String getFormat() {
			return format;
		}

		public void setFormat(String format) {
			this.format = format;
		}
	}

