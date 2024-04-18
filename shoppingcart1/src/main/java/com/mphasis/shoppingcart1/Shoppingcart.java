package com.mphasis.shoppingcart1;
import java.util.ArrayList;
import java.util.List;
public class Shoppingcart {
		private List<Product> items = new ArrayList<>();

		public void addItem(Product item) {
			items.add(item);
		}

		public List<Product> getItems() {
			return items;
		}
	}

