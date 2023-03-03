package com.canddella.flightreservation.repository;

import com.canddella.flightreservation.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("from User where email=:email ")
	User findByEmail(@Param("email") String email);

}