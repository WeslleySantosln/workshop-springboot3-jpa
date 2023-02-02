package com.wkconsultancy.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wkconsultancy.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
	
}
