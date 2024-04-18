package com.mphasis.shoppingcart1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Shoppingcart1Application {

	public static void main(String[] args) {
		SpringApplication.run(Shoppingcart1Application.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext3.xml");

		Shoppingcart cart1 = (Shoppingcart) context.getBean("shoppingCart");
		Shoppingcart cart2 = (Shoppingcart) context.getBean("shoppingCart");

		Product product1 = (Product) context.getBean("product1");
		Product product2 = (Product) context.getBean("product2");
		Product product3 = (Product) context.getBean("product3");

		cart1.addItem(product1);
		cart1.addItem(product2);

		cart2.addItem(product1);
		cart2.addItem(product3);

		System.out.println("Items in Cart 1:");
		for (Product item : cart1.getItems()) {
			System.out.println(item.getProductName());
		}

		System.out.println("Items in Cart 2:");
		for (Product item : cart2.getItems())
		{
			System.out.println(item.getProductName());
		}
		context.close();
	}

}

