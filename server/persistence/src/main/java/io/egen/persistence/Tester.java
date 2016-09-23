package io.egen.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class Tester {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-app");
		
		

		EntityManager em = emf.createEntityManager();
//		INSERT INTO
//		Employee emp = new Employee();
//		emp.setEmail("venki.pasala@gmail.com");
//		emp.setFirstName("venki");
//		emp.setLastName("Pasala");
//				
//		em.getTransaction().begin();
//		em.persist(emp);
//		em.getTransaction().commit();
		
		// find by ID(PK)
//		Employee emp = em.find(Employee.class, "5ea141f9-7a75-4c1b-abd7-a0f424daacaa");
//		System.err.println(emp);
		
		//Update into Database
		
//		Employee emp = em.find(Employee.class, "5ea141f9-7a75-4c1b-abd7-a0f424daacaa");
//		emp.setEmail("pasala.venki@gmail.com");
//		
//		em.getTransaction().begin();
//		em.merge(emp);
//		em.getTransaction().commit();
		
		// Delete by ID
		
//		Employee emp = em.find(Employee.class, "5ea141f9-7a75-4c1b-abd7-a0f424daacaa");
//		
//		em.getTransaction().begin();
//		em.remove(emp);
//		em.getTransaction().commit();
		
		// FIND ALL
//		TypedQuery<Employee> query = em.createNamedQuery("Employee.findByEmail", Employee.class);
//		query.setParameter("pEmail", "rama.pasala@gmail.com");
//		List<Employee> employees = query.getResultList();
//		
//		for (Employee emp : employees){
//			System.err.println(emp);
//		}
		
		em.close();
		emf.close();
		
	}

}
