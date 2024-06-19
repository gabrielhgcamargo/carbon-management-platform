package br.facens.carbon_management_platform.dto;

import lombok.Data;

@Data
public class CalculatorRequest {

    private double kwh;
    private double gasm3;
    private double gasBotijao;
    private double qtdGasolinaLitros;
    private double qtdGNVMetroCubico;
    private double qtdEtanolLitros;
}
