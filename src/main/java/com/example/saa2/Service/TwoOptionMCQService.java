package com.example.saa2.Service;

import com.example.saa2.Entity.TwoOptionMCQ;
import com.example.saa2.Repository.TwoOptionMCQRepo;
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
}
