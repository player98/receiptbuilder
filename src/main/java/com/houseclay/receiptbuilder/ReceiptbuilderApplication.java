package com.houseclay.receiptbuilder;

import com.houseclay.receiptbuilder.model.Receipt;
import com.houseclay.receiptbuilder.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ReceiptbuilderApplication implements CommandLineRunner {

	@Autowired
	ReceiptService receiptService;

	public static void main(String[] args) {
		SpringApplication.run(ReceiptbuilderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Receipt receipt = Receipt.builder().uuid(UUID.randomUUID()).billNumber("101").billDate(new Date()).amount(20000.0).address("B234, Krishvi Gavakshi").name("Asif").email("asif.ali@gmai.com").mobile("7892014327").build();
		//receiptService.addReceipt(receipt);
	}
}
