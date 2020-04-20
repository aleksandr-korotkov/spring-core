package org.shop.configs;

import org.aspectj.lang.annotation.Aspect;
import org.shop.annotations.InjectRandomIntBeanPostProcessor;
import org.shop.aop.LoggerAspect;
import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("org.shop.aop")
@ComponentScan("org.shop.annotations")
@Import({RepositoryConfig.class, ServiceConfig.class,
        DataInitializersConfig.class,FactoryConfig.class})
public class ParentConfig {
    @Bean
    public InjectRandomIntBeanPostProcessor injectRandomIntBeanPostProcessor(){
        return new InjectRandomIntBeanPostProcessor();
    }
}