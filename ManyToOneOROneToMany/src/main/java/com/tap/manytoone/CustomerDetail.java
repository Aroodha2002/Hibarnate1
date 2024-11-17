package com.tap.manytoone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cdid")
	private int cdid;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private String phone;
	
	
	public int getCdid() {
		return cdid;
	}
	public void setCdid(int cdid) {
		this.cdid = cdid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public CustomerDetail(int cdid, String email, String phone) {
		super();
		this.cdid = cdid;
		this.email = email;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "CustomerDetail [cdid=" + cdid + ", email=" + email + ", phone=" + phone + "]";
	}
	public CustomerDetail(String email, String phone) {
		super();
		this.email = email;
		this.phone = phone;
	}
	public CustomerDetail() {
		super();
	}
	
	

}

