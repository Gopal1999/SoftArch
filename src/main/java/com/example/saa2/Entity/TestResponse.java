package com.example.saa2.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class TestResponse
{
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int testResponse_id;

    @OneToOne
    private User user;

    @OneToOne
    private Test test;

    @Column
    private int status;

    @Column
    private boolean submissionstatus;

    @OneToMany(mappedBy = "testResponse")
    private List<ItemResponse> itemResponses;

    public TestResponse()
    {

    }

    public TestResponse(int testResponse_id, User user, Test test, int status, boolean submissionstatus, List<ItemResponse> itemResponses) {
        this.testResponse_id = testResponse_id;
        this.user = user;
        this.test = test;
        this.status = status;
        this.submissionstatus = submissionstatus;
        this.itemResponses = itemResponses;
    }

    public int getTestResponse_id() {
        return testResponse_id;
    }

    public void setTestResponse_id(int testResponse_id) {
        this.testResponse_id = testResponse_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isSubmissionstatus() {
        return submissionstatus;
    }

    public void setSubmissionstatus(boolean submissionstatus) {
        this.submissionstatus = submissionstatus;
    }

    public List<ItemResponse> getItemResponses() {
        return itemResponses;
    }

    public void setItemResponses(List<ItemResponse> itemResponses) {
        this.itemResponses = itemResponses;
    }
}
