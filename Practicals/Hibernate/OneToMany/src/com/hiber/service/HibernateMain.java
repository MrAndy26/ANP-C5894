package com.hiber.service;

import java.util.Date;
import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.hiber.demo.Child;

import com.hiber.demo.Parent;

public class HibernateMain {
	public static void main(String[] args) {
		
		//.sessionfactory
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("DemoPadmajaJPA");
		//Session
		EntityManager em=emf.createEntityManager();
		//transaction
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		
        Parent parent = new Parent();
        parent.setP_id("P001");
	    parent.setP_name("Vinod");
         
	     Child child = new Child();
         child.setC_id("C001");
	     child.setC_name("Monu");
         
	     em.persist(child);

         Child child2 = new Child();
         child2.setC_id("C002");
         child2.setC_name("Sintu");
         em.persist(child2);

     	HashSet<Child> childSet = new HashSet<Child>();
         childSet.add(child);
         childSet.add(child2);
         
    	parent.setChildren(childSet);
        em.persist(parent);

		
		et.commit();
		em.close();
		
		
	}

}
