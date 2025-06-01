package org.example.Inheritance_Table_Per_Class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tset {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Person person = new Person(3L, "Yash", 30);
        Student student = new Student(1L,"El dorado",35,102,89);
        session.save(person);
        session.save(student);
        transaction.commit();
        session.close();
    }

}
