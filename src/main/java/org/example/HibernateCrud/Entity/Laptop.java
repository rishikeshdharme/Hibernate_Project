package org.example.HibernateCrud.Entity;

import javax.persistence.*;

@Entity
@Table(name = "laptop")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lid;
    private String brand;
    private Double price;

    public Laptop() {
    }

    public Laptop(int lid, String brand, Double price) {
        this.lid = lid;
        this.brand = brand;
        this.price = price;
    }

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
