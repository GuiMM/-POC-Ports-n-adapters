package com.fiap.burguer.adapter.driver.config;

import com.fiap.burguer.adapter.driven.repository.ProductRepository;
import com.fiap.burguer.core.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Autowired
    ProductRepository productRepository;

    @Bean
    public ProductService getProductService(){
        return new ProductService(productRepository);
    }
}