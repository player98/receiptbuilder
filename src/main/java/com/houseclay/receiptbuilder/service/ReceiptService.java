package com.houseclay.receiptbuilder.service;

import com.houseclay.receiptbuilder.model.Receipt;
import com.houseclay.receiptbuilder.model.dto.ReceiptDTO;
import com.houseclay.receiptbuilder.repository.ReceiptBuilderRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class ReceiptService {

    @Autowired
    ReceiptBuilderRepository receiptBuilderRepository;

    @Autowired
    ReceiptHelper receiptHelper;

    public void addReceipt(ReceiptDTO receiptdto){
        Receipt receipt = receiptHelper.convertDto(receiptdto);
        receiptBuilderRepository.insert(receipt);
        System.out.println("Inserted into DB");
    }




}
