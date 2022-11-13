package com.example.usermanagementservice.Entity;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//public class MCQ implements ItemType
//{
//    @Id@GeneratedValue(strategy = GenerationType.AUTO)
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
//    private MCQType mcqType;
//    public void setMCQType(int optionCount)
//    {
//        if(optionCount==2)
//        {
//            mcqType = new TwoOptionMCQ();
//        }
//        if (optionCount==3)
//        {
//            mcqType = new ThreeOptionMCQ();
//        }
//        if(optionCount==4)
//        {
//            mcqType = new FourOptionMCQ();
//        }
//    }
//
//    @Override
//    public void setQuestion(String question)
//    {
//        this.question = question;
//    }
//
//    public void setCorrectAnswer()
//    {
//        this.correctAnswer = mcqType.getCorrectAnswer();
//    }
//}
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class MCQ extends Question
{

}