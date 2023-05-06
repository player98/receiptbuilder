package com.houseclay.receiptbuilder.service;

import com.houseclay.receiptbuilder.model.Receipt;
import com.houseclay.receiptbuilder.model.dto.ReceiptDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

@Component
public class ReceiptHelper {


    public Receipt convertDto(ReceiptDTO receiptDTO) {
        return Receipt.builder()
                .uuid(UUID.randomUUID()).billNumber(generateBillNo().toString()).billDate(new Date()).place("BANGALORE").amount(receiptDTO.getAmount()).address(receiptDTO.getAddress())
                .name(receiptDTO.getName()).email(receiptDTO.getEmail()).mobile(receiptDTO.getMobile()).customerAddress(receiptDTO.getCustomerAddress()).customerPAN(receiptDTO.getCustomerPAN()).brokerageAmount(receiptDTO.getBrokerageAmount()).inWords(receiptDTO.getInWords())
                        .receiverName(receiptDTO.getReceiverName()).receiverPAN(receiptDTO.getReceiverPAN()).receiverMobileNumber(receiptDTO.getReceiverMobileNumber()).receiverModeOfPayment(receiptDTO.getReceiverModeOfPayment()).build();
    }


    public Long generateBillNo() {
        return 101L;
    }
}
