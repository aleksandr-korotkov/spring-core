package org.shop;


import org.shop.api.ItemService;
import org.shop.api.ProductService;
import org.shop.api.impl.ItemServiceImpl;
import org.shop.configs.ParentConfig;
import org.shop.data.Product;
import org.shop.data.User;
import org.shop.repository.UserRepository;
import org.shop.repository.map.OrderMapRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * The ShopLauncher class.
 */
public class ShopLauncher {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ParentConfig.class);
        DataInitializer dataInitializer = applicationContext.getBean(DataInitializer.class);
        System.out.println(dataInitializer.randomInt);
    }
}
