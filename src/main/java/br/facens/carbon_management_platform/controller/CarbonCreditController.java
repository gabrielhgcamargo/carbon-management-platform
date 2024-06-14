package br.facens.carbon_management_platform.controller;

import br.facens.carbon_management_platform.model.CarbonCredit;
import br.facens.carbon_management_platform.service.CarbonCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carbon-credits")
public class CarbonCreditController {

    @Autowired
    private CarbonCreditService service;

    @GetMapping
    public List<CarbonCredit> getAllCredits() {
        return service.findAll();
    }

    @PostMapping
    public CarbonCredit createCredit(@RequestBody CarbonCredit credit) {
        return service.save(credit);
    }

    @DeleteMapping("/{id}")
    public void deleteCredit(@PathVariable String id) {
        service.deleteById(id);
    }
}