package br.facens.carbon_management_platform.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private static final double EMISSAO_ELETRECIDADE_POR_KWH = 0.075;
    private static final double EMISSAO_GAS_M3 = 2.0671;
    private static final double EMISSAO_GAS_BOTIJAO = 2.9380;

    private static final double GASOLINA_KM_POR_LITRO = 10.0;
    private static final double EMISSAO_GASOLINA_POR_KM = 0.1280;

    private static final double ETANOL_KM_POR_LITRO = 7.0;
    private static final double EMISSAO_ETANOL_POR_KM = 0.0019;

    private static final double GNV_KM_PER_M3 = 14;
    private static final double EMISSAO_GNV_POR_KM = 0.1630;

    public double calculateCarbonFootprint(double  kwh, double gasm3, double gasBotijao,
                                           double kmPercorridoGasolina,
                                           double kmPercorridoGNV,
                                           double kmPercorridoEtanol) {

        double emissaoEletrecidade = kwh * EMISSAO_ELETRECIDADE_POR_KWH;
        double emissaoGasM3 = gasm3 * EMISSAO_GAS_M3;
        double emissaoGasBotijao = gasBotijao * EMISSAO_GAS_BOTIJAO;
        double emissaoGasolina = (kmPercorridoGasolina / GASOLINA_KM_POR_LITRO) * EMISSAO_GASOLINA_POR_KM;
        double emissaoEtanol = (kmPercorridoEtanol / ETANOL_KM_POR_LITRO) * EMISSAO_ETANOL_POR_KM;
        double emissaoGNV = (kmPercorridoGNV / GNV_KM_PER_M3) * EMISSAO_GNV_POR_KM;

        return emissaoEletrecidade + emissaoGasM3 + emissaoGasBotijao + emissaoGasolina + emissaoEtanol + emissaoGNV;
    }

}