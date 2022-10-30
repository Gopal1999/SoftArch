package com.example.saa2.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Test
{
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(mappedBy = "test")
    private List<TestResponse> testResponseList;

    public Test()
    {

    }

    public Test(int id, List<TestResponse> testResponseList) {
        this.id = id;
        this.testResponseList = testResponseList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<TestResponse> getTestResponseList() {
        return testResponseList;
    }

    public void setTestResponseList(List<TestResponse> testResponseList) {
        this.testResponseList = testResponseList;
    }
}
