package springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springboot.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
    void deleteById(Long id);
}
