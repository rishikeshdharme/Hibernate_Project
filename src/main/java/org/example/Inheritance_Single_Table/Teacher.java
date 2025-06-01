package org.example.Inheritance_Single_Table;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "teacher_single_table")
@DiscriminatorValue("value_teacher")
public class Teacher extends Person {

    private String subject;
    private double salary;

    public Teacher() {
    }

    public Teacher(Long id, String name, double age, String subject, double salary) {
        super(id, name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
