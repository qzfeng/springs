package com.studying.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {

    public String sayHello() {
        return "Hello world!";
    }

    @Override
    public boolean sayTrue() {
        return false;
    }
}
