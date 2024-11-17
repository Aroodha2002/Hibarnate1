package com.tap.manytoone;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cid")
	private int cid;
	@Column(name="cname")
	private String cname;
	public int getCid() {
		return cid;
	}
	@OneToMany(mappedBy = "cus_detail")
	private List<Orders> orders;
	
	
	public Customer(String cname, List<Orders> orders, CustomerDetail customerdetail) {
		super();
		this.cname = cname;
		this.orders = orders;
		this.customerdetail = customerdetail;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cdid")
	private CustomerDetail customerdetail;
	
	
	
	
	
	public Customer(String cname, CustomerDetail customerdetail) {
		super();
		this.cname = cname;
		this.customerdetail = customerdetail;
	}
	public CustomerDetail getCustomerdetail() {
		return customerdetail;
	}
	public void setCustomerdetail(CustomerDetail customerdetail) {
		this.customerdetail = customerdetail;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Customer(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	 
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", orders=" + orders + ", customerdetail=" + customerdetail
				+ "]";
	}
	public Customer(String cname) {
		super();
		this.cname = cname;
	}
	public Customer() {
		super();
	}
	
	

}

