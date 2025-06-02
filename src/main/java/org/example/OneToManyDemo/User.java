package org.example.OneToManyDemo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Videos> videos;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    public User(int id, String name, List<Videos> videos) {
        this.id = id;
        this.name = name;
        this.videos = videos;
    }

    public List<Videos> getVideos() {
        return videos;
    }
    public void setVideos(List<Videos> videos) {
        this.videos = videos;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
