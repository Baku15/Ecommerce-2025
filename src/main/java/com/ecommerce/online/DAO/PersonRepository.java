package com.ecommerce.online.DAO;

import com.ecommerce.online.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Persona, Long> {


}
