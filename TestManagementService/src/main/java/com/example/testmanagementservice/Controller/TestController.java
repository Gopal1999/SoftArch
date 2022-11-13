package com.example.testmanagementservice.Controller;

import com.example.testmanagementservice.Entity.Test;
import com.example.testmanagementservice.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController
{
    @Autowired
    TestService testService;

    @RequestMapping(method = RequestMethod.GET, value = "/get/{id}")
    public Test getTest(@PathVariable Integer id)
    {
        return testService.getTest(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/create/{id}")
    public String createTest(@PathVariable Integer id)
    {
        testService.setTest(id);
        return "Test created";
    }

}
