package org.example.OneToManyDemo;

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

        User user = new User(1, "Eagle");
        Videos video1 = new Videos(1, "Java Tutorial", user);
        Videos video2 = new Videos(2, "Python Tutorial", user);
        Videos video3 = new Videos(3, "JavaScript Tutorial", user);

        session.save(user);
        session.save(video1);
        session.save(video2);
        session.save(video3);
        transaction.commit();
        session.close();



    }
}
