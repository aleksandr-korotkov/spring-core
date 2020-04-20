package org.shop.configs;

import org.shop.repository.*;
import org.shop.repository.map.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:value.properties")
public class RepositoryConfig {

    @Value("${sequence}")
    Long sequence;

    @Bean
    public ItemRepository itemRepository(){
        return new ItemMapRepository();
    }

    @Bean
    public OrderRepository orderRepository(){
        OrderMapRepository orderMapRepository = new OrderMapRepository();
        orderMapRepository.setSequence(sequence);
        return orderMapRepository;
    }

    @Bean
    public ProductRepository productRepository(){
        return new ProductMapRepository();
    }

    @Bean
    public ProposalRepository proposalRepository(){
        return new ProposalMapRepository();
    }

    @Bean(name = "sellerRepositoryBean")
    public SellerRepository sellerRepository(){
        return new SellerMapRepository();
    }
}
