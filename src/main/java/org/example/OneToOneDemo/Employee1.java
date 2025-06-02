package org.example.OneToOneDemo;

import javax.persistence.*;

@Entity
@Table(name = "employee1")
public class Employee1 {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id", referencedColumnName = "did")
    private Department department;

    public Employee1() {
    }

    public Employee1(Long id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Employee1(Long id, String name) {
        this.id = id;
        this.name = name;

    }



    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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

