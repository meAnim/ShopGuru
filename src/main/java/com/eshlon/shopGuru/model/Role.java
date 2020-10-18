package com.eshlon.shopGuru.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "auth_role")
public class Role {

	private int id;
	private String role;
	private String desc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + ", desc=" + desc + "]";
	}
	
	
	
}
