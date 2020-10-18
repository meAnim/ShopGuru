package com.eshlon.shopGuru.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "auth_user")
public class User {
	private int id;
	private String firstname;
}
