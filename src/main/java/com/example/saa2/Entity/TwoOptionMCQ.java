package com.example.saa2.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;


//public class TwoOptionMCQ implements MCQType
//{
//    private String option1;
//    private String option2;
//
//    private String correctAnswer;
//
//    public String getOption1() {
//        return option1;
//    }
//
//    public void setOption1(String option1) {
//        this.option1 = option1;
//    }
//
//    public String getOption2() {
//        return option2;
//    }
//
//    public void setOption2(String option2) {
//        this.option2 = option2;
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
//}
@Entity
public class TwoOptionMCQ extends MCQ
{
    @Column(nullable = false)
    private String option1;
    @Column(nullable = false)
    private String option2;

    public TwoOptionMCQ()
    {

    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }
}
