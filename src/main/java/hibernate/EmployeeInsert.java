package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeInsert {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setId(4);
		employee.setName("AK");
		employee.setPhone(9786543210l);
		employee.setAddress("Pune");
		employee.setEmail("ak@gmail.com");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shree");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
}
