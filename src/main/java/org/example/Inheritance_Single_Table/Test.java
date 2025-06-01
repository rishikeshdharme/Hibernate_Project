package org.example.Inheritance_Single_Table;

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
        Person person = new Person(3L, "Yash", 30);
        Student student = new Student(1L, "El dorado", 35, 102, 89);
        Teacher teacher = new Teacher(2L, "John Doe", 40, "Mathematics", 50000);
        session.save(person);
        session.save(student);
        session.save(teacher);
        transaction.commit();
        session.close();
    }
}
