package com.example.demofinal.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Table
@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String phone;
    private String address;
    @OneToOne
    @JoinColumn(name = "wallet_id")
    private Wallet wallet;
    @OneToMany(mappedBy = "customer")
    private Set<Receipt> receipts;
}
