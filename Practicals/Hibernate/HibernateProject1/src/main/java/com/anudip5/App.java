package com.anudip5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	System.out.println( "Connection started" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Student s1=new Student();
        s1.setId(101);
        s1.setName("RAJ");
        s1.setMarks(87);
        System.out.println(s1);
        
        
        Session session =factory.openSession();
        Transaction tx= session.beginTransaction();
        session.save(s1);
        tx.commit();
        session.close();
    }
}
