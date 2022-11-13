package com.example.testmanagementservice.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;

//public class ThreeOptionMCQ implements MCQType
//{
//    private String Option1;
//    private String Option2;
//    private String Option3;
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
public class ThreeOptionMCQ extends MCQ
{
    @Column(nullable = false)
    private String Option1;
    @Column(nullable = false)
    private String Option2;
    @Column(nullable = false)
    private String Option3;

    public ThreeOptionMCQ()
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
}