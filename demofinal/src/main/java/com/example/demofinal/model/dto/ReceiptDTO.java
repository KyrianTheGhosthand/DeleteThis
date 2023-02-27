package com.example.demofinal.model.dto;

import jakarta.validation.constriants.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class ReceiptDTO {
    @NotNull
    private int staffId;
    private CustomerDTO customer;
    private String address;

    private Date timeEst;
    private Set<ServiceDTO> services;
}
