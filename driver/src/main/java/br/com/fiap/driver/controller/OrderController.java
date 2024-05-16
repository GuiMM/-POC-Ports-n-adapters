package br.com.fiap.driver.controller;

import br.com.fiap.core.ports.HelloServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    HelloServiceInterface helloService;

    @GetMapping("/hello")
    ResponseEntity hello() {
        String result = helloService.getHello();
        return ResponseEntity.ok().body(result);
    }
}
