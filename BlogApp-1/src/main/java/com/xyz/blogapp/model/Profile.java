package com.xyz.blogapp.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="profile")
public class Profile {
	@Id
	private int id;
	private String address;
	//private Gender gender;
	//private LocalDate dob;
	@OneToOne(fetch = FetchType.LAZY,cascade =  CascadeType.ALL)
	@JoinColumn(name = "userId")//foreign key
	private User user;
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(int id, String address, User user) {
		super();
		this.id = id;
		this.address = address;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

    
	
	

}
