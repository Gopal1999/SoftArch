package com.example.saa2.Entity;

import com.example.saa2.Entity.Interfaces.ItemType;

import javax.persistence.*;
import java.util.List;

@Entity
public class MCQ implements ItemType
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String question;
    private String answer;

    @Transient
    private List<String> options;

    public MCQ()
    {

    }

    public void addOption(String value)
    {
        this.options.add(value);
    }

    public void setAnswer(int id)
    {
        answer = this.options.get(id-1);
    }

    @Override
    public void setQuestion(String question)
    {
        this.question = question;
    }


    @Override
    public String getAnswer()
    {
        return answer;
    }

}
