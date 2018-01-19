package com.filip.projects.db.liqui;

import java.util.GregorianCalendar;

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
		Author a = new Author(
				"Zvonko", 
				"Zvonic", 
				new GregorianCalendar(1955, 7, 21).getTime());
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
			
		session.beginTransaction();
		//session.save(a);
//		session.createQuery("delete Author where id = 3").executeUpdate();
		
		session.getTransaction().commit();
	}

}
