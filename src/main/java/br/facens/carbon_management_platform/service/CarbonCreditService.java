package br.facens.carbon_management_platform.service;

import br.facens.carbon_management_platform.model.CarbonCredit;
import br.facens.carbon_management_platform.repository.CarbonCreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarbonCreditService {

    @Autowired
    private CarbonCreditRepository repository;

    public List<CarbonCredit> findAll() {
        return repository.findAll();
    }

    public CarbonCredit save(CarbonCredit credit) {
        return repository.save(credit);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}