package org.example.ManyToManyDemo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students_many_to_many")
public class Students {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public Students(Long id, String name,String email) {
        this.email = email;
        this.id = id;
        this.name = name;
    }

    public Students(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "students_courses",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Courses> courses;

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    // Getters and Setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
