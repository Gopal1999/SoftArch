package com.example.saa2.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class TestResponse
{
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "testResponse")
    private List<Section> sections;

    @ManyToOne
    private Test test;


    public TestResponse()
    {

    }

    public TestResponse(int id, User user, List<Section> sections) {
        this.id = id;
        this.user = user;
        this.sections = sections;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
