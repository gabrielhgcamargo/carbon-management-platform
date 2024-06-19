package br.facens.carbon_management_platform.dto;

import lombok.Data;

@Data
public class CalculatorResponse {

    private double emissaoTotal;


    public CalculatorResponse(double emissao){
        this.emissaoTotal = emissao;
    }
}

