package com.example.eurekaservicedemo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String printHello(){
        return "Hello";
    }
}
