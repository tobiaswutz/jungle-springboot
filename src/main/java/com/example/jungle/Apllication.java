package com.example.jungle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.jungle.repositories.CustomerRepository;
import com.example.jungle.services.CustomerService;

@Configuration
public class Apllication {

    @Bean
    public CustomerService customerService() {
        return new CustomerService();
    }


    
}
