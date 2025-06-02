package org.example.OneToOneDemo;

import javax.persistence.*;

@Entity
@Table(name = "Emp_Department")
public class Department {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private int did;

    private String dname;

    @OneToOne(mappedBy = "department")
    private Employee1 employee;


    public Department() {
    }

    public Department(int did, String dname) {
        this.did = did;
        this.dname = dname;
    }


    public Employee1 getEmployee() {
        return employee;
    }

    public void setEmployee(Employee1 employee) {
        this.employee = employee;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
