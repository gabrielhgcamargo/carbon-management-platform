package br.facens.carbon_management_platform.controller;

import br.facens.carbon_management_platform.dto.CalculatorRequest;
import br.facens.carbon_management_platform.dto.CalculatorResponse;
import br.facens.carbon_management_platform.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
@CrossOrigin(origins = "http://localhost:3000")
public class CalculatorController {

    @Autowired
    private CalculatorService service;

    @PostMapping
    public ResponseEntity<CalculatorResponse> calculateCarbonFootprint(@RequestBody CalculatorRequest request) {

        double emissaoTotal = service.calculateCarbonFootprint(request.getKwh(), request.getGasm3(), request.getGasBotijao(),
                                                                request.getQtdGasolinaLitros(), request.getQtdGNVMetroCubico(), request.getQtdEtanolLitros());

        CalculatorResponse response = new CalculatorResponse(emissaoTotal);
        return ResponseEntity.ok(response);
    }
}
