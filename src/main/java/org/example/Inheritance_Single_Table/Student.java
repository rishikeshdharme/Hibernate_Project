package org.example.Inheritance_Single_Table;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "student_single_table")
@DiscriminatorValue("value_student")
public class Student extends Person {

    private int rollNumber;
    private double marks;

    public Student() {
    }

    public Student(Long id, String name, double age, int rollNumber, double marks) {
        super(id, name, age);
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
