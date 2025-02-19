package com.ecommerce.online.DAO;

import com.ecommerce.online.entity.User_Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupRepository extends JpaRepository<User_Group, Long> {

}
