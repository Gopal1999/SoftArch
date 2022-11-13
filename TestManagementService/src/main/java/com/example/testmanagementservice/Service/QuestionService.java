package com.example.testmanagementservice.Service;

import com.example.testmanagementservice.Entity.Question;
import com.example.testmanagementservice.Repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService
{
    @Autowired
    QuestionRepo questionRepo;

    public Question findQuestion(int questionid)
    {
        return questionRepo.findById(questionid).get();
    }
}
