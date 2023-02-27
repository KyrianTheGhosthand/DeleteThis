package com.example.demofinal.model.dto;

import lombok.Data;
import com.example.demofinal.model.entity.Wallet;


@Data
public class CustomerDTO {
    private String name;
    private String phone;

    private Wallet wallet;
}
