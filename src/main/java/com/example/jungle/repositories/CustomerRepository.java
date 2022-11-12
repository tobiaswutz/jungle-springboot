package com.example.jungle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jungle.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
