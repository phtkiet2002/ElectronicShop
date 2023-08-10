package com.asm.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.asm.Entity.Authority;


import lombok.Data;

@Data
@Entity
@Table(name="Accounts")
public class Account implements Serializable{
	@Id
	String username;
	String password;
	String fullname;
	String email;
	String photo;
	@JsonIgnore
	@OneToMany(mappedBy="account")
	List<Order> orders;
	
	@JsonIgnore
	@OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
	List<Authority> authorities;

	
//	public Account(String username, String password, String fullname, String email, String photo, List<Order> orders) {
//		super();
//		this.username = username;
//		this.password = password;
//		this.fullname = fullname;
//		this.email = email;
//		this.photo = photo;
//		this.orders = orders;
//	}
//	public Account() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	
}
