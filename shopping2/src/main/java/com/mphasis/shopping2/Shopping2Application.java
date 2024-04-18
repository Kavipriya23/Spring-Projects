package com.mphasis.shopping2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Shopping2Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        // Get beans from context
        Product product = (Product) context.getBean("product");
        Battery battery = (Battery) context.getBean("battery");
        Disc disc = (Disc) context.getBean("disc");
        
       //Use beans...
        
       String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
         System.out.println(beanName);
              
       // Assuming you have instances of Product, Battery, and Disc 
       /* double totalPrice = product.getPrice() * (1 - product.getdiscount()) +
                            battery.getPrice() * (1 - battery.getdiscount()) +
                            disc.getPrice() * (1 - disc.getdiscount());*/
        double totalPrice = product.getdiscount();
        System.out.println("Total Price after applying discounts: " + totalPrice);     
        context.close();
    }
    }
}

