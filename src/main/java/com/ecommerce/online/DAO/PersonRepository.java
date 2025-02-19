package com.ecommerce.online.DAO;

import com.ecommerce.online.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {


}
