package com.example.testmanagementservice.Entity;

//import com.example.saa2.Entity.Interfaces.ItemType;

import javax.persistence.Entity;

//@Entity
//public class NAT implements ItemType
//{
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;
//
//    @Column(nullable = false)
//    private String question;
//
//    @Column(nullable = true)
//    private String markedAnswer;
//
//    @Column(nullable = true)
//    private String correctAnswer;
//
//    public NAT()
//    {
//
//    }
//
//    public NAT(int id, String question, String markedAnswer, String correctAnswer) {
//        this.id = id;
//        this.question = question;
//        this.markedAnswer = markedAnswer;
//        this.correctAnswer = correctAnswer;
//    }
//
//    @Override
//    public void setQuestion(String question)
//    {
//        this.question = question;
//    }
//
//    public void setCorrectAnswer(String answer)
//    {
//        this.correctAnswer = answer;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getQuestion() {
//        return question;
//    }
//
//    public String getMarkedAnswer() {
//        return markedAnswer;
//    }
//
//    public void setMarkedAnswer(String markedAnswer) {
//        this.markedAnswer = markedAnswer;
//    }
//
//    public String getCorrectAnswer() {
//        return correctAnswer;
//    }
//}
@Entity
public class NAT extends Question
{
    public NAT()
    {

    }
}
