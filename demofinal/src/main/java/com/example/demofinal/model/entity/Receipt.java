package com.example.demofinal.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Table(name = "order")
@Entity
@Getter
@Setter
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String note;
    private Date timeOrder;
    private Date timeEst;
    private String status;
    private float total;

    @ManyToOne
    @JoinColumn(name ="customer_id")
    private Customer customer;
    @ManyToMany
    @JoinTable(name = "staff_receipt", joinColumns = @JoinColumn(name = "receipt_id"),
    inverseJoinColumns = @JoinColumn(name = "staff_id"))
    private Set<Staff> staffs;
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToMany
    @JoinTable(name = "service_order", joinColumns = @JoinColumn(name = "receipt_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id"))
    private Set<Service> services;


}
