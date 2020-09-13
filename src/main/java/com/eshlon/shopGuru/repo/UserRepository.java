package com.eshlon.shopGuru.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eshlon.shopGuru.model.User;

public interface UserRepository extends JpaRepository<User , Integer>{
	
	User findByEmail(String email);
}
