package com.example.testmanagementservice.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class QuestionResponse
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int questionResponse_id;

    private int questionid;


    private String response;

    private String question;

    private String answer;

    @ManyToOne@JsonIgnore
    TestResponse testResponse;


    public QuestionResponse()
    {

    }

    public QuestionResponse(int questionResponse_id, int questionid, String question, String answer, String response, TestResponse testResponse) {
        this.questionResponse_id = questionResponse_id;
        this.questionid = questionid;
        this.question = question;
        this.answer = answer;
        this.response = response;
        this.testResponse = testResponse;
    }

    public int getQuestionResponse_id() {
        return questionResponse_id;
    }

    public void setQuestionResponse_id(int questionResponse_id) {
        this.questionResponse_id = questionResponse_id;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public int getQuestionid() {
        return questionid;
    }

    public void setQuestionid(int questionid) {
        this.questionid = questionid;
    }

    public TestResponse getTestResponse() {
        return testResponse;
    }

    public void setTestResponse(TestResponse testResponse) {
        this.testResponse = testResponse;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
