package br.facens.carbon_management_platform.controller;

import br.facens.carbon_management_platform.dto.CalculatorRequest;
import br.facens.carbon_management_platform.dto.CalculatorResponse;
import br.facens.carbon_management_platform.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService service;

    @GetMapping
    public ResponseEntity<CalculatorResponse> calculateCarbonFootprint(@RequestBody CalculatorRequest request) {

        double emissaoTotal = service.calculateCarbonFootprint(request.getKwh(), request.getGasm3(), request.getGasBotijao(),
                                                                request.getQtdGasolinaLitros(), request.getQtdGNVMetroCubico(), request.getQtdEtanolLitros());

        CalculatorResponse response = new CalculatorResponse(emissaoTotal);
        return ResponseEntity.ok(response);
    }
}
