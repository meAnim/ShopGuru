package com.eshlon.shopGuru.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.eshlon.shopGuru.model.Role;

@Entity
@Table(name = "auth_user")
public class User {
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String vPassword;
	private String status;
	private List<Role> roles;
}
