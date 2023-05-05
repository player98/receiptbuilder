package com.houseclay.receiptbuilder.repository;

import com.houseclay.receiptbuilder.model.Receipt;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReceiptBuilderRepository extends MongoRepository<Receipt,String> {
}
