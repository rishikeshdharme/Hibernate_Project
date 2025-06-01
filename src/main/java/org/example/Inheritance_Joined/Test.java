package org.example.Inheritance_Joined;

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

        Person person = new Person(1L, "John Doe", 30);
        Student student = new Student(2L, "Jane Smith", 20, 101, 95.5);
        session.save(person);
        session.save(student);
        transaction.commit();
        session.close();
    }
}
