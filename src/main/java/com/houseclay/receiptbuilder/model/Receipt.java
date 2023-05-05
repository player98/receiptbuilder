package com.houseclay.receiptbuilder.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Receipt")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Receipt {
    @Id
    private String id;

}
