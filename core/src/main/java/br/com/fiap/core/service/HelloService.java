package br.com.fiap.core.service;

import br.com.fiap.core.ports.HelloServiceInterface;

public class HelloService implements HelloServiceInterface {
    @Override
    public String getHello() {
        return "Hello world";
    }
}
