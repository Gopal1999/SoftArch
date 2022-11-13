package com.example.testmanagementservice.Service;

import com.example.testmanagementservice.Entity.ThreeOptionMCQ;
import com.example.testmanagementservice.Repository.ThreeOptionMCQRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThreeOptionMCQService
{
    @Autowired
    ThreeOptionMCQRepo threeOptionMCQRepo;

    public void addQuestion(ThreeOptionMCQ threeOptionMCQ)
    {
        threeOptionMCQRepo.save(threeOptionMCQ);
    }

    public ThreeOptionMCQ findQuestion(int id)
    {
        return threeOptionMCQRepo.findById(id).get();
    }

    public boolean isQuestionExist(int id)
    {
        if(threeOptionMCQRepo.findById(id).isEmpty())
        {
            return false;
        }
        return true;
    }
}
