package org.example.HiberbateWithAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.xml.crypto.dsig.Transform;

public class UpdateEmployee {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Query<Employee> query = session.createQuery("update Employee set name=:name where id=:id");
        query.setParameter("name", "Shera Khan");
        query.setParameter("id", 2);
        int result = query.executeUpdate();
        if (result > 0) {
            System.out.println("Employee updated successfully!");
            Query<Employee> fetchQuery = session.createQuery("FROM Employee ", Employee.class);
           for(Employee employee : fetchQuery.list()) {
                System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Department: " + employee.getDepartment());
            }
        } else {
            System.out.println("No employee found with the given ID.");
        }
        transaction.commit();
        session.close();

    }
}
