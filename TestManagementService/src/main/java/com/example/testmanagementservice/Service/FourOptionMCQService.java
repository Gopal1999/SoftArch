package com.example.testmanagementservice.Service;

import com.example.testmanagementservice.Entity.FourOptionMCQ;
import com.example.testmanagementservice.Repository.FourOptionRepoMCQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FourOptionMCQService
{
    @Autowired
    FourOptionRepoMCQ fourOptionRepoMCQ;

    public void addQuestion(FourOptionMCQ fourOptionMCQ)
    {
        fourOptionRepoMCQ.save(fourOptionMCQ);
    }

    public FourOptionMCQ findQuestion(int id)
    {
        return fourOptionRepoMCQ.findById(id).get();
    }

    public boolean isQuestionExist(int id)
    {
        if(fourOptionRepoMCQ.findById(id).isEmpty())
        {
            return false;
        }
        return true;
    }
}
