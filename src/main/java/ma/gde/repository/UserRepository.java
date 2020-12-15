package ma.gde.repository;

import ma.gde.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByNom(String nom);
}