package com.eshlon.shopGuru.services;

import org.springframework.security.core.userdetails.UserDetails;

import com.eshlon.shopGuru.model.User;

public class MyUserDetails implements UserDetails{
	
	private User user;
	
	public MyUserDetails(User user) {
		this.user = user;
	}
	
	public MyUserDetails() {
		// TODO Auto-generated constructor stub
	}
}
