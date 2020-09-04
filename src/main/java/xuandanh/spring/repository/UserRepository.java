package xuandanh.spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import xuandanh.spring.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}