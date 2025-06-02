package org.example.HibernateCrud.Service;

import org.example.HibernateCrud.Entity.Laptop;
import org.example.HibernateCrud.SessionFactoryDb.SessionFactoryDB;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class LaptopServiceImp implements LaptopService {

    SessionFactory sessionFactory;
    Session session;
    Transaction tx;


    public LaptopServiceImp(){
        sessionFactory= SessionFactoryDB.getSessionFactory();
        session = sessionFactory.openSession();
        tx  = session.beginTransaction();
    }

    @Override
    public void addLaptop(Laptop laptop) {
       int ex = (int) session.save(laptop);

       if(ex>0){
              System.out.println("Laptop added successfully");
         } else {
              System.out.println("Failed to add laptop");
       }
       tx.commit();
        session.close();

    }

    @Override
    public List<Laptop> getAllLaptops() {
        return session.createQuery("from Laptop").list();
    }

    @Override
    public void deleteLaptop(int id) {

        Laptop laptop1 = session.get(Laptop.class, id); // ✅ fetch from DB, not create manually
        if (laptop1 != null) {
            session.delete(laptop1);
            System.out.println("Laptop deleted");
        } else {
            System.out.println("Laptop not found");
        }
        tx.commit();

    }

    @Override
    public void updateLaptop(Laptop laptop) {

        Laptop dbLaptop = session.get(Laptop.class, laptop.getLid());
        dbLaptop.setBrand(laptop.getBrand());
        dbLaptop.setPrice(laptop.getPrice());
        session.update(dbLaptop);
        tx.commit();


    }
}
