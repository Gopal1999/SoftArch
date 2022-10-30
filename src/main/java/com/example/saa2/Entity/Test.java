package com.example.saa2.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Test
{
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int test_id;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "test")
    private List<Section> sections;

    public Test()
    {

    }

    public Test(int test_id, User user, List<Section> sections) {
        this.test_id = test_id;
        this.user = user;
        this.sections = sections;
    }

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
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
}
