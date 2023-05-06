package com.houseclay.receiptbuilder.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import java.util.Date;
import java.util.UUID;

@Document(value = "brokeragereceipt")
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Data
public class Receipt {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private UUID uuid;

    private String billNumber;
    private Date billDate;
    private String place;

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

    // make a field for signature image
    // to be done

}
