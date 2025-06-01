package org.example.HiberbateWithAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DeleteEmployee {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session sesssion = sessionFactory.openSession();

        Transaction transaction = sesssion.beginTransaction();

        Query<Employee> query = sesssion.createQuery("delete from Employee where id=:id");
        query.setParameter("id", 2);

        int result = query.executeUpdate();

        if (result > 0) {
            System.out.println("Employee deleted successfully!");
        } else {
            System.out.println("No employee found with the given ID.");
        }
    }
}
