package io.egen.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesterComplex {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-app");
		EntityManager em = emf.createEntityManager();
//		
//		User usr = new User();
//		usr.setEmail("venki.pasala@gmail.com");
//		usr.setFirstName("Venkatesh");
//		usr.setLastName("Pasala");
//		
//		Address adr = new Address();
//		adr.setCity("Atlanta");
//		adr.setState("GA");
//		adr.setZip("30005");
//		adr.setStreet("Summerwood lane");
//		
//		
//		em.getTransaction().begin();
//		em.persist(adr);
//		usr.setAddress(adr);
//		em.persist(usr);
//		em.getTransaction().commit();
		
//		User usr = em.find(User.class, "f1e0198b-7b5b-454a-936c-84bf8fe500b4");
//		System.err.println(usr.getEmail());
//		System.err.println(usr.getAddress().getZip());
		em.close();
		emf.close();
		
	}
}
