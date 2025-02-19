package com.ecommerce.online.DAO;

import com.ecommerce.online.entity.Group_Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRoleRepository extends JpaRepository<Group_Role, Long> {
}
