package com.houseclay.receiptbuilder.controller;

import ch.qos.logback.core.boolex.EvaluationException;
import com.houseclay.receiptbuilder.model.dto.ReceiptDTO;
import com.houseclay.receiptbuilder.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/receipts")
public class ReceiptController {

    @Autowired
    ReceiptService receiptService;

    @PostMapping(value = "/brokerage",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> brokerageReceipt(@RequestBody ReceiptDTO receiptDTO) {
        System.out.println(receiptDTO.toString());
        receiptService.addReceipt(receiptDTO);

        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body("Created - OK");
    }
}
