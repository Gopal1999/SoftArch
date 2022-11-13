package com.example.saa2.Controller;

import com.example.saa2.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class Activity5Controller
{
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(method = RequestMethod.POST, value = "/user/register")
    public String register(@RequestBody User user)
    {
        String response = restTemplate.postForObject("http://localhost:8082/user/register", user, String.class);
        return response;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user/login")
    public String authenticateUser(@RequestBody User user)
    {
        String response = restTemplate.postForObject("http://localhost:8082/user/login", user, String.class);
        return response;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test/create/{id}")
    public String createTest(@PathVariable Integer id)
    {
        String response = restTemplate.getForObject("http://localhost:8083/test/create/"+String.valueOf(id), String.class);
        return response;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test/get/{id}")
    public Test getTest(@PathVariable Integer id)
    {
        Test test = restTemplate.getForObject("http://localhost:8083/test/get/" + String.valueOf(id), Test.class);
        Test testObj = new Test();
        testObj.setTest_id(test.getTest_id());
        for(Question question:test.getQuestions())
        {
            if(restTemplate.getForObject("http://localhost:8083/question/isInstance/nat/"+String.valueOf(question.getId()), Boolean.TYPE))
            {
                NAT obj = restTemplate.getForObject("http://localhost:8083/question/nat/get/"+String.valueOf(question.getId()), NAT.class);
                testObj.addQuestion(obj);
                System.out.println(obj);
            }
            if(restTemplate.getForObject("http://localhost:8083/question/isInstance/two/"+String.valueOf(question.getId()), Boolean.TYPE))
            {
                TwoOptionMCQ obj = restTemplate.getForObject("http://localhost:8083/question/two/get/"+String.valueOf(question.getId()), TwoOptionMCQ.class);
                testObj.addQuestion(obj);
                System.out.println(obj);
            }
            if(restTemplate.getForObject("http://localhost:8083/question/isInstance/three/"+String.valueOf(question.getId()), Boolean.TYPE))
            {
                ThreeOptionMCQ obj = restTemplate.getForObject("http://localhost:8083/question/three/get/"+String.valueOf(question.getId()), ThreeOptionMCQ.class);
                testObj.addQuestion(obj);
                System.out.println(obj);
            }
            if(restTemplate.getForObject("http://localhost:8083/question/isInstance/four/"+String.valueOf(question.getId()), Boolean.TYPE))
            {
                FourOptionMCQ obj = restTemplate.getForObject("http://localhost:8083/question/four/get/"+String.valueOf(question.getId()), FourOptionMCQ.class);
                testObj.addQuestion(obj);
                System.out.println(obj);
            }
            //Question obj = restTemplate.getForObject("http://localhost:8083/question/get/"+String.valueOf(question.getId()), Question.class);
            //System.out.println(obj.getClass());
        }
        return testObj;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/question/add/{id}/NAT")
    public String saveQuestion(@RequestBody NAT nat, @PathVariable Integer id)
    {
        String response = restTemplate.postForObject("http://localhost:8083/question/add/"+String.valueOf(id)+"/NAT", nat, String.class);
        return response;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/question/add/{id}/two")
    public String saveQuestion(@RequestBody TwoOptionMCQ question, @PathVariable Integer id)
    {
        String response = restTemplate.postForObject("http://localhost:8083/question/add/"+String.valueOf(id)+"/two", question, String.class);
        return response;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/question/add/{id}/three")
    public String saveQuestion(@RequestBody ThreeOptionMCQ question, @PathVariable Integer id)
    {
        String response = restTemplate.postForObject("http://localhost:8083/question/add/"+String.valueOf(id)+"/three", question, String.class);
        return response;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/question/add/{id}/four")
    public String saveQuestion(@RequestBody FourOptionMCQ question, @PathVariable Integer id)
    {
        String response = restTemplate.postForObject("http://localhost:8083/question/add/"+String.valueOf(id)+"/four", question, String.class);
        return response;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/response/submit/{testid}/{userid}")
    public String submitResponse(@RequestBody TestResponse testResponse, @PathVariable Integer testid, @PathVariable Integer userid)
    {
        String response = restTemplate.postForObject("http://localhost:8084/response/submit/"+String.valueOf(testid)+"/"+String.valueOf(userid), testResponse, String.class);
        return response;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/response/fetch/{testId}/{userId}")
    public TestResponse getResponseByUser(@PathVariable Integer testId, @PathVariable Integer userId)
    {
        TestResponse testResponse = restTemplate.getForObject("http://localhost:8084/response/fetch/"+String.valueOf(testId)+"/"+String.valueOf(userId), TestResponse.class);
        return testResponse;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/response/{testId}/fetchAll")
    public TestResponseWrapper getAllResponses(@PathVariable Integer testId)
    {
        TestResponseWrapper testResponseWrapper = restTemplate.getForObject("http://localhost:8084/response/"+String.valueOf(testId)+"/fetchall", TestResponseWrapper.class);
        return testResponseWrapper;
    }
}
