package org.example.Inheritance_Table_Per_Class;

import javax.persistence.*;

@Entity
@Table(name = "student_table_per_class")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "student_id")),
        @AttributeOverride(name = "name", column = @Column(name = "student_name")),
        @AttributeOverride(name = "age", column = @Column(name = "student_age"))
})
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
