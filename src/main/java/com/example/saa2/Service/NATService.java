package com.example.saa2.Service;

import com.example.saa2.Entity.NAT;
import com.example.saa2.Repository.NATRepo;
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
}
