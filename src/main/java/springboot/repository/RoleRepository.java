package springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springboot.model.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
