package br.com.fiap.driver.controller;

import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/hello")
    ResponseEntity hello() {
        return ResponseEntity.ok().body("Hello world");
    }
}
