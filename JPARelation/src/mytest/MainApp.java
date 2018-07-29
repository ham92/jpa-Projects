package mytest;

import javax.persistence.EntityManager;

import org.h2.engine.User;

//import entities.Employee;

/**
 * @author imssbora
 */
public class MainApp {
  public static void main(String[] args) {
	  
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    entityManager.getTransaction().begin();

    // Check database version
    String sql = "select 1 as TEST";

    int result = (Integer) entityManager.createNativeQuery(sql).getSingleResult();
    System.out.println("The result test is: " + result);

    entityManager.getTransaction().commit();
    entityManager.close();

    JPAUtil.shutdown();
  }
}
