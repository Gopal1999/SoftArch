package com.example.saa2.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TestResponse
{
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int testResponse_id;


    @ManyToOne@JsonIgnore
    private Test test;

    @OneToOne@JsonIgnore
    private User user;

    @OneToMany(mappedBy = "testResponse")
    List<QuestionResponse> questionResponses = new ArrayList<QuestionResponse>();


    public TestResponse()
    {

    }

    public TestResponse(int testResponse_id, Test test, User user, List<QuestionResponse> questionResponses) {
        this.testResponse_id = testResponse_id;
        this.test = test;
        this.user = user;
        this.questionResponses = questionResponses;
    }

    public int getTestResponse_id() {
        return testResponse_id;
    }

    public void setTestResponse_id(int testResponse_id) {
        this.testResponse_id = testResponse_id;
    }
//

//
//    public Test getTest() {
//        return test;
//    }
//
//    public void setTest(Test test) {
//        this.test = test;
//    }

//
//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }


    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<QuestionResponse> getQuestionResponses() {
        return questionResponses;
    }

    public void setQuestionResponses(List<QuestionResponse> questionResponses) {
        this.questionResponses = questionResponses;
    }

    @Override
    public String toString() {
        return "TestResponse{" +
                "testResponse_id=" + testResponse_id +
                ", test=" + test +
                ", user=" + user +
                ", questionResponses=" + questionResponses +
                '}';
    }
}
