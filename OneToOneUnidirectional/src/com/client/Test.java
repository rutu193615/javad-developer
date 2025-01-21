package com.client;

import org.hibernate.Session;

import com.config.HibernateUtil;
import com.module.AdharCard;
import com.module.Person;

public class Test {
public static void main(String[] args) {
	

	
	
	
	Session session =HibernateUtil.getSessionFactory().openSession();
	//Person p=new Person();

	
	AdharCard a =new AdharCard();
	a.setAid(1);
	a.setAname("rutu");
	
	System.out.println("rutu");
	Person p=new Person();
	p.setPid(1);
	p.setPname("rutu");
	
	p.setAd(a);
	session.save(p);
	session.beginTransaction().commit();
	
	
	
	
	
}
	
}
