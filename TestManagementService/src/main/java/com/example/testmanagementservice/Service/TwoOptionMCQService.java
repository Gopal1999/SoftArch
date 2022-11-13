package com.example.testmanagementservice.Service;

import com.example.testmanagementservice.Entity.TwoOptionMCQ;
import com.example.testmanagementservice.Repository.TwoOptionMCQRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TwoOptionMCQService
{
    @Autowired
    TwoOptionMCQRepo twoOptionMCQRepo;

    public void addQuestion(TwoOptionMCQ twoOptionMCQ)
    {
        twoOptionMCQRepo.save(twoOptionMCQ);
    }

    public TwoOptionMCQ findQuestion(int id)
    {
       return twoOptionMCQRepo.findById(id).get();
    }

    public boolean isQuestionExist(int id)
    {
        if(twoOptionMCQRepo.findById(id).isEmpty())
        {
            return false;
        }
        return true;
    }
}
