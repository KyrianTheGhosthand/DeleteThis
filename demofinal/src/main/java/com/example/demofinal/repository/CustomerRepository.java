package com.example.demofinal.repository;

import com.example.demofinal.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findByPhone(String phone);
}
