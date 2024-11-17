package com.tap.manytoone;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {

	public static void main(String[] args) {
		Session session = new Configuration().configure()
		.addAnnotatedClass(Customer.class).
		addAnnotatedClass(CustomerDetail.class).
		addAnnotatedClass(Orders.class)
		.buildSessionFactory().openSession();
		
		Transaction t = session.beginTransaction();
		CustomerDetail cd=new CustomerDetail("sachin@gmail.com", "45586242");
		Customer c=new Customer("sachin", cd);
		
		Orders o1=new Orders("pizza", 100, c);
		Orders o2=new Orders("Dosa", 50, c);
		session.persist(o1);
		session.persist(o2);
		t.commit();
		System.out.println("Data inserted");
		
		

	}

}
