package br.com.fiap.driver.config;

import br.com.fiap.core.service.HelloService;
import br.com.fiap.core.ports.HelloServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public HelloServiceInterface helloInterface(){
        return new HelloService();
    }
}
