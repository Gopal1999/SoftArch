package com.example.saa2.Controller;

import com.example.saa2.Entity.TestResponse;
import com.example.saa2.Entity.User;
import com.example.saa2.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String check()
    {
        return "Hello";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String authenticateUser(@RequestBody User user)
    {
        int status;
        if(user.getUsername().isEmpty())
        {
            status = userService.loginbyEmail(user);
        }
        else
        {
            status = userService.loginByUsername(user);
        }
        if(status==0)
        {
            return "Invalid Credentials";
        }
        if(status==2)
        {
            return "Already Logged In";
        }
        return "Login Successful";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/submit")
    public String submitResponse(@RequestBody TestResponse testResponse)
    {
        //This class will store the response of Student and return the submission status.
    }

    @RequestMapping(method = RequestMethod.GET, value = "/fetchResponse")
    public List<TestResponse> getResponse(@RequestParam Integer section_id, Integer test_id)
    {
        //This class will return the List of student responses for the provided section_id and test_id.
    }

}
