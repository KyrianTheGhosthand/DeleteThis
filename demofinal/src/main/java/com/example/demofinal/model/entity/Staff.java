package com.example.demofinal.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Table
@Entity
@Getter
@Setter
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String phone;
    @OneToOne
    @JoinColumn(name = "wallet_id")
    private Wallet wallet;
    @ManyToMany(mappedBy = "staffs")
    private Set<Receipt> receipts;
}
