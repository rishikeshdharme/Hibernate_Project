package org.example.HibernateCrud.Service;

import org.example.HibernateCrud.Entity.Laptop;

import java.util.List;

public interface LaptopService {

    public void addLaptop(Laptop laptop);
    public List<Laptop> getAllLaptops();
    public void deleteLaptop(int id);
    public void updateLaptop(Laptop laptop);
}
