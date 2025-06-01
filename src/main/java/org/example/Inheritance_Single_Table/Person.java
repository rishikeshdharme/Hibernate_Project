package org.example.Inheritance_Single_Table;

import javax.persistence.*;

@Entity
@Table(name = "person_single_table")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "person_type", discriminatorType = DiscriminatorType.STRING)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
