package com.example.demofinal.service;

import com.example.demofinal.model.dto.ReceiptDTO;
import com.example.demofinal.model.dto.ServiceDTO;
import com.example.demofinal.model.entity.*;
import com.example.demofinal.repository.*;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class ReceiptServiceImplement implements ReceiptService{
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

    @Transactional
    @Override
    public Receipt createReceipt(ReceiptDTO dto){
        Receipt receipt = new Receipt();
        ModelMapper mapper = new ModelMapper();

        Product productNew = mapper.map(dto.getProduct(), Product.class);
        receipt.setProduct(productNew);
        Customer customer = customerRepository.findByPhone(dto.getCustomer().getPhone());
        if(customer != null){
            receipt.setCustomer(customer);
        }
        else {
            Wallet wallet = new Wallet();
            wallet.setAccount_num(dto.getCustomer().getWallet().getAccount_num());
            wallet.setBalance(dto.getCustomer().getWallet().getBalance());
            walletRepository.save(wallet);
            Customer customerNew = mapper.map(dto.getCustomer(), Customer.class);
            customerNew.setWallet(wallet);
            customerRepository.save(customerNew);
            receipt.setCustomer(customerNew);
        }
        receipt.setStatus("Blah blah blah blah...");
        Date currentDate = new Date(System.currentTimeMillis());
        System.out.println("CurrentL " + currentDate);
        receipt.setTimeOrder(currentDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DATE, 7);
        currentDate = calendar.getTime();
        System.out.println("Estimate: "+ currentDate);
        receipt.setTimeEst(currentDate);


        receiptRepository.save(receipt);
        return receipt;
    }

    @Override
    public String updateReceipt(Receipt dto) {
        return null;
    }

    public Services createService(ServiceDTO dto){
        return null;
    }

//    @Override
//    public String updateReceipt(ReceiptDTO dto){
//        return null;
//    }
}
