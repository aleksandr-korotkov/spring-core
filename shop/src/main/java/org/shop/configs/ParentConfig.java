package org.shop.configs;

import org.shop.annotations.InjectRandomIntBeanPostProcessor;
import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("org.shop.aop")
@Import({RepositoryConfig.class, ServiceConfig.class,
        DataInitializersConfig.class,FactoryConfig.class})
public class ParentConfig {

    @Bean
    public InjectRandomIntBeanPostProcessor injectRandomIntBeanPostProcessor(){
        return new InjectRandomIntBeanPostProcessor();
    }
}