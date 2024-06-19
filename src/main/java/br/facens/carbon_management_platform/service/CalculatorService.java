package br.facens.carbon_management_platform.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private static final double EMISSAO_ELETRECIDADE_POR_KWH = 0.075;
    private static final double EMISSAO_GAS_M3 = 2.0671;
    private static final double EMISSAO_GAS_BOTIJAO = 2.9380;

    // Fatores de emissão para gasolina, etanol e GNV (em kg CO2e por litro)
    private static final double EMISSAO_GASOLINA_POR_LITRO = 2.31;
    private static final double EMISSAO_ETANOL_POR_LITRO = 1.94;
    private static final double EMISSAO_GNV_POR_LITRO = 1.96;

    public double calculateCarbonFootprint(double  kwh, double gasm3, double gasBotijao,
                                           double qtdGasolinaLitros,
                                           double qtdGNVMetroCubico,
                                           double qtdEtanolLitros) {

        double emissaoEletrecidade = kwh * EMISSAO_ELETRECIDADE_POR_KWH;
        double emissaoGasM3 = gasm3 * EMISSAO_GAS_M3;
        double emissaoGasBotijao = gasBotijao * EMISSAO_GAS_BOTIJAO;
        double emissaoGasolina = qtdGasolinaLitros * EMISSAO_GASOLINA_POR_LITRO;
        double emissaoEtanol = qtdEtanolLitros  * EMISSAO_ETANOL_POR_LITRO;
        double emissaoGNV = qtdGNVMetroCubico  * EMISSAO_GNV_POR_LITRO;

        return emissaoEletrecidade + emissaoGasM3 + emissaoGasBotijao + emissaoGasolina + emissaoEtanol + emissaoGNV;
    }

}