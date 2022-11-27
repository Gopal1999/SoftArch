package com.example.saa2.Controller;

import com.example.saa2.Entity.Test;
import com.example.saa2.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://127.0.0.1:5500")
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

    @RequestMapping(method = RequestMethod.POST, value = "/create/{id}")
    public String createTest(@PathVariable Integer id)
    {
        testService.setTest(id);
        return "Test created";
    }
}
