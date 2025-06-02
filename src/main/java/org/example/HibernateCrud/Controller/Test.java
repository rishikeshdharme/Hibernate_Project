package org.example.HibernateCrud.Controller;

import org.example.HibernateCrud.Entity.Laptop;
import org.example.HibernateCrud.Service.LaptopServiceImp;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        LaptopServiceImp laptopService = new LaptopServiceImp();
        char ch = ' ';
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hello, Hibernate CRUD Example!");
            System.out.println("Enter  choice what you want to do:");
            System.out.println("1. Add Laptop");
            System.out.println("2. Get All Laptops");
            System.out.println("3. Delete Laptop");
            System.out.println("4. Update Laptop");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Laptop Brand:");
                    String brand = sc.next();
                    System.out.println("Enter Laptop Price:");
                    double price = sc.nextDouble();

                    laptopService.addLaptop(new Laptop(brand, price));

                    break;
                case 2:
                    List<Laptop> laptops = laptopService.getAllLaptops();
                    for (Laptop elap : laptops) {
                        System.out.println(elap);
                    }
                    break;
                case 3:
                    System.out.println("Enter Laptop ID :");
                    int lid = sc.nextInt();


                    laptopService.deleteLaptop(lid);
                    System.out.println("Laptop deleted");


                    break;
                case 4:
                    System.out.println("Enter Laptop ID to update:");
                    int updateLid = sc.nextInt();
                    System.out.println("Enter new Laptop Brand:");
                    String newBrand = sc.next();
                    System.out.println("Enter new Laptop Price:");
                    double newPrice = sc.nextDouble();

                    Laptop laptopToUpdate = new Laptop(updateLid, newBrand, newPrice);
                    laptopService.updateLaptop(laptopToUpdate);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Do u want to perform more if yes press 'Y' or 'y'");
            ch = sc.next().charAt(0);
        }while(ch=='Y'||ch=='y');
    }
}
