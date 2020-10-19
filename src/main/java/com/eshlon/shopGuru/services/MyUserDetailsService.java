package com.eshlon.shopGuru.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.eshlon.shopGuru.repo.UserRepository;

public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	UserRepository userRepo;
}
