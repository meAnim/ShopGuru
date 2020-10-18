package com.eshlon.shopGuru.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eshlon.shopGuru.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByEmail(String email);
	
	User findById(int id);
}
