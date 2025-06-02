package org.example.ManyToManyDemo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Students student1 = new Students("John Doe", "john@gmail.com");
        Students student2 = new Students("Jane Smith", "janesmith@gmail.com");
        Students student3 = new Students("Alice Johnson", "alice@gmail.com");

        Courses course1 = new Courses("Java Programming", "Learn Java from scratch");
        Courses course2 = new Courses( "Database Management", "Learn about databases and SQL");
        Courses course3 = new Courses("Web Development", "Learn HTML, CSS, and JavaScript");
        Courses course4 = new Courses( "Data Structures", "Learn about data structures and algorithms");

        student1.setCourses(List.of(course1, course2,course3));
        student2.setCourses(Arrays.asList(course1, course2, course4));
        student3.setCourses(List.of(course2, course3, course4));
        course1.setStudents(List.of(student1, student2));
        course2.setStudents(Arrays.asList(student1, student2, student3));
        course3.setStudents(List.of(student1, student3));
        course4.setStudents(List.of(student2, student3));
        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(course1);
        session.save(course2);
        session.save(course3);
        session.save(course4);
        transaction.commit();
        session.close();
    }
}
