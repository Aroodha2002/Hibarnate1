package com.tap.manytoone;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="oid")
	private int oid;
	@Column(name="item")
	private String item;
	@Column(name="price")
	private int price;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cid")
	private Customer cus_detail;
	
	
	public Orders(String item, int price, Customer cus_detail) {
		super();
		this.item = item;
		this.price = price;
		this.cus_detail = cus_detail;
	}
	public Customer getCus_detail() {
		return cus_detail;
	}
	public void setCus_detail(Customer cus_detail) {
		this.cus_detail = cus_detail;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Orders(String item, int price) {
		super();
		this.item = item;
		this.price = price;
	}
	public Orders(int oid, String item, int price) {
		super();
		this.oid = oid;
		this.item = item;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", item=" + item + ", price=" + price + "]";
	}
	
	
	

}
