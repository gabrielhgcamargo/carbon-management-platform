package br.facens.carbon_management_platform.repository;

import br.facens.carbon_management_platform.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
