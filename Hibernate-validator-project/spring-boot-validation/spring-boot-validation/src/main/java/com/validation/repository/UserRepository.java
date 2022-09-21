package com.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.validation.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	

}
