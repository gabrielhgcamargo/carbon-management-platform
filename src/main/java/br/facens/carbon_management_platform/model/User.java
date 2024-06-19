package br.facens.carbon_management_platform.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "user")
public class User {

    @Id
    private String cnpj;
    private String nomeEmpresa;
    private String razaoSocial;
    private String address;
    private String email;
    private String password;
    private List<String> carbonCreditIds;
    private Double creditAmount;
    // atributo ->  visto por último (datetime)

    public User (){
        this.creditAmount = 0.00d; // Inicialmente 0
        this.carbonCreditIds = new ArrayList<>(); // Valor inicial padrão
    }
}
