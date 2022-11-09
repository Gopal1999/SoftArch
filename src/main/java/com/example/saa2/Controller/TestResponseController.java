package com.example.saa2.Controller;

import com.example.saa2.Entity.Question;
import com.example.saa2.Entity.TestResponse;
import com.example.saa2.Entity.User;
import com.example.saa2.Repository.TestRepo;
import com.example.saa2.Repository.UserRepo;
import com.example.saa2.Service.TestResponseService;
import com.example.saa2.Service.TestService;
import com.example.saa2.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/response")
public class TestResponseController
{


    @Autowired
    TestResponseService testResponseService;

    @Autowired
    TestService testService;

    @Autowired
    UserService userService;
    @RequestMapping(method = RequestMethod.POST, value = "/submit/{testid}/{userid}")
    public String submitResponse(@RequestBody TestResponse testResponse, @PathVariable Integer testid, @PathVariable Integer userid)
    {
        //This class will store the response of Student and return the submission status.
        //Test test = testService.getTest(id);
//        TestResponse testResponse = new TestResponse();
//        testResponse.setTest(test);
//        testResponse.setUserId(userid);
        System.out.println(testResponse);
        testResponseService.saveTestResponse(testResponse, testid, userid);
        return "Test Response Saved";

    }

    @RequestMapping(method = RequestMethod.GET, value = "/fetch/{testId}/{userId}")
    public TestResponse getResponseByUser(@PathVariable Integer testId, @PathVariable Integer userId)
    {
        //This class will return the List of student responses for the provided section_id and test_id.
        return testResponseService.fetchResponseByUseridAndTestId(userId, testId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{testId}/fetchAll")
    public List<TestResponse> getAllResponses(@PathVariable Integer testId)
    {
        //This class will return the List of student responses for the provided section_id and test_id.
        return testResponseService.getAllResponse(testId);
    }

}
