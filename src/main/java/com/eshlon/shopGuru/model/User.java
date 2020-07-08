package com.eshlon.shopGuru.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

@Entity
@Table(name = "auth_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "auth_user_id")
	private int id;

//	@NotEmpty(message = "First name is required")
	@Column(name = "first_name", nullable = false)
	private String firstname;
	
//	@NotEmpty(message = "Last name is required")
	@Column(name = "last_name", nullable = false)
	private String lastname;
	
//	@NotEmpty(message = "email is required")
	@Column(name = "email", nullable = false)
	private String email;
	
//	@NotEmpty(message = "password is required")
	@Column(name = "password", nullable = false)
	private String password;
	
	@Transient
	private String vPassword;

	@Column(name = "status", nullable = false)
	private String status;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "auth_user_role", joinColumns = @JoinColumn(name = "auth_user_id"), inverseJoinColumns = @JoinColumn(name = "auth_role_id"))
	
	private Set<Role> roles;
	

	public User(String firstname, String lastname, String email, String password, String status, Set<Role> roles) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.status = status;
		this.roles = roles;
	}
	
	public User() {
		
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getvPassword() {
		return vPassword;
	}

	public void setvPassword(String vPassword) {
		this.vPassword = vPassword;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", password=" + password
				+ ", vPassword=" + vPassword + ", status=" + status + ", roles=" + roles + "]";
	}

}

//User for JPA Spring Authentication

//import javax.persistence.Cacheable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//import org.hibernate.annotations.Cache;
//import org.hibernate.annotations.CacheConcurrencyStrategy;

//@Entity
//@Table(name = "appuser")
//@Cacheable
//@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
//public class User {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long id;
//	@Column(nullable = false)
//	private String fname;
//	@Column(nullable = false)
//	private String lname;
//	@Column(nullable = false, unique = true)
//	private String username;
//	@Column(nullable = false)
//	private String dateofbirth;
//	@Column(nullable = false)
//	private String country;
//	@Column(nullable = false)
//	private String password;
//	@Transient
//	private String vPassword;
//	@Column(nullable = false)
//	private String roles;
//	@Column(nullable = false)
//	private boolean enabled;
//
//	public User() {
//		
//	}
//
//	public User(String fname, String lname, String username, String dateofbirth, String country, String password,
//			String roles, boolean enabled) {
//		super();
//		this.fname = fname;
//		this.lname = lname;
//		this.username = username;
//		this.dateofbirth = dateofbirth;
//		this.country = country;
//		this.password = password;
//		this.roles = roles;
//		this.enabled = enabled;
//	}
//
//
//	
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getFname() {
//		return fname;
//	}
//
//	public void setFname(String fname) {
//		this.fname = fname;
//	}
//
//	public String getLname() {
//		return lname;
//	}
//
//	public void setLname(String lname) {
//		this.lname = lname;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getdateofbirth() {
//		return dateofbirth;
//	}
//
//	public void setdateofbirth(String dateofbirth) {
//		this.dateofbirth = dateofbirth;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getRoles() {
//		return roles;
//	}
//
//	public void setRoles(String roles) {
//		this.roles = roles;
//	}
//
//	public boolean isEnabled() {
//		return enabled;
//	}
//
//	public void setEnabled(boolean enabled) {
//		this.enabled = enabled;
//	}
//
//	@Override
//	public String toString() {
//		return "User [fname=" + fname + ", lname=" + lname + ", username=" + username + ", dateofbirth=" + dateofbirth
//				+ ", country=" + country + ", password=" + password + ", roles=" + roles + ", enabled=" + enabled + "]";
//	}

//}
