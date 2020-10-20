package com.eshlon.shopGuru.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.eshlon.shopGuru.model.User;
import com.eshlon.shopGuru.repo.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = userRepo.findByEmail(userName);
		MyUserDetails myUserDetails = new MyUserDetails(user);
		System.out.println(myUserDetails.getAuthorities().toString());
		return myUserDetails; 
	}
}
