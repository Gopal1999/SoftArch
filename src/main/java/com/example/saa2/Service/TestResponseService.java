package com.example.saa2.Service;

import com.example.saa2.Entity.*;
import com.example.saa2.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestResponseService
{
    @Autowired
    QuestionRepo questionRepo;
    @Autowired
    QuestionResponseRepo questionResponseRepo;
    @Autowired
    TestResponseRepo testResponseRepo;

    @Autowired
    UserRepo userRepo;

    @Autowired
    TestRepo testRepo;
    public void saveTestResponse(TestResponse testResponse, int testId, int userId)
    {
        User user = userRepo.findById(userId).get();
        Test test = testRepo.findById(testId).get();
        testResponse.setTest(test);
        testResponse.setUser(user);
        testResponseRepo.save(testResponse);
        TestResponse testResponse1 = fetchResponseByUseridAndTestId(userId, testId);
        QuestionResponse questionResponse = new QuestionResponse();

        List<QuestionResponse> list = testResponse.getQuestionResponses();
        for(QuestionResponse obj:list)
        {
            Question question = questionRepo.findById(obj.getQuestionid()).get();
            questionResponse = new QuestionResponse();
            questionResponse.setQuestionid(obj.getQuestionid());
            questionResponse.setResponse(obj.getResponse());
            questionResponse.setTestResponse(testResponse1);
            questionResponse.setQuestion(question.getQuestion());
            questionResponse.setAnswer(question.getAnswer());
            System.out.println(questionResponse.getQuestionid());
            System.out.println(questionResponse.getResponse());
            System.out.println(questionResponse.getTestResponse().getTestResponse_id());
            System.out.println(questionResponse.getQuestion());
            System.out.println(questionResponse.getAnswer());
            questionResponseRepo.save(questionResponse);

        }
    }

    public TestResponse fetchResponseByUseridAndTestId(int userId, int testId)
    {
        User user = userRepo.findById(userId).get();
        Test test = testRepo.findById(testId).get();
        return testResponseRepo.findByTestAndUser(test, user);
    }

    public List<TestResponse> getAllResponse(int testId)
    {
        Test test = testRepo.findById(testId).get();
        return testResponseRepo.findByTest(test);
    }
}
