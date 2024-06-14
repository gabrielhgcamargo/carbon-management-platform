package br.facens.carbon_management_platform.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "carbonCredits")
public class CarbonCredit {

    @Id
    private String id;
    private String categoryName;
    private double amount;
    private String owner;


}
