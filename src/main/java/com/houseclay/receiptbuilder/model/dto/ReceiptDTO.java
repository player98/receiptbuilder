package com.houseclay.receiptbuilder.model.dto;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReceiptDTO {

    //private String billNumber;
    //private Date billDate;
    //private String place;

    private Double amount;
    private String address;

    //Customer Details
    private String name;
    private String email;
    private String mobile;
    private String customerAddress;
    private String customerPAN;
    private Double brokerageAmount;
    private String inWords;

    //receiver details
    private String receiverName;
    private String receiverPAN;
    private String receiverMobileNumber;
    private String receiverModeOfPayment;
}
