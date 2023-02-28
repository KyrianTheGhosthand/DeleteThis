package com.example.demofinal.controller;

import com.example.demofinal.model.dto.ReceiptDTO;
import com.example.demofinal.repository.ReceiptRepository;
import com.example.demofinal.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiptController {
    @Autowired
    private ReceiptService receiptService;

    @PostMapping(value = "/receipt/create")
    public ResponseEntity<?> createReceipt(@RequestBody ReceiptDTO receiptDTO){
        return ResponseEntity.ok(receiptService.createReceipt(receiptDTO));
    }


}
