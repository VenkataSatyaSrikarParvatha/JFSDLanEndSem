package com.klef.jfsd.exam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_table")
public class Customer {
	
	   @Id
	   @Column(name="cid")
	   private int id;
	   @Column(name="cname",nullable=false,length = 50)
	   private String name;
	   @Column(name="cemail",nullable=false,unique = true,length = 50)
	   private String email;
	   @Column(name="cphno",nullable=false,unique = true,length = 20)
	   private String phno;
	   @Column(name="caddress",nullable=false,length = 50)
	   private String address;
	   @Column(name="dateofbirth",length = 50)
	   private String dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

}
