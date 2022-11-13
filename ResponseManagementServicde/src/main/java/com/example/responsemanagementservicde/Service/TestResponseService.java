package com.example.responsemanagementservicde.Service;

import com.example.responsemanagementservicde.Entity.*;
import com.example.responsemanagementservicde.Repository.QuestionResponseRepo;
import com.example.responsemanagementservicde.Repository.TestResponseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TestResponseService
{
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    QuestionResponseRepo questionResponseRepo;
    @Autowired
    TestResponseRepo testResponseRepo;

//    @Autowired
//    UserRepo userRepo;
//
//    @Autowired
//    TestRepo testRepo;

    public User getUser(int userid)
    {
        return restTemplate.getForObject("http://localhost:8082/user/get/"+String.valueOf(userid), User.class);
    }

    public Test getTest(int testId)
    {
        return restTemplate.getForObject("http://localhost:8083/test/get/"+String.valueOf(testId), Test.class);
    }

    public void saveTestResponse(TestResponse testResponse, int testId, int userId)
    {
//        User user = userRepo.findById(userId).get();
//        Test test = testRepo.findById(testId).get();
        User user = getUser(userId);
        System.out.println(user);
        Test test = getTest(testId);
        System.out.println(test);
        testResponse.setUser(user);
        testResponse.setTest(test);
        testResponseRepo.save(testResponse);
        TestResponse testResponse1 = fetchResponseByUseridAndTestId(userId, testId);
        QuestionResponse questionResponse;

        List<QuestionResponse> list = testResponse.getQuestionResponses();
        for(QuestionResponse obj:list)
        {
            System.out.println(obj.getQuestionid());

            Question question = restTemplate.getForObject("http://localhost:8083/question/get/"+String.valueOf(obj.getQuestionid()), Question.class);
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
        User user = getUser(userId);
        Test test = getTest(testId);

        TestResponse testResponse = testResponseRepo.findByTestAndUser(test, user);
        System.out.println(testResponse);
        return testResponse;
    }

    public List<TestResponse> getAllResponse(int testId)
    {
        Test test = restTemplate.getForObject("http://localhost:8083/test/get/"+String.valueOf(testId), Test.class);
        return testResponseRepo.findByTest(test);
    }
}
