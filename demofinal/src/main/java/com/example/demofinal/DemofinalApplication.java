package com.example.demofinal;

import com.example.demofinal.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemofinalApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemofinalApplication.class, args);
    }

    @Autowired
    private ReceiptRepository receiptRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ServicesRepository servicesRepository;
    @Autowired
    private StaffRepository staffRepository;
    @Autowired
    private WalletRepository walletRepository;
    @Override
    public void run(String... args) throws Exception {

    }
}
