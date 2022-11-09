package com.example.saa2.Service;

import com.example.saa2.Entity.FourOptionMCQ;
import com.example.saa2.Repository.FourOptionRepoMCQ;
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
}
