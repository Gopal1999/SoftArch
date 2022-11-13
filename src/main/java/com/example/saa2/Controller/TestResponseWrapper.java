package com.example.saa2.Controller;

import com.example.saa2.Entity.TestResponse;

import java.util.ArrayList;
import java.util.List;

public class TestResponseWrapper
{
    private List<TestResponse> testResponseList = new ArrayList<TestResponse>();

    public TestResponseWrapper()
    {

    }

    public List<TestResponse> getTestResponseList() {
        return testResponseList;
    }
}
