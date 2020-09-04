package xuandanh.spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import xuandanh.spring.model.Role;
public interface RoleRepository extends JpaRepository<Role, Long>{
}