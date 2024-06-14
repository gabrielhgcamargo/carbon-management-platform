package br.facens.carbon_management_platform.repository;

import br.facens.carbon_management_platform.model.CarbonCredit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarbonCreditRepository extends MongoRepository<CarbonCredit, String> {
}
