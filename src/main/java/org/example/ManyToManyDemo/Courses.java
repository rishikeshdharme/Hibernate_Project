package org.example.ManyToManyDemo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses_many_to_many")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    public Courses(){

    }
    public Courses(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Courses(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    @ManyToMany(mappedBy = "courses",cascade = CascadeType.ALL)
    private List<Students> students;

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
