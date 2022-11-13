package com.example.saa2.Entity;

//import com.example.saa2.Entity.Interfaces.MCQType;

import javax.persistence.Column;
import javax.persistence.Entity;

//public class FourOptionMCQ implements MCQType
//{
//    private String Option1;
//    private String Option2;
//    private String Option3;
//    private String Option4;
//    private String correctAnswer;
//
//    public String getOption1() {
//        return Option1;
//    }
//
//    public void setOption1(String option1) {
//        Option1 = option1;
//    }
//
//    public String getOption2() {
//        return Option2;
//    }
//
//    public void setOption2(String option2) {
//        Option2 = option2;
//    }
//
//    public String getOption3() {
//        return Option3;
//    }
//
//    public void setOption3(String option3) {
//        Option3 = option3;
//    }
//
//    public String getOption4() {
//        return Option4;
//    }
//
//    public void setOption4(String option4) {
//        Option4 = option4;
//    }
//
//    @Override
//    public String getCorrectAnswer() {
//        return correctAnswer;
//    }
//
//    public void setCorrectAnswer(String correctAnswer) {
//        this.correctAnswer = correctAnswer;
//    }
//
//
//}
@Entity
public class FourOptionMCQ extends MCQ
{
    @Column(nullable = false)
    private String Option1;
    @Column(nullable = false)
    private String Option2;
    @Column(nullable = false)
    private String Option3;
    @Column(nullable = false)
    private String Option4;

    public FourOptionMCQ()
    {

    }

    public String getOption1() {
        return Option1;
    }

    public void setOption1(String option1) {
        Option1 = option1;
    }

    public String getOption2() {
        return Option2;
    }

    public void setOption2(String option2) {
        Option2 = option2;
    }

    public String getOption3() {
        return Option3;
    }

    public void setOption3(String option3) {
        Option3 = option3;
    }

    public String getOption4() {
        return Option4;
    }

    public void setOption4(String option4) {
        Option4 = option4;
    }

    @Override
    public String toString() {
        return "FourOptionMCQ{" +
                "Option1='" + Option1 + '\'' +
                ", Option2='" + Option2 + '\'' +
                ", Option3='" + Option3 + '\'' +
                ", Option4='" + Option4 + '\'' +
                '}';
    }
}