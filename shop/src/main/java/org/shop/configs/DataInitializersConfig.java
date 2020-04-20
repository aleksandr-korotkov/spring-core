package org.shop.configs;

import org.shop.*;
import org.shop.api.ProductService;
import org.shop.api.UserService;
import org.shop.common.Sellers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.HashMap;
import java.util.Map;

@Configuration
@Import(ServiceConfig.class)
public class DataInitializersConfig {

    @Bean(name = "sellerNames")
    public Map<Long, String> sellerNames() {
        Map<Long, String> sellers = new HashMap<>();
        sellers.put(1l, Sellers.AMAZON);
        sellers.put(2l, Sellers.SAMSUNG);
        return sellers;
    }

    @Bean
    public SellerInitializer sellerInitializer(){
        return new SellerInitializer();
    }

    @Bean
    public UserInitializer userInitializer(UserService userService){
        return new UserInitializer(userService);
    }

    @Bean
    public ProposalInitializer proposalInitializer(){
        return new ProposalInitializer();
    }

    @Bean
    public ProductInitializer productInitializer(ProductService productService){
        return new ProductInitializer(productService);
    }

    @Bean(initMethod = "initData")
    public DataInitializer dataInitializer(){
        return new DataInitializer();
    }
}