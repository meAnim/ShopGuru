package com.eshlon.shopGuru.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "auth_role")
public class Role {

	private int id;
	private String role;
}
