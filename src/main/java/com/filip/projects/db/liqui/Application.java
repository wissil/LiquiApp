package com.filip.projects.db.liqui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.filip.projects.db.liqui.models.Author;

public class Application {

	/**
	 * Program entry-point. 
	 * 
	 * @param args No command line argument.
	 */
	public static void main(String[] args) {
		// creates the entity object
		Author a = new Author("Pero", "Peric");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		session.save(a);
		
		session.getTransaction().commit();
	}

}
