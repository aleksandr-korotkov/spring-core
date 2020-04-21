package org.shop;

import org.shop.configs.ParentConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        System.out.println("random is " + dataInitializer.randomInt);
    }
}
