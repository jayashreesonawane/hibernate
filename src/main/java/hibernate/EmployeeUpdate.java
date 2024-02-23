package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeUpdate {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("jayashree");
		employee.setPhone(9786541230l);
		employee.setAddress("Mumbai");
		employee.setEmail("jayas@gmail.com");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shree");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Employee dbEmployee = entityManager.find(Employee.class, employee.getId());

		if (dbEmployee != null) {
			employee.setAddress("Pune");
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
		} else {
			System.out.println("Employee with the given id is not found");
		}

	}
}
