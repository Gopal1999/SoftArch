package com.example.saa2.Entity;
import com.example.saa2.Entity.Interfaces.ItemType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NAT implements ItemType
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String question;
    private double answer;

    public NAT()
    {

    }

    public NAT(int id, String question, double answer)
    {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String getAnswer() {
        return String.valueOf(answer);
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }
}
