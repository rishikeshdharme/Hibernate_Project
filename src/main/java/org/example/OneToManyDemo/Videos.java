package org.example.OneToManyDemo;

import javax.persistence.*;

@Entity
@Table(name = "videos")
public class Videos {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private int videoId;


    private String videoName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public Videos(int videoId, String videoName, User user) {
        this.videoId = videoId;
        this.videoName = videoName;
        this.user = user;
    }
    public Videos() {
    }

    public Videos(int videoId, String videoName) {
        this.videoId = videoId;
        this.videoName = videoName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }
}
