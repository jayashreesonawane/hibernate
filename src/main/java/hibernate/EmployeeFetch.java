package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeFetch {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shree");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Employee employee= entityManager.find(Employee.class, 1);
		if (employee!=null) {
			System.out.println(employee);
		}
		else
		{
			System.out.println("Employee with the given id is not found");
		}
		
	}
}
