package com.example.saa2.Service;

import com.example.saa2.Entity.ThreeOptionMCQ;
import com.example.saa2.Entity.TwoOptionMCQ;
import com.example.saa2.Repository.ThreeOptionMCQRepo;
import com.example.saa2.Repository.TwoOptionMCQRepo;
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
}
