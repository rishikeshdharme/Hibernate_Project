package org.example.OneToOneDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Department department = new Department(1, "Sales");
        Employee1 employee = new Employee1(3L, "Remestudio");
        employee.setDepartment(department);
        department.setEmployee(employee);
        session.save(department);
        session.save(employee);
        transaction.commit();
        session.close();
    }
}
