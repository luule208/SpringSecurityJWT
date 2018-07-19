package intern.luule.springmvcjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import intern.luule.springmvcjwt.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    User findAllById(Integer id);
    User findByUsername(String username);
}
