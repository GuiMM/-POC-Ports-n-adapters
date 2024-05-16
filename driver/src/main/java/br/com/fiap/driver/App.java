package br.com.fiap.driver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.fiap.driver")
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
