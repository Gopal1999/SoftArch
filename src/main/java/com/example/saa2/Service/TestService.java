package com.example.saa2.Service;

import com.example.saa2.Entity.Test;
import com.example.saa2.Repository.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService
{
    @Autowired
    TestRepo testRepo;
    public Test getTest(int test_id)
    {
        return testRepo.findById(test_id).get();
    }

    public void setTest(int id)
    {
        Test test = new Test();
        test.setTest_id(id);
        testRepo.save(test);
    }
}
