package br.facens.carbon_management_platform.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Data
@Document(collection = "user")
public class User {

    @Id
    @NonNull
    private String cnpj;
    private String razaoSocial;
    private String adress;
    private String email;
    private String password;
    private String carbonCreditId;

}
