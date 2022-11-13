package com.example.testmanagementservice.Service;


import com.example.testmanagementservice.Entity.NAT;
import com.example.testmanagementservice.Repository.NATRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NATService
{
    @Autowired
    NATRepo natRepo;

    public void addQuestion(NAT nat)
    {
        natRepo.save(nat);
    }

    public NAT findQuestion(int id)
    {
        return natRepo.findById(id).get();
    }

    public boolean isQuestionExist(int id)
    {
        if(natRepo.findById(id).isEmpty())
        {
            return false;
        }
        return true;
    }
}
