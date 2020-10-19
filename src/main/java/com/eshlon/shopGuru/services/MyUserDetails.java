package com.eshlon.shopGuru.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
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
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		this.user.getRoles().forEach(p->{
			GrantedAuthority authority = new SimpleGrantedAuthority(p.getRole().toString());
			authorities.add(authority);
		});
		return authorities;
	}
}
