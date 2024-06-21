package br.facens.carbon_management_platform.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "carbonCredits")
public class CarbonCredit {

    @Id
    private String id;
    private CarbonCreditCategory categoryName;
    private double amount;
    private double categoryPrice;
    private String owner;
    private String detailedDescription;

    public void calculateCategoryPrice() {
        this.categoryPrice = this.amount * this.categoryName.getPriceMultiplier();
    }

}
