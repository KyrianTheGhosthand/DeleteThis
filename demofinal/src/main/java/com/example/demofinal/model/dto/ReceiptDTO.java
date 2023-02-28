package com.example.demofinal.model.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class ReceiptDTO {
    @NotNull
    private int staffId;
    private CustomerDTO customer;

    private Date timeEst;
    private Set<Integer> serviceIds;
    private ProductDTO product;

}
