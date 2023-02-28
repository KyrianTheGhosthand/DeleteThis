package com.example.demofinal.service;

import com.example.demofinal.model.dto.ReceiptDTO;
import com.example.demofinal.model.entity.Receipt;

public interface ReceiptService {
    Receipt createReceipt(ReceiptDTO dto);
    String updateReceipt(Receipt dto);
}
