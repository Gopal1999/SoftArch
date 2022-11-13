package com.example.responsemanagementservicde.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Test {
    @Id
    private int test_id;

    @OneToMany(mappedBy = "test")
    @JsonIgnore
    List<TestResponse> testResponses = new ArrayList<TestResponse>();

    @OneToMany(mappedBy = "test")
    private List<Question> questions = new ArrayList<Question>();

    public Test()
    {

    }

    public Test(int test_id, List<TestResponse> testResponses, List<Question> questions) {
        this.test_id = test_id;
        this.testResponses = testResponses;
        this.questions = questions;
    }

    public List<TestResponse> getTestResponses() {
        return testResponses;
    }

    public void setTestResponses(List<TestResponse> testResponses) {
        this.testResponses = testResponses;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }

//    public List<TestResponse> getItems() {
//        return items;
//    }
//
//    public void setItems(List<TestResponse> items) {
//        this.items = items;
//    }

    public void addQuestion(Question question)
    {
        questions.add(question);
    }


}