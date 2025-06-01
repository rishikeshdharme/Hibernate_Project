package org.example.Inheritance_Table_Per_Class;

import javax.persistence.*;

@Entity
@Table(name = "person_table_per_class")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private double age;

    public Person() {
    }

    public Person(Long id, String name, double age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
